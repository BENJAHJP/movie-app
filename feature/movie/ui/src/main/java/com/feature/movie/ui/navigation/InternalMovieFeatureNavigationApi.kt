package com.feature.movie.ui.navigation

import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.core.feature_api.FeatureApi

object InternalMovieFeatureNavigationApi: FeatureApi {
    override fun registerGraph(
        navController: androidx.navigation.NavHostController,
        navGraphBuilder: androidx.navigation.NavGraphBuilder
    ) {
        navGraphBuilder.navigation(
            startDestination = "movie",
            route = "MOVIE_NESTED_NAVIGATION",
        ){
            composable("movie"){

            }
        }
    }
}