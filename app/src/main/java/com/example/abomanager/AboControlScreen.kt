package com.example.abomanager

import androidx.compose.Composable
import androidx.compose.remember
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Text
import androidx.ui.material.IconButton
import androidx.ui.material.Scaffold
import androidx.ui.material.ScaffoldState
import androidx.ui.material.TopAppBar
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.ArrowBack

@Composable
fun AboControlScreen(scaffoldState: ScaffoldState = remember { ScaffoldState() }) {
    Scaffold(
        scaffoldState = scaffoldState,
        topAppBar = {
            TopAppBar(title = { Text(text = "Abo Control") },
                navigationIcon = {
                    IconButton(onClick = {
                        Status.currentScreen = Screen.Home
                    }) {
                        Icon(Icons.Filled.ArrowBack)
                    }
                })
        },
        bodyContent = {
            Text("Empty Abo Control")
        }
    )
}