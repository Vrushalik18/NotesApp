plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.appusingkotlin"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.appusingkotlin"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    implementation(libs.androidx.room.common)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

//    // ROOM
//    val roomVersion = "2.6.1"
//    implementation (libs.androidx.room.runtime)
//    implementation(libs.androidx.room.compiler)
//    // Coroutines
//    implementation(libs.kotlinx.coroutines.android)
//    implementation (libs.androidx.room.ktx)
//
//    // Life Cycle Arch
//    val lifecycleVersion = "2.6.2"
//    // ViewModel
//    implementation(libs.androidx.lifecycle.viewmodel.ktx)
//    // LiveData
//    implementation(libs.androidx.lifecycle.livedata.ktx)
//    // Annotation processor
//    implementation(libs.androidx.lifecycle.compiler)
}
