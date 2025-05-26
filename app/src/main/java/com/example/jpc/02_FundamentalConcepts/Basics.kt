package com.example.jpc.`01_Introduction`

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


// a Composable is a function annotated with @Composable, which allows you to define UI elements declaratively.
@Composable
fun Greeting () {
    Text("Jet Pack Compose")
}

@Preview(showSystemUi = true)
@Composable
fun GreetingPreview() {
    Greeting()
}


