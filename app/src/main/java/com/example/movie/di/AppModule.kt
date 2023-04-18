package com.example.movie.di

import com.example.movie.navigation.NavigationProvider
import com.feature.movie.ui.navigation.MovieNavigationApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideNavigationProvider(movieNavigationApi: MovieNavigationApi): NavigationProvider{
        return NavigationProvider(movieNavigationApi)
    }
}