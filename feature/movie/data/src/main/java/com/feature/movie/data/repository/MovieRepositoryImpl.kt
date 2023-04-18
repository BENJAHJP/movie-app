package com.feature.movie.data.repository

import com.core.network.data_providers.MovieDataProviders
import com.feature.movie.data.mapper.toDomainMovieList
import com.feature.movie.domain.model.Movie
import com.feature.movie.domain.repository.MovieRepository

class MovieRepositoryImpl @Inject constructor(
    private val movieDataProviders: MovieDataProviders
): MovieRepository{
    override suspend fun getMovieList(apiKey: String, query: String): List<Movie> {
        return movieDataProviders.getMovieList(apiKey, query).toDomainMovieList()
    }
}