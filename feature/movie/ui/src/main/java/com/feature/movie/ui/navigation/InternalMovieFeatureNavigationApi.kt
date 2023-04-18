package com.feature.movie.ui.navigation

import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.core.common.navigation_constants.MovieFeature
import com.core.feature_api.FeatureApi

internal object InternalMovieFeatureNavigationApi: FeatureApi {
    override fun registerGraph(
        navController: androidx.navigation.NavHostController,
        navGraphBuilder: androidx.navigation.NavGraphBuilder
    ) {
        navGraphBuilder.navigation(
            startDestination = MovieFeature.MovieScreenRoute,
            route = MovieFeature.nestedRoute,
        ){

        }
    }
}