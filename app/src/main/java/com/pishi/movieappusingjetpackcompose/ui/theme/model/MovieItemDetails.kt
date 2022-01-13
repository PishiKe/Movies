package com.pishi.movieappusingjetpackcompose.ui.theme.model

import com.pishi.movieappusingjetpackcompose.R

data class MovieItem(
    var img : Int? = null,
    var movieTitle : String? = null,
    var rating : String? = null,
    var genre : String? = null
)

val getHorizontalList1 = listOf(
    MovieItem(R.drawable.us, "US","7/10","Thriller"),
    MovieItem(R.drawable.antman, "Ant Man","8/10","Action"),
    MovieItem(R.drawable.blackpanther, "Black Panther","9/10","Action"),
    MovieItem(R.drawable.joker,"Joker","8/10","Action"),
    MovieItem(R.drawable.us, "US","7/10","Thriller"),
    MovieItem(R.drawable.antman, "Ant Man","8/10","Action"),
    MovieItem(R.drawable.blackpanther, "Black Panther","9/10","Action"),
    MovieItem(R.drawable.joker,"Joker","8/10","Action")
)