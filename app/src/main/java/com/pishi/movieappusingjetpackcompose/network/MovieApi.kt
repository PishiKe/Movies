package com.pishi.movieappusingjetpackcompose.network

import com.pishi.movieappusingjetpackcompose.model.responses.Movies
import com.pishi.movieappusingjetpackcompose.util.Constants
import retrofit2.http.GET
import retrofit2.http.Query
import javax.inject.Singleton

@Singleton
interface MovieApi {

    @GET(Constants.TOP_RATED_MOVIES_ENDPOINT)
    suspend fun getTopRatedMovies(
        @Query(Constants.API_KEY) api_key : String
    ) : List<Movies.Result>
}