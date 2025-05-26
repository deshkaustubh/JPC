package com.example.jpc.`03_CoreComponents`

import android.net.LinkAddress
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.node.ModifierNodeElement
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun PartiallySelectableText( ) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center ){
        Column {
            Text("This is a text")
            Text("This is another Text")
            DisableSelection {
                Text("This is also but can't be selected")
            }
        }
    }
}

@Composable
fun AnnotatedStringWithListenerSample() {

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        val uriHandler = LocalUriHandler.current

        Text(
            buildAnnotatedString {
                append("Build better apps faster with ")
                pushStringAnnotation(
                    tag = "URL",
                    annotation = "https://developer.android.com/develop/ui/compose/documentation"
                )
                withStyle(style = SpanStyle(color = Color.Blue)) {
                    append("Jetpack Compose")
                }
                pop()
            },
            modifier = Modifier.clickable {
                uriHandler.openUri("https://developer.android.com/develop/ui/compose/documentation")
            }
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun SelectionPreview() {
    AnnotatedStringWithListenerSample()
}