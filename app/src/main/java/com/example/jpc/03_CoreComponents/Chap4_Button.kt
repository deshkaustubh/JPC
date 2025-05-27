package com.example.jpc.`03_CoreComponents`

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun FilledButtonSample() {
    val context = LocalContext.current

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Button(
            onClick = {
                Toast.makeText(context," Button is clicked", Toast.LENGTH_LONG).show()
            }
        ){
            Text("Click this to display toast")
        }
    }

}
// Tonal Button  - used for buttons like add to cart and sign in

@Composable
fun TonalButton() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        val context = LocalContext.current
        FilledTonalButton(
            onClick = {
                Toast.makeText(context, "Button is Clicked", Toast.LENGTH_LONG).show()
            }
        ) {
            Text("Display's Toast")
        }
    }
}

// Outlined Button = Used for cancel and back
@Composable
fun OutlinedButtonSample(){
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        val context = LocalContext.current
        OutlinedButton(
            onClick = {
                Toast.makeText(context, "This is context", Toast.LENGTH_SHORT)
            }
        ){
            Text("The outlined Button")
        }
    }
}


@Composable
fun ElevatedButtonSample(){
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        val context = LocalContext.current
        ElevatedButton(
            onClick = {

            }
        ){
            Text("The Elevated Button")
        }
    }
}


// Text Button
@Composable
fun TextButtonSample(){
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        val context = LocalContext.current
        TextButton(
            onClick = {

            }
        ){
            Text("The Text only showing Button")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ButtonPreview(){
    TextButtonSample()
}

