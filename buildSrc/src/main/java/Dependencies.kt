object Version{
    const val core = "1.8.0"

    //jetpack compose
    const val viewModel = "2.6.0-alpha02"
    const val navigation = "2.6.0-alpha01"
    const val hiltNavigation = "1.0.0"

    //hilt
    const val hilt = "2.44.2"
    const val hiltCompiler = "1.0.0"
    const val hiltComposeNavigation = "1.0.0"

    //retrofit
    const val retrofit = "2.9.0"
    const val okhttp = "5.0.0-alpha.2"
    const val logging = "4.10.0"
}

object Deps{
    const val core = "androidx.core:core-ktx:${Version.core}"
    const val appCompat = ""
    const val androidMaterial = ""
    const val constraintLayout = ""
    const val testRunner = ""
}

// jetpack compose
object JetpackCompose {
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-compose:${Version.viewModel}"
    const val navigation = "androidx.navigation:navigation-compose:${Version.navigation}"
    const val hiltNavigation  = "androidx.hilt:hilt-navigation-compose:${Version.hiltNavigation}"
}
// dagger hilt
object DaggerHilt {
    const val hilt = "com.google.dagger:hilt-android:${Version.hilt}"
    const val hiltAndroidCompiler = "com.google.dagger:hilt-compiler:${Version.hilt}"
    const val hiltCompiler = "androidx.hilt:hilt-compiler:${Version.hiltCompiler}"
    const val hiltComposeNavigation = "androidx.hilt:hilt-navigation-compose:${Version.hiltComposeNavigation}"
}
//retrofit
object Retrofit {
    const val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofit}"
    const val gsonConverter = "com.squareup.retrofit2:converter-gson:${Version.retrofit}"
    const val okhttp = "com.squareup.okhttp3:okhttp:${Version.okhttp}"
    const val logging = "com.squareup.okhttp3:logging-interceptor:${Version.logging}"
}
object TestImplementation {
    const val kotlinxCoroutine = ""
    const val mockito = ""
}

object AndroidTestImplementation {
    const val junit = ""
    const val espresso = ""
}

object Plugins {
    const val ANDROID_LIBRARY = "com.android.library"
    const val KOTLIN_ANDROID = "org.jetbrains.kotlin.android"
    const val DAGGER_HILT = "com.google.hilt.android"
    const val KOTLIN_KAPT = "kapt"
}