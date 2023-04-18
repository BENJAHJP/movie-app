package com.feature.movie.domain.use_cases

import com.core.common.Resource
import com.feature.movie.domain.model.Movie
import com.feature.movie.domain.repository.MovieRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetMovieListUseCase @Inject constructor(
    private val movieRepository: MovieRepository
){
    operator fun invoke(apiKey: String, query: String): Flow<Resource<List<Movie>>> = flow {
        try {
            emit(Resource.Loading())
            val movies = movieRepository.getMovieList(apiKey, query)
            emit(Resource.Success(movies))
        } catch (e: HttpException){
            emit(Resource.Error(e.localizedMessage ?: "Unknown error occurred"))
        } catch (e: IOException){
            emit(Resource.Error("Check internet connection"))
        }
    }
}