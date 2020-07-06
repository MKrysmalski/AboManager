package com.example.abomanager

import androidx.compose.Composable
import androidx.compose.remember
import androidx.ui.core.Modifier
import androidx.ui.foundation.Box
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Text
import androidx.ui.layout.ColumnScope.weight
import androidx.ui.material.*
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.ArrowBack
import androidx.ui.res.vectorResource

@Composable
fun AboControlScreen(scaffoldState: ScaffoldState = remember { ScaffoldState() }) {
    Scaffold(
        scaffoldState = scaffoldState,
        topAppBar = {
            TopAppBar(title = { Text(text = "AboControl") },
                actions = {
                    Button(onClick = {
                        Status.currentScreen=Screen.Home
                    }){
                        Icon(vectorResource(R.drawable.ic_baseline_home_24))
                    }
                    Button(onClick = {
                        Status.currentScreen=Screen.Statistics
                    }) {
                        Icon(vectorResource(R.drawable.ic_baseline_bar_chart_24))
                    }
                    Button(onClick = {
                        Status.currentScreen=Screen.Profil
                    }) {
                        Icon(vectorResource(R.drawable.ic_baseline_account_circle_24))
                    }
                })
        },
        bodyContent = {
            Box(modifier = Modifier.weight(1f)) {
                AbosList(listOf(AboViewModel("Netflix"), AboViewModel("Disney"), AboViewModel("Burger King")))
            }
        }
    )
}