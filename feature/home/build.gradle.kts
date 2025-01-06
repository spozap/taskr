plugins {
    alias(libs.plugins.taskr.android.library.compose)
    alias(libs.plugins.taskr.feature)
}

android {
    namespace = "dev.spozap.taskr.feature.home"
}