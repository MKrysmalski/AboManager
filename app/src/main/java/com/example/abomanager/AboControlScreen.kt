package com.example.abomanager

import androidx.compose.Composable
import androidx.compose.remember
import androidx.ui.foundation.Text
import androidx.ui.material.Scaffold
import androidx.ui.material.ScaffoldState

@Composable
fun AboControlScreen(scaffoldState: ScaffoldState = remember { ScaffoldState() }) {
    Scaffold(
        scaffoldState = scaffoldState,
        topAppBar = {
            Text("Abo Control")
        },
        bodyContent = {
            Text("Empty Abo Control")
        }
    )
}