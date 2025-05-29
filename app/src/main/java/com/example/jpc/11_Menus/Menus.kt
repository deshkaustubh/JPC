package com.example.jpc.`11_Menus`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jpc.`03_CoreComponents`.TextPreview
import kotlin.math.exp

@Composable
fun DropDownMenuSample() {
    Box(modifier = Modifier.fillMaxSize().padding(16.dp), contentAlignment = Alignment.BottomStart) {
        var expanded by remember {
            mutableStateOf(false)
        }

        IconButton(onClick = {expanded = !expanded}) {
            Icon(Icons.Default.MoreVert, contentDescription = "more vert means three dots")
        }

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = {expanded = false}
        ) {
            DropdownMenuItem(
                text = { Text("Profile") },
                trailingIcon = {Icon(Icons.Outlined.Person, contentDescription = "Profile")},
                onClick = {}
            )

            DropdownMenuItem(
                text = { Text("Setting") },
                trailingIcon = {Icon(Icons.Outlined.Settings, contentDescription = "Setting")},
                onClick = {}
            )
            HorizontalDivider()
            DropdownMenuItem(
                text = { Text("About") },
                trailingIcon = {Icon(Icons.Outlined.AccountBox, contentDescription = "About")},
                onClick = {}
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun DropPreview(){
    DropDownMenuSample()
}