package com.example.abomanager

import androidx.compose.Composable
import androidx.compose.remember
import androidx.ui.core.Modifier
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.graphics.Color.Companion.DarkGray
import androidx.ui.layout.padding
import androidx.ui.material.*
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.ArrowBack
import androidx.ui.res.vectorResource
import androidx.ui.unit.dp

val navButtonPadding : Modifier = Modifier.padding(5.dp);

@Composable
fun StatisticsScreen(viewModel: MainViewModel, scaffoldState: ScaffoldState = remember { ScaffoldState() }) {
    Scaffold(
        scaffoldState = scaffoldState,

        topAppBar = {
            TopAppBar(title = { Text("Statistics") })
        },

        bodyContent = {
            Text("Empty Statistics")
        },

        bottomAppBar = {
            BotNavigation(vModel = viewModel)
        }

    )
}