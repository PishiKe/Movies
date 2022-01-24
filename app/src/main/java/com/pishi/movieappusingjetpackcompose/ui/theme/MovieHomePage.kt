package com.pishi.movieappusingjetpackcompose.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.pishi.movieappusingjetpackcompose.R
import com.pishi.movieappusingjetpackcompose.model.getMovieList
import com.pishi.movieappusingjetpackcompose.viewmodel.TopRatedMoviesViewModel
import kotlinx.coroutines.launch

@Composable
fun MoviesHomePage(
    viewModel : TopRatedMoviesViewModel = hiltViewModel()
){

    val scope = rememberCoroutineScope()
    val context = LocalContext.current
    val scaffoldState = rememberScaffoldState()
    val getTopRatedMovies = viewModel.getTopRatedMoviesMovies.observeAsState()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        scaffoldState = scaffoldState
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = primaryLightColor)
        ) {
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
                Spacer(modifier = Modifier.height(24.dp))

                LazyRow(
                    modifier = Modifier
                        .height(300.dp)
                        .padding(top = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    items(getMovieList.size) { index ->
                        MovieItemBig(
                            getMovieList[index].img ?: 0,
                            getMovieList[index].movieTitle!!,
                            getMovieList[index].rating!!,
                            getMovieList[index].genre!!
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
                Column(
                    modifier = Modifier
                        .padding(4.dp)
                        .fillMaxSize()
                ) {
                    LazyRow(
                        modifier = Modifier
                            .padding(4.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        items(getMovieList.size) { index ->
                            MovieItemSmall(
                                img = getMovieList[index].img ?: 0,
                                movieTitle = getMovieList[index].movieTitle!!
                            )
                        }
                    }
                }
            }
        }
    }
}

