package com.core.network.repository

import com.core.network.MovieApi
import com.core.network.dto.MovieListResponse
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
    private val movieApi: MovieApi
): MovieRepository {
    override suspend fun getMovieList(apiKey: String, query: String): MovieListResponse {
        return movieApi.getMovieList(apiKey, query)
    }
}