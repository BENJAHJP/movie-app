package com.example.movie

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.movie.navigation.AppNavGraph
import com.example.movie.navigation.NavigationProvider
import com.example.movie.ui.theme.MovieTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var navigationProvider: NavigationProvider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MovieTheme {
                val navController = rememberNavController()
                App(
                    navHostController = navController,
                    navigatorProvider = navigationProvider
                )
            }
        }
    }
}

@Composable
fun App(navHostController: NavHostController, navigatorProvider: NavigationProvider) {
    AppNavGraph(
        navController = navHostController,
        navigationProvider = navigatorProvider
    )
}