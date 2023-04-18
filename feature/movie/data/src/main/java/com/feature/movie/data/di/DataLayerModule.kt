package com.feature.movie.data.di

import com.core.network.data_providers.MovieDataProviders
import com.feature.movie.data.repository.MovieRepositoryImpl
import com.feature.movie.domain.repository.MovieRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DataLayerModule {

    @Provides
    fun provideMovieRepository(movieDataProviders: MovieDataProviders): MovieRepository {
        return MovieRepositoryImpl(movieDataProviders)
    }
}