package com.example.jpc.`09_AlertDialogBox`

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.example.jpc.`04_LayoutsComposable`.ConstraintSample
import com.example.jpc.`04_LayoutsComposable`.ModifierSample
import com.example.jpc.R

@Composable
fun AlertBox(
    onDismissRequest: () -> Unit,
) {
    val context = LocalContext.current

    Dialog(
        onDismissRequest = { onDismissRequest }
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(350.dp), shape = RoundedCornerShape(16.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.location_app_home),
                contentDescription = "LocationAppImage",
                contentScale = ContentScale.Crop,
                modifier = Modifier.height(160.dp).fillMaxWidth()
            )

            Text("This is Dialog Box", modifier = Modifier.padding(16.dp).fillMaxWidth(), textAlign = TextAlign.Center )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                TextButton(
                    onClick = {
                        Toast.makeText(context, "Text on clicking", Toast.LENGTH_SHORT).show()
                    },
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text("Confirm")
                }

                TextButton(
                    onClick = {
                        onDismissRequest()
                    },
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text("Dismiss")
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun AlertPreview() {
    AlertBox() { }
}