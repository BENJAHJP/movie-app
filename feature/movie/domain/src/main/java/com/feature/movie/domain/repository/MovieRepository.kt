package com.feature.movie.domain.repository

import com.feature.movie.domain.model.Movie

interface MovieRepository {
    suspend fun getMovieList(apiKey: String, query: String): List<Movie>
}