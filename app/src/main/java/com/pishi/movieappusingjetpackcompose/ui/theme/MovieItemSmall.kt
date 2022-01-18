package com.pishi.movieappusingjetpackcompose.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pishi.movieappusingjetpackcompose.R

@Composable
fun MovieItemSmall(
    img : Int,
    movieTitle : String
){
    Card(
        elevation = 5.dp
    ) {
        Column(
            modifier = Modifier
                .height(200.dp)
                .width(100.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.8f)
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
                    .weight(0.2f)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 4.dp, start = 4.dp, end = 4.dp)
                ) {
                    Text(
                        text = movieTitle,
                        fontSize = 14.sp,
                        fontFamily = FontFamily(Font(R.font.roboto_bold)),
                        color = Color.Black
                    )
                }
            }
        }
    }
}


@Preview (showBackground = true)
@Composable
fun MovieItemSmallPreview(){
    MovieItemSmall(
        img = R.drawable.joker,
        movieTitle = "Joker"
    )
}
