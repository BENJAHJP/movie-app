package com.feature.movie.domain.repository

interface MovieRepository {
    suspend fun getMovieList(apiKey: String, query: String):
}