package com.example.jpc.`02_FundamentalConcepts`

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.jpc.R


// We'll access resources color, string and image


/*
- PainterResource:
- Used to load images from resources (like R.drawable).
- Returns a Painter object that can be used in Image().

- Painter:
- Represents an object that can be drawn on the screen.
- Can be used for custom drawing by extending the Painter class.
 */
@Composable
fun AccessImage() {
    Box( modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Image(painter = painterResource(R.drawable.location_app_home), contentDescription = "Location App Home")
    }
}

@Composable
fun StringAccess() {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(text = stringResource(id = R.string.locations), color = colorResource(R.color.custom_made_Kotlin_color))
    }
}


@Preview(showSystemUi = true)
@Composable
fun AccessPreview() {
    StringAccess()
}
