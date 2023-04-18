package com.feature.movie.domain.use_cases

import com.core.common.Resource
import com.feature.movie.domain.model.Movie
import kotlinx.coroutines.flow.flow

class GetMovieListUseCase {
    operator fun invoke(apiKey: String, query: String) = flow<Resource<List<Movie>>> {  }
}