import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

group = "dev.spozap.build_logic.convention"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
}

dependencies {
    compileOnly(libs.android.gradle.plugin)
    compileOnly(libs.kotlin.gradle.plugin)
    compileOnly(libs.compose.gradle.plugin)
    compileOnly(libs.ksp.gradle.plugin)
}

tasks {
    validatePlugins {
        enableStricterValidation = true
        failOnWarning = true
    }
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "dev.spozap.application"
            implementationClass = "dev.spozap.build_logic.convention.AndroidApplicationConventionPlugin"
        }
        register("androidApplicationCompose") {
            id = "dev.spozap.application.compose"
            implementationClass = "dev.spozap.build_logic.convention.AndroidApplicationComposeConventionPlugin"
        }
        register("androidLibrary") {
            id = "dev.spozap.library"
            implementationClass = "dev.spozap.build_logic.convention.AndroidLibraryConventionPlugin"
        }
        register("androidLibraryCompose") {
            id = "dev.spozap.library.compose"
            implementationClass = "dev.spozap.build_logic.convention.AndroidLibraryComposeConventionPlugin"
        }
        register("androidFeature") {
            id = "dev.spozap.feature"
            implementationClass = "dev.spozap.build_logic.convention.AndroidFeatureConventionPlugin"
        }
        register("hilt") {
            id = "dev.spozap.hilt"
            implementationClass = "dev.spozap.build_logic.convention.HiltConventionPlugin"
        }
    }
}