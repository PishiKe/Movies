package com.pishi.movieappusingjetpackcompose.navigation

sealed class Screen (val route : String, val title: String){

    object Movies: Screen("Movies","Movies")
    object TvSeries : Screen("TvSeries", "TvSeries")
}