package com.example.jpc.`03_CoreComponents`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SimpleOutlineTextFieldSample() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        /*
        An outlined text field is a type of text input field used in user interfaces, particularly in design systems like Material Design. It has a visible border around it, making it distinct from the surrounding content. This style is often used in forms and dialogs to allow users to enter and edit text.
         */

        var text by remember {
            mutableStateOf("")
        }
        OutlinedTextField(
            value = text,
            onValueChange = {
                text = it
            },
            label = {
                Text("Label")
            }
        )
        val rainbowColors = listOf(
            Color.Red,
            Color.Blue,
            Color.Green,
            Color.Cyan
        )
        val brush = remember {
            Brush.linearGradient(
                colors = rainbowColors
            )
        }
    }
}

@Composable
fun RainbowOutlineTextFieldSample() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){

        val rainbowColors = listOf(
            Color.Red,
            Color.Blue,
            Color.Green,
            Color.Cyan
        )
        val brush = remember {
            Brush.linearGradient(
                colors = rainbowColors
            )
        }

        var text by remember {
            mutableStateOf("")
        }

        TextField(
            value = text ,
            onValueChange = {text = it},
            textStyle = TextStyle(brush = brush)
        )
//        OutlinedTextField(
//            value = text,
//            onValueChange = {
//                text = it
//            },
//            label = {
//                Text("Label")
//            }
//        )
    }
}

// Creating Text Field with password
@Composable
fun PasswordTextField() {
    
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        var password by rememberSaveable {
            mutableStateOf("")
        }

        TextField(
            value = password,
            onValueChange = {password = it},
            label = { Text("Enter Password") },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            )
        )
    }

}

@Preview(showSystemUi = true)
@Composable
fun OutlineTextFeildPreveiew() {
    PasswordTextField()
}