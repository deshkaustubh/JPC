package com.example.jpc.`04_LayoutsComposable`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.unit.dp


@Composable
fun ModifierSample(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .background(Color.LightGray),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Text for checking the modifiers",
            modifier = Modifier.fillMaxSize()
                .padding(20.dp)
                .background(Color.Magenta)
        )
    }
}

