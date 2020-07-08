package com.example.abomanager

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.padding
import androidx.ui.material.BottomAppBar
import androidx.ui.material.Button
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.res.vectorResource
import androidx.ui.unit.dp

@Composable
fun BotNavigation(vModel: MainViewModel) {
    BottomAppBar(
        backgroundColor = Color.DarkGray
    ) {
        Button(onClick = {
            Status.currentScreen = Screen.Home(vModel)
        }, modifier = navButtonPadding, backgroundColor = Color.White) {
            Icon(vectorResource(R.drawable.ic_baseline_home_24))
        }
        Button(onClick = {
            Status.currentScreen = Screen.AboControl(vModel)
        }, modifier = navButtonPadding, backgroundColor = Color.White) {
            Icon(vectorResource(R.drawable.ic_baseline_view_list_24))
        }
        Button(onClick = {
            Status.currentScreen = Screen.Profil(vModel)
        }, modifier = navButtonPadding, backgroundColor = Color.White) {
            Icon(vectorResource(R.drawable.ic_baseline_account_circle_24))
        }
        Button(onClick = {
            Status.currentScreen = Screen.Statistics(vModel)
        }, modifier = navButtonPadding, backgroundColor = Color.White) {
            Icon(vectorResource(R.drawable.ic_baseline_bar_chart_24))
        }
    }
}