package com.example.abomanager

import androidx.compose.Composable
import androidx.compose.remember
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Text
import androidx.ui.material.*
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.ArrowBack

@Composable
fun ProfilScreen(scaffoldState: ScaffoldState = remember { ScaffoldState() }) {
    Scaffold(
        scaffoldState = scaffoldState,
        topAppBar = {
            TopAppBar(title = { Text(text = "Profile") },
                actions = {
                    Button(onClick = {
                        Status.currentScreen=Screen.Home
                    }){
                        Text("Home")
                    }
                    Button(onClick = {
                        Status.currentScreen=Screen.Statistics
                    }) {
                        Text("Statistics")
                    }
                    Button(onClick = {
                        Status.currentScreen=Screen.AboControl
                    }) {
                        Text("AboControl")
                    }
                })
        },
        bodyContent = {
            Text("Empty ProfilScreen")
        }
    )
}