package com.core.network

import retrofit2.http.GET

interface MovieApi {
    @GET
    suspend fun getMovieList()
}