plugins {
    alias(libs.plugins.taskr.android.library)
    alias(libs.plugins.taskr.hilt)
}

android {
    namespace = "dev.spozap.taskr.core.data"
}

dependencies {
    implementation(projects.core.database)
}