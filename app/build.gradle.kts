// build.gradle (app level)
plugins {
    id ("com.android.application")
}

android {
    namespace = ("com.kii.BakeryApp")
    compileSdk = 35

    defaultConfig {
        applicationId = "com.kii.BakeryApp"
        minSdk = 33
        targetSdk = 35
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
}

dependencies {
    implementation (libs.androidx.appcompat)
    implementation ("com.google.android.material:material:1.12.0")
    implementation ("androidx.constraintlayout:constraintlayout:2.2.0")
    implementation ("androidx.recyclerview:recyclerview:1.3.2")
    implementation ("androidx.cardview:cardview:1.0.0")
    implementation ("androidx.core:core-ktx:1.15.0")

    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.2.1")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.6.1")
}