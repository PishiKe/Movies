package com.pishi.movieappusingjetpackcompose.ui.theme.model

import com.pishi.movieappusingjetpackcompose.R

data class MovieItem(
    var img : Int,
    var movieTitle : String,
    var rating : String,
    var genre : String
)

val getHorizontalList1 = listOf(
    MovieItem(R.drawable.us, "US","7/10","Thriller"),
    MovieItem(R.drawable.antman, "Ant Man","8/10","Action"),
    MovieItem(R.drawable.blackpanther, "Black Panther","9/10","Action"),
    MovieItem(R.drawable.joker,"Joker","8/10","Action")
)