plugins {
    alias(libs.plugins.taskr.feature)
    alias(libs.plugins.taskr.android.library.compose)
}

android {
    namespace = "dev.spozap.taskr.feature.add_task"
}