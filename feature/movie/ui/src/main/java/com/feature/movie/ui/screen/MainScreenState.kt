package com.feature.movie.ui.screen

import com.feature.movie.domain.model.Movie

data class MainScreenState(
    val isLoading: Boolean = false,
    val message: String = "",
    val movies: List<Movie> = emptyList()
)