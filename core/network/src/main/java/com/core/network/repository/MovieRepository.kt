package com.core.network.repository

import com.core.network.dto.MovieListResponse

interface MovieRepository {
    suspend fun getMovieList(apiKey: String, query: String): MovieListResponse
}