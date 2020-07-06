package com.example.abomanager

import androidx.compose.Composable
import androidx.compose.remember
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Text
import androidx.ui.material.Button
import androidx.ui.material.Scaffold
import androidx.ui.material.ScaffoldState
import androidx.ui.res.vectorResource

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
                Icon(vectorResource(R.drawable.ic_baseline_home_24));
            }
            Button(onClick = {
                Status.currentScreen = Screen.AboControl
            }) {
                Icon(vectorResource(R.drawable.ic_baseline_home_24));
            }
            Button(onClick = {
                Status.currentScreen = Screen.Profil
            }) {
                Icon(vectorResource(R.drawable.ic_baseline_home_24));
            }
        }

    )
}