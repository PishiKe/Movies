package com.pishi.movieappusingjetpackcompose.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pishi.movieappusingjetpackcompose.model.responses.TopRatedMovies
import com.pishi.movieappusingjetpackcompose.repository.MoviesRepository
import com.pishi.movieappusingjetpackcompose.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TopRatedMoviesViewModel @Inject constructor(
    private val moviesRepository: MoviesRepository
    ) : ViewModel() {

    var isLoading = mutableStateOf(false)
    private val _getTopRatedMovies : MutableLiveData<List<TopRatedMovies>> = MutableLiveData<List<TopRatedMovies>>()
    var getTopRatedMoviesMovies : LiveData<List<TopRatedMovies>> = _getTopRatedMovies

    suspend fun getTopRatedMovies() : Resource<List<TopRatedMovies>>{

        val result = moviesRepository.getTopRatedMovieList()

        if (result is Resource.Success){
            isLoading.value = true
            _getTopRatedMovies.value = result.data!!
        }

        return result
    }
}