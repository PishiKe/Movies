package com.pishi.movieappusingjetpackcompose.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pishi.movieappusingjetpackcompose.R

@Composable
fun MovieItemBig(
    img : Int,
    movieTitle : String,
    rating : String,
    genre : String
){
    Column(
        modifier = Modifier
            .height(300.dp)
            .width(140.dp)
            .clip( RoundedCornerShape(16.dp))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.7f)
        ) {
            Image(
                painter = painterResource(id = img),
                contentDescription = "Movie Poster Image",
                contentScale = ContentScale.FillBounds
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.3f)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 4.dp, start = 4.dp, end = 4.dp)
            ) {
                Text(
                    text = movieTitle,
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.roboto_bold))
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 4.dp, start = 4.dp, end = 4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_star__rating),
                    contentDescription = "Rating",
                    modifier = Modifier
                        .size(16.dp)
                )

                Text(
                    text = rating,
                    fontSize = 10.sp,
                    fontFamily = FontFamily(Font(R.font.roboto_light)),
                    modifier = Modifier.padding(start = 4.dp)
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 4.dp, start = 4.dp, end = 4.dp)
            ) {
                Text(
                    text = genre,
                    fontSize = 10.sp,
                    fontFamily = FontFamily(Font(R.font.roboto_light))
                )
            }
        }
    }
}


@Preview (showBackground = true)
@Composable
fun MovieItemPreview(){
    MovieItemBig(
        img = R.drawable.joker,
        movieTitle = "Joker" ,
        rating = "7/10",
        genre = "Action")
}
