package com.feature.movie.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import com.core.feature_api.FeatureApi

interface MovieNavigationApi: FeatureApi {}

class MovieNavigationApiImpl: MovieNavigationApi {
    override fun registerGraph(navController: NavHostController, navGraphBuilder: NavGraphBuilder) {
        InternalMovieFeatureNavigationApi.registerGraph(
            navController, navGraphBuilder
        )
    }
}