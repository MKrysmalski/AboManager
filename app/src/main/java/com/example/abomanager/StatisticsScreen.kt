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
            BottomAppBar(
                backgroundColor = Color.DarkGray) {
                Button(onClick = {
                    Status.currentScreen=Screen.Home(viewModel)
                }, modifier = navButtonPadding, backgroundColor = Color.White){
                    Icon(vectorResource(R.drawable.ic_baseline_home_24))
                }
                Button(onClick = {
                    Status.currentScreen=Screen.AboControl(viewModel)
                }, modifier = navButtonPadding, backgroundColor = Color.White) {
                    Icon(vectorResource(R.drawable.ic_baseline_view_list_24))
                }
                Button(onClick = {
                    Status.currentScreen=Screen.Profil(viewModel)
                }, modifier = navButtonPadding, backgroundColor = Color.White) {
                    Icon(vectorResource(R.drawable.ic_baseline_account_circle_24))
                }
                Button(onClick = {
                    Status.currentScreen=Screen.Statistics(viewModel)
                }, modifier = navButtonPadding, backgroundColor = Color.White) {
                    Icon(vectorResource(R.drawable.ic_baseline_bar_chart_24))
                }
            }
        }

    )
}