package com.devspacecinenow

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("https://api.themoviedb.org/3/movie/")
    fun getNowPlayingMovies() : Call<List<Unit>>
}