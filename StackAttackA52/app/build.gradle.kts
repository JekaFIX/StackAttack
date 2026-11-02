plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "ua.stackattack.a52"
    compileSdk = 35
    defaultConfig {
        applicationId = "ua.stackattack.a52"
        minSdk = 23
        targetSdk = 28
        versionCode = 1
        versionName = "1.0"
    }
}
