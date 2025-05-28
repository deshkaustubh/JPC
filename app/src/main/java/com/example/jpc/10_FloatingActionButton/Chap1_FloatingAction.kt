package com.example.jpc.`10_FloatingActionButton`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.app.NotificationCompat.Extender


@Composable
fun ExtendedFloatingActionButtonSample() {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        ExtendedFloatingActionButton(
            onClick = { },
//        modifier = TODO(),
//        shape = TODO(),
//        containerColor = TODO(),
//        contentColor = TODO(),
//        elevation = TODO(),
//        interactionSource = TODO(),
            content = {
                Text("This is floating action button")
            }
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun FloatingPreview() {
    ExtendedFloatingActionButtonSample()
}
