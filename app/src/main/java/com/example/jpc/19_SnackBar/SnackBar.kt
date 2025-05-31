package com.example.jpc.`19_SnackBar`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Image
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.SnackbarResult
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch


@Composable
fun SnackBarSample() {
    val scope = rememberCoroutineScope()
    val snackBarHostState = remember { SnackbarHostState() }

    Scaffold(
        snackbarHost = {
            SnackbarHost(hostState = snackBarHostState)
        }, floatingActionButton = {
            ExtendedFloatingActionButton(
                text = { Text("Show SnackBar")},
                icon = { Icon(Icons.Filled.Image, contentDescription = "Image Icon")},
                onClick = {
                    scope.launch {
                        val result = snackBarHostState.showSnackbar(
                            message = "SnackBar",
                            actionLabel = "Action",
                            duration = SnackbarDuration.Indefinite
                        )
                        when(result) {
                            SnackbarResult.ActionPerformed -> {

                            }
                            SnackbarResult.Dismissed -> {

                            }
                        }
                    }
                }
            )
        },
        content = {padding ->
            Box(
                modifier = Modifier.fillMaxSize().padding(padding).padding(16.dp)
            ){
                Text("Tab the Fab to show the snack bar")
            }
        }
    )
}


@Preview(showBackground = true)
@Composable
fun SnackPreview() {
    SnackBarSample()
}