package com.example.jpc.`03_CoreComponents`

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jpc.R


@Composable
fun ImageSample() {

    val rainbowColors = remember {
        Brush.sweepGradient(
            /*
            A Sweep Gradient is a type of gradient that smoothly transitions colors in a circular fashion around a center point. Unlike a linear gradient (which transitions colors along a straight line) or a radial gradient (which spreads colors outward from a center), a sweep gradient rotates colors around a central axis.
             */
            listOf(
                Color.Red,
                Color.Blue,
                Color.Green,
                Color.Magenta
            )
        )
    }


    Image(
        painter = painterResource(id = R.drawable.location_app_home), contentDescription = "Image for learning purpose",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(400.dp)
            .border(BorderStroke(4.dp, rainbowColors)),
        colorFilter = ColorFilter.colorMatrix(ColorMatrix().apply {
            setToSaturation(10f)
        }
        )
    )
}


@Preview(showSystemUi = true)
@Composable
fun ImagePreview() {
    ImageSample()
}
