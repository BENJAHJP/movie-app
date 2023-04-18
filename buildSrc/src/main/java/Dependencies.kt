object Version{
    const val core = "1.8.0"
}

object Deps{
    const val core = "androidx.core:core-ktx:${Version.core}"
    const val appCompat = ""
    const val androidMaterial = ""
    const val constraintLayout = ""
    const val testRunner = ""
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