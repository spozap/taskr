plugins {
    alias(libs.plugins.taskr.android.library)
    alias(libs.plugins.taskr.android.library.compose)
}

android {
    namespace = "dev.spozap.taskr.core.design_system"
}

dependencies {
    api(libs.androidx.material3)
}