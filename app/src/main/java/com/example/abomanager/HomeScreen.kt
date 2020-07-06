package com.example.abomanager

import androidx.compose.Composable
import androidx.compose.remember
import androidx.ui.foundation.Text
import androidx.ui.material.Button
import androidx.ui.material.Scaffold
import androidx.ui.material.ScaffoldState

@Composable
fun HomeScreen(scaffoldState: ScaffoldState = remember { ScaffoldState() }) {
    Scaffold(
        scaffoldState = scaffoldState,
        topAppBar = {

            Text("Home Screen")
        },
        bodyContent = {
            Text("Empty Home Screen")
        },
        bottomAppBar = {
            Button(onClick = {
                Status.currentScreen = Screen.Statistics
            }) {
                Text("Statistics");
            }
            Button(onClick = {
                Status.currentScreen = Screen.Statistics
            }) {
                Text("Navigate");
            }
            Button(onClick = {
                Status.currentScreen = Screen.Home
            }) {
                Text("Home");
            }
            Button(onClick = {
                Status.currentScreen = Screen.AboControl
            }) {
                Text("AboControl");
            }
            Button(onClick = {
                Status.currentScreen = Screen.Profil
            }) {
                Text("Profil");
            }
        }

    )
}