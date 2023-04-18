package com.core.network.repository

import com.core.network.dto.MovieListResponse

interface MovieRepository {
    suspend fun getMovieList(): MovieListResponse
}