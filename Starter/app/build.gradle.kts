plugins {
    id("com.android.application")
    kotlin("plugin.serialization")
    kotlin("android")
}

dependencies {
    implementation("com.google.android.material:material:1.4.0")

    implementation("com.google.accompanist:accompanist-swiperefresh:0.16.1")

    implementation("androidx.appcompat:appcompat:1.3.1")
    implementation("androidx.activity:activity-compose:1.3.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")

    implementation("androidx.compose.ui:ui:1.1.0-alpha01")
    implementation("androidx.compose.material:material:1.1.0-alpha01")
    implementation("androidx.compose.ui:ui-tooling:1.1.0-alpha01")
    implementation("androidx.compose.runtime:runtime-livedata:1.1.0-alpha01")
    implementation("androidx.navigation:navigation-compose:2.4.0-alpha06")

    implementation("io.ktor:ktor-client-android:1.6.0")
    implementation("io.ktor:ktor-client-serialization:1.6.0")
    implementation("io.ktor:ktor-client-logging:1.6.0")

    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.2.2")

    implementation("io.coil-kt:coil-compose:1.3.0")
}

android {
    compileSdkVersion(31)
    defaultConfig {
        applicationId = "com.cmota.unsplash"
        minSdkVersion(24)
        targetSdkVersion(31)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    buildFeatures {
        viewBinding = true
        compose = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.1.0-alpha01"
    }
}