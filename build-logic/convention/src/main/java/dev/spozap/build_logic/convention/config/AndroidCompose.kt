package dev.spozap.build_logic.convention.config

import com.android.build.api.dsl.CommonExtension
import dev.spozap.build_logic.convention.libs
import org.gradle.api.Project
import org.gradle.api.provider.Provider
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.jetbrains.kotlin.compose.compiler.gradle.ComposeCompilerGradlePluginExtension

internal fun Project.configureAndroidCompose(
    commonExtension: CommonExtension<*, *, *, *, *, *>
) {
    commonExtension.apply {
        buildFeatures {
            compose = true
        }

        dependencies {
            val bom = libs.findLibrary("androidx-compose-bom").get()
            "implementation"(platform(bom))
            "androidTestImplementation"(platform(bom))
            "implementation"(libs.findLibrary("androidx-ui-tooling-preview").get())
            "debugImplementation"(libs.findLibrary("androidx-ui-tooling").get())
        }

        extensions.configure<ComposeCompilerGradlePluginExtension> {
            fun Provider<String>.onlyIfTrue() = flatMap { provider { it.takeIf(String::toBoolean) } }
            fun Provider<*>.relativeToRootProject(dir: String) = map {
                isolated.rootProject.projectDirectory
                    .dir("build")
                    .dir(projectDir.toRelativeString(rootDir))
            }.map { it.dir(dir) }

            project.providers.gradleProperty("enableComposeCompilerMetrics").onlyIfTrue()
                .relativeToRootProject("compose-metrics")
                .let(metricsDestination::set)

            project.providers.gradleProperty("enableComposeCompilerReports").onlyIfTrue()
                .relativeToRootProject("compose-reports")
                .let(reportsDestination::set)

            stabilityConfigurationFile.set(isolated.rootProject.projectDirectory.file("compose_compiler_config.conf"))

        }
    }
}