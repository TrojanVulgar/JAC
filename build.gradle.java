android {
    compileSdkVersion 28
    defaultConfig {
        applicationId "com.pux0r3.helloworldc"
        minSdkVersion 28
        targetSdkVersion 28
        versionCode 1
        versionName "1.0"
        testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }
    externalNativeBuild {
        cmake {
        path file('CMakeLists.txt')
        }
    }