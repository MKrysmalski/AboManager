package com.example.abomanager

import android.icu.text.CaseMap
import androidx.compose.Composable
import androidx.compose.remember
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.Stack
import androidx.ui.layout.fillMaxSize
import androidx.ui.layout.padding
import androidx.ui.material.*
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.ArrowBack
import androidx.ui.res.vectorResource
import androidx.ui.unit.dp

@Composable
fun HomeScreen(viewModel: MainViewModel, scaffoldState: ScaffoldState = remember { ScaffoldState() }) {
    Scaffold(
        scaffoldState = scaffoldState,

        topAppBar = {
            TopAppBar(title = { Text("Home") })
        },

        bodyContent = {
            Stack(modifier = Modifier.fillMaxSize().padding(8.dp)){
                Text(text = "Empty Home Screen")
                Column(Modifier.gravity(Alignment.BottomCenter)) {
                    Text("klasse");
                }
            }
        },

        bottomAppBar = {
            BotNavigation(vModel = viewModel)
        }


    )
}