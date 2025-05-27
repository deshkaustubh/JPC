package com.example.jpc.`04_LayoutsComposable`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

//Column

@Composable
fun ColumnSample() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)
            .background(color = Color.Magenta),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Text A")
        Text("Text B")
        Text("Text C")
    }
}

@Composable
fun RowSample() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
            .background(color = Color.Gray),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text("Text A")
        Text("Text B")
        Text("Text C")
    }
}

//Box - in box the items overlap onto each other

@Composable
fun BoxSample() {
    Box(
        modifier = Modifier
            .size(300.dp)
            .background(Color.Red)
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .background(Color.Blue)
        ) {
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .background(Color.Green)
            ) {

            }
        }
    }
}

// constraint layout = use only when needed and UI is complex
@Composable
fun ConstraintSample() {
    Column {
        ConstraintLayout(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color.LightGray)
        ) {
            val (text1, text2, text3) = createRefs()

            Text("Bottom Left", modifier = Modifier.constrainAs(text1) {
                bottom.linkTo(parent.bottom, margin = 8.dp)
                start.linkTo(parent.start, margin = 8.dp)
            })

            Text("Center", modifier = Modifier.constrainAs(text2) {
                bottom.linkTo(parent.bottom)
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            })

            Text("Top Right",
                modifier = Modifier.constrainAs(text3) {
                    top.linkTo(parent.top, margin = 20.dp)
                    end.linkTo(parent.end, margin = 16.dp)
                }
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun LayoutPreview() {
    ConstraintSample()
}
