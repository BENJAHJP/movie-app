package com.core.network.data_providers

import com.core.network.MovieApi
import javax.inject.Inject

class MovieDataProviders @Inject constructor(
    private val movieApi: MovieApi
){
    suspend fun getMovieList(apiKey: String, query: String) = movieApi.getMovieList(apiKey, query)
}