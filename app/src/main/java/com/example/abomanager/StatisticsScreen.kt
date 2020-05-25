package com.example.abomanager

import androidx.compose.Composable
import androidx.compose.remember
import androidx.ui.foundation.Text
import androidx.ui.material.Scaffold
import androidx.ui.material.ScaffoldState

@Composable
fun StatisticsScreen(scaffoldState: ScaffoldState = remember { ScaffoldState() }) {
    Scaffold(
        scaffoldState = scaffoldState,
        topAppBar = {
            Text("Statistics Page")
        },
        bodyContent = {
            Text("Empty Statistics")
        }
    )
}