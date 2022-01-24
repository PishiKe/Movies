package com.pishi.movieappusingjetpackcompose.repository

import com.pishi.movieappusingjetpackcompose.model.responses.Movies
import com.pishi.movieappusingjetpackcompose.network.MovieApi
import com.pishi.movieappusingjetpackcompose.util.Constants
import com.pishi.movieappusingjetpackcompose.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class MoviesRepository @Inject constructor(
    private val api : MovieApi
) {
    suspend fun getTopRatedMovieList() : Resource<List<Movies.Result>>{

        val response = try {
            api.getTopRatedMovies(Constants.API_KEY)
        } catch (e: Exception){
            return Resource.Error("An Unknown Error Occurred ${e.localizedMessage}")
        }

        return Resource.Success(response)
    }
}