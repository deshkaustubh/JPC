package com.example.jpc.`18_Slider`

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun SliderSample() {
    var sliderPosition by remember {
        mutableStateOf(0f)
    }
    Column {
        Slider(
            value = sliderPosition,
            onValueChange = { sliderPosition = it },
            colors = SliderDefaults.colors(
                thumbColor = MaterialTheme.colorScheme.secondary,
                activeTrackColor = MaterialTheme.colorScheme.secondary,
                inactiveTickColor = MaterialTheme.colorScheme.secondaryContainer
            ),
            steps = 3,
            valueRange = 0f..50f
        )
        Text("Slider Position = $sliderPosition")
    }
}

@Preview(showBackground = true)
@Composable
fun SliderPreview() {
    SliderSample()
}



