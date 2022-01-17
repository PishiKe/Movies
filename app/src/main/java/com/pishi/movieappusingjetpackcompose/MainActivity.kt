package com.pishi.movieappusingjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pishi.movieappusingjetpackcompose.navigation.Screen
import com.pishi.movieappusingjetpackcompose.ui.theme.MoviesHomePage
import com.pishi.movieappusingjetpackcompose.ui.theme.MovieAppUsingJetpackComposeTheme
import com.pishi.movieappusingjetpackcompose.ui.theme.TvSeriesHomePage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MovieAppUsingJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {

                    val navController = rememberNavController()

                    Scaffold(
                        bottomBar = {
                            BottomNavigation(
                                backgroundColor = Color.White
                            ) {
                                BottomNavigationItem(
                                    selected = true,
                                    onClick = {
                                              navController.navigate(Screen.Movies.route)
                                    },
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
                                    onClick = { navController.navigate(Screen.TvSeries.route)},
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
                        NavHost(
                            navController = navController ,
                            startDestination = Screen.Movies.route
                        ){
                            composable(Screen.Movies.route){
                                MoviesHomePage()
                            }
                            composable(Screen.TvSeries.route){
                                TvSeriesHomePage()
                            }
                        }
                    }
                }
            }
        }
    }
}

