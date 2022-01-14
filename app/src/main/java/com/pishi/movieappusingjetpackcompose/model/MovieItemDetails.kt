package com.pishi.movieappusingjetpackcompose.model

import com.pishi.movieappusingjetpackcompose.R

data class MovieItem(
    var img : Int? = null,
    var movieTitle : String? = null,
    var rating : String? = null,
    var genre : String? = null
)

data class TvSeriesItem(
    val img : Int? = null,
    val tvSeriesTitle : String? = null,
    val seasons : String? = null,
    val rating: String? = null,
    val genre : String? = null
)

val getMovieList = listOf(
    MovieItem(R.drawable.us, "US","7/10","Thriller"),
    MovieItem(R.drawable.antman, "Ant Man","8/10","Action"),
    MovieItem(R.drawable.blackpanther, "Black Panther","9/10","Action"),
    MovieItem(R.drawable.joker,"Joker","8/10","Action"),
    MovieItem(R.drawable.us, "US","7/10","Thriller"),
    MovieItem(R.drawable.antman, "Ant Man","8/10","Action"),
    MovieItem(R.drawable.blackpanther, "Black Panther","9/10","Action"),
    MovieItem(R.drawable.joker,"Joker","8/10","Action")
)

val getTvList = listOf(

    TvSeriesItem(R.drawable.charmed,"Charmed","5 seasons", "7/10","Drama"),
    TvSeriesItem(R.drawable.riverdale,"Riverdale","4 seasons", "6/10","Crime"),
    TvSeriesItem(R.drawable.the100,"The 100","5 seasons", "7/10","Drama"),
    TvSeriesItem(R.drawable.peakyblinders,"Peaky Blinders","6 seasons", "8/10","Action/Drama"),
    TvSeriesItem(R.drawable.deadtome,"Dead To Me","4 seasons", "7/10","Action"),
    TvSeriesItem(R.drawable.togo,"Togo","1 seasons", "8/10","Comedy"),
    TvSeriesItem(R.drawable.charmed,"Charmed","5 seasons", "7/10","Drama"),
    TvSeriesItem(R.drawable.riverdale,"Riverdale","4 seasons", "6/10","Crime"),
    TvSeriesItem(R.drawable.the100,"The 100","5 seasons", "7/10","Drama"),
    TvSeriesItem(R.drawable.peakyblinders,"Peaky Blinders","6 seasons", "8/10","Action/Drama"),
    TvSeriesItem(R.drawable.deadtome,"Dead To Me","4 seasons", "7/10","Action"),
    TvSeriesItem(R.drawable.togo,"Togo","1 seasons", "8/10","Comedy")




)