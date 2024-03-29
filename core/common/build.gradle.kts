plugins {
    with(Plugins) {
        id(ANDROID_LIBRARY)
        id(JETBRAINS_KOTLIN_ANDROID)
    }
}

android {
    namespace = "com.makeus.core.common"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
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
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(project(":core:design"))

    with(Dependency) {
        implementation(ANDROID_CORE_KTX)
        implementation(COMPOSE_UI)
        implementation(NAVIGATION_COMPOSE)
        implementation(COMPOSE_MATERIAL)
        implementation(COROUTINES_ANDROID)
        implementation(LIFECYCLE_RUNTIME_VIEWMODEL)
        implementation(CONVERTER_GSON)
        implementation(DATASTORE)
        testImplementation(JUNIT)
        androidTestImplementation(TEST_EXT_JUNIT)
        androidTestImplementation(TEST_ESPRESSO_CORE)
    }
}