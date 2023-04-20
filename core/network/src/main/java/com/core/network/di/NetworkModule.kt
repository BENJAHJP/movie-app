package com.core.network.di

import com.core.network.MovieApi
import com.core.network.constants.Constants
import com.core.network.data_providers.MovieDataProviders
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    fun provideMovieApi(): MovieApi{
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MovieApi::class.java)
    }

    @Provides
    fun provideMovieDataProvider(movieApi: MovieApi): MovieDataProviders {
        return MovieDataProviders(movieApi)
    }
}