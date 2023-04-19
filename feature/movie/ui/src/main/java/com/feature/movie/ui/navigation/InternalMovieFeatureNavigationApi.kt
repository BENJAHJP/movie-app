package com.feature.movie.ui.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.core.common.navigation_constants.MovieFeature
import com.core.feature_api.FeatureApi
import com.feature.movie.ui.screen.MovieScreen
import com.feature.movie.ui.screen.MovieScreenViewModel

internal object InternalMovieFeatureNavigationApi: FeatureApi {
    override fun registerGraph(
        navController: NavHostController,
        navGraphBuilder: NavGraphBuilder
    ) {
        navGraphBuilder.navigation(
            startDestination = MovieFeature.MovieScreenRoute,
            route = MovieFeature.nestedRoute,
        ){
            composable(MovieFeature.MovieScreenRoute){
                val viewModel = hiltViewModel<MovieScreenViewModel>()
                MovieScreen(viewModel)
            }
        }
    }
}