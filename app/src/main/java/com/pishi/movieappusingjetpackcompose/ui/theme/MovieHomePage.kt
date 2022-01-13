package com.pishi.movieappusingjetpackcompose.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pishi.movieappusingjetpackcompose.R
import com.pishi.movieappusingjetpackcompose.ui.theme.model.getHorizontalList1

@Composable
fun HomePage(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = primaryLightColor)
    ) {
        Column(
            modifier = Modifier
                .background(secondaryDarkColor)
                .height(100.dp)
                .fillMaxWidth()

        ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 50.dp, start = 8.dp, end = 8.dp)
        ) {
            Text(
                text = "All",
                color = secondaryTextColor,
                modifier = Modifier.weight(0.2f),
                textAlign = TextAlign.Center,
                fontFamily = FontFamily(Font(R.font.roboto_medium))
            )
            Text(
                text = "Movies",
                color = secondaryTextColor,
                modifier = Modifier.weight(0.2f),
                textAlign = TextAlign.Center,
                fontFamily = FontFamily(Font(R.font.roboto_medium))
            )
            Text(
                text = "Events",
                color = secondaryTextColor,
                modifier = Modifier.weight(0.2f),
                textAlign = TextAlign.Center,
                fontFamily = FontFamily(Font(R.font.roboto_medium))
            )
            Text(
                text = "Sports",
                color = secondaryTextColor,
                modifier = Modifier.weight(0.2f),
                textAlign = TextAlign.Center,
                fontFamily = FontFamily(Font(R.font.roboto_medium))
            )
            Text(
                text = "Activities",
                color = secondaryTextColor,
                modifier = Modifier.weight(0.2f),
                textAlign = TextAlign.Center,
                fontFamily = FontFamily(Font(R.font.roboto_medium))
            )
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(450.dp)
                .clip(RoundedCornerShape(bottomStart = 50.dp))
                .background(Color.White)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp, top = 16.dp, end = 8.dp)
            ) {
                Column(
                    modifier = Modifier
                        .weight(0.7f)
                        .padding(start = 8.dp)
                ) {
                    Text(
                        text = "Recommended Movies",
                        color = Color.Black,
                        fontFamily = FontFamily(Font(R.font.roboto_bold)),
                        fontSize = 20.sp
                    )
                }
                Column(
                    modifier = Modifier
                        .weight(0.3f),
                    horizontalAlignment = Alignment.End,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "View All",
                        color = primaryLightColor,
                        fontFamily = FontFamily(Font(R.font.roboto_bold)),
                        fontSize = 14.sp
                    )
                }
            }
            
            LazyRow(
                modifier = Modifier
                    .height(300.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ){
                items(getHorizontalList1.size){ index ->
                    MovieItem(
                        getHorizontalList1[index].img?:0,
                        getHorizontalList1[index].movieTitle!!,
                        getHorizontalList1[index].rating!!,
                        getHorizontalList1[index].genre!!
                    )
                }
            }
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp, top = 16.dp, end = 8.dp)
            ) {
                Column(
                    modifier = Modifier
                        .weight(0.7f)
                        .padding(start = 8.dp)
                ) {
                    Text(
                        text = "More Movies",
                        color = Color.White,
                        fontFamily = FontFamily(Font(R.font.roboto_bold)),
                        fontSize = 20.sp
                    )
                }
                Column(
                    modifier = Modifier
                        .weight(0.3f),
                    horizontalAlignment = Alignment.End,
                    verticalArrangement = Arrangement.Bottom
                ) {
                    Text(
                        text = "View All",
                        color = Color.Black,
                        fontFamily = FontFamily(Font(R.font.roboto_bold)),
                        fontSize = 14.sp
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePagePreview(){
    MovieAppUsingJetpackComposeTheme {
        HomePage()
    }
}