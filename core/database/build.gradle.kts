plugins {
    alias(libs.plugins.taskr.android.library)
    alias(libs.plugins.taskr.android.room)
    alias(libs.plugins.taskr.hilt)
}

android {
    namespace = "dev.spozap.taskr.core.database"
}

dependencies {
    api(projects.core.model)
}