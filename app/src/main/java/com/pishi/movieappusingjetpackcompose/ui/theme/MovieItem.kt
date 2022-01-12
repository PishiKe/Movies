package com.pishi.movieappusingjetpackcompose.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

@Composable
fun MovieItem(){
    Column(
        modifier = Modifier
            .height(200.dp)
            .width(100.dp)
            .clip(RoundedCornerShape(32.dp))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.7f)
        ) {
        }
    }
}