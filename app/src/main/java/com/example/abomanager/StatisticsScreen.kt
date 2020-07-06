package com.example.abomanager

import androidx.compose.Composable
import androidx.compose.remember
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Text
import androidx.ui.material.*
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.ArrowBack
import androidx.ui.res.vectorResource

@Composable
fun StatisticsScreen(scaffoldState: ScaffoldState = remember { ScaffoldState() }) {
    Scaffold(
        scaffoldState = scaffoldState,
        topAppBar = {
            TopAppBar(
                title = { Text(text = "Statistics") },
                actions = {
                    Button(onClick = {
                        Status.currentScreen=Screen.Home
                    }){
                        Icon(vectorResource(R.drawable.ic_baseline_home_24))
                    }
                    Button(onClick = {
                        Status.currentScreen=Screen.AboControl
                    }) {
                        Icon(vectorResource(R.drawable.ic_baseline_view_list_24))
                    }
                    Button(onClick = {
                        Status.currentScreen=Screen.Profil
                    }) {
                        Icon(vectorResource(R.drawable.ic_baseline_account_circle_24))
                    }
                })
        },
        bodyContent = {
            Text("Empty Statistics")
        }
    )
}