package com.example.jpc.`03_CoreComponents`

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.max
import androidx.compose.ui.unit.sp
import com.example.jpc.R


@Composable
fun TextFeatures() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(
            "Edit This Text",
            textAlign = TextAlign.Center,
            fontSize = 30.sp,
            color = colorResource(R.color.custom_made_Kotlin_color),
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Monospace,
            style = TextStyle(
                shadow = Shadow(color = Color.DarkGray, offset = Offset(4f, 4f), blurRadius = 5f)
            )
        )
    }
}


@Composable
fun RainbowText() {
    val rainbowColors = listOf(
        Color.Blue,
        Color.Red,
        Color.Cyan,
        Color.Green,
        Color.Magenta,
        Color.Yellow
    )
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.CenterStart
    ){
        Text(
            text = buildAnnotatedString {
                append("This will not be rainbow \n")

                withStyle(
                    SpanStyle(
                        fontSize = 30.sp,
                        brush = Brush.linearGradient(
                            colors = rainbowColors
                        )
                    )
                ){
                    append("This will be rainbow color \n and this too\n")
                }
                append("This again will not be with color")
            }
        )
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ScrollingText() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text("This is to make the scrolling of text",
            modifier = Modifier.basicMarquee(),
            fontSize = 40.sp
            )
    }
}

@Composable
fun OverFlowText(){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text("This is to show the overflow and ellipsis (....) is used to show it \n".repeat(50),
            maxLines = 5,
            fontSize = 40.sp,
            overflow = TextOverflow.Ellipsis
        )
    }
}


@Preview(showSystemUi = true)
@Composable
fun TextPreview() {
    OverFlowText()
}

