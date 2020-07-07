package com.example.abomanager

import androidx.compose.Composable
import androidx.compose.remember
import androidx.ui.core.Modifier
import androidx.ui.foundation.Box
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.ColumnScope.weight
import androidx.ui.material.*
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.ArrowBack
import androidx.ui.res.vectorResource

@Composable
fun AboControlScreen(viewModel: MainViewModel, scaffoldState: ScaffoldState = remember { ScaffoldState() }) {
    Scaffold(
        scaffoldState = scaffoldState,

        topAppBar = {
          TopAppBar(
              title = { Text("Subscriptions") },
              navigationIcon = {
                  IconButton(onClick = {
                      Status.currentScreen = Screen.AboControlEdit(viewModel)
                  }) {
                      Icon(vectorResource(R.drawable.ic_baseline_home_24))
                  }
              })
        },

        bodyContent = {
            Box(modifier = Modifier.weight(1f)) {
                AbosList(viewModel.list)
            }
        },

        bottomAppBar = {
            BotNavigation(vModel = viewModel)
        }
    )
}