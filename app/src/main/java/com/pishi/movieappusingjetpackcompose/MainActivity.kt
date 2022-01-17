package com.pishi.movieappusingjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import com.pishi.movieappusingjetpackcompose.ui.theme.MoviesHomePage
import com.pishi.movieappusingjetpackcompose.ui.theme.MovieAppUsingJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MovieAppUsingJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Scaffold(
                        bottomBar = {
                            BottomNavigation(
                                backgroundColor = Color.White
                            ) {
                                BottomNavigationItem(
                                    selected = true,
                                    onClick = { /*TODO*/ },
                                    icon = {
                                        Icon(
                                            painter = painterResource(id = R.drawable.ic_movie_open),
                                            contentDescription = "Movie Icon")
                                    },
                                    label ={
                                        Text(
                                            text = "Movie",
                                            fontSize = 10.sp
                                        )
                                    }
                                )
                                BottomNavigationItem(
                                    selected = false,
                                    onClick = { /*TODO*/ },
                                    icon = {
                                        Icon(
                                            painter = painterResource(id = R.drawable.ic_television_classic),
                                            contentDescription = "TV Icon")
                                    },
                                    label ={
                                        Text(
                                            text = "Tv Series",
                                            fontSize = 10.sp
                                        )
                                    }
                                )
                            }
                        }
                    ) {

                    }
                }
            }
        }
    }
}

