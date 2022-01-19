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
import com.pishi.movieappusingjetpackcompose.model.responses.Result
import com.pishi.movieappusingjetpackcompose.model.responses.TopRatedMovies

@Composable
fun MovieItemBig( movies : Result ){
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
                    text = movies.title,
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
                    text = "${movies.vote_average}",
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
                    text = movies.release_date,
                    fontSize = 10.sp,
                    fontFamily = FontFamily(Font(R.font.roboto_light))
                )
            }
        }
    }
}



