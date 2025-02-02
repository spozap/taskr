package dev.spozap.build_logic.convention

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class AndroidFeatureConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("dev.spozap.library")
                apply("dev.spozap.hilt")
                apply("org.jetbrains.kotlin.plugin.serialization")
            }

            dependencies {
                "implementation"(project(":core:design-system"))
                "implementation"(project(":core:data"))

                "implementation"(libs.findLibrary("androidx.navigation.compose").get())
                "implementation"(libs.findLibrary("androidx.hilt.navigation.compose").get())
                "implementation"(libs.findLibrary("kotlinx.serialization.json").get())
            }

        }
    }
}