package com.feature.movie.data.mapper

import com.core.network.dto.MovieListResponse
import com.feature.movie.domain.model.Movie

fun MovieListResponse.toDomainMovieList(): List<Movie> {
    return this.results.map {
        Movie(
            imageUrl = it.poster_path,
            title = it.title
        )
    }
}