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
import androidx.ui.text.style.TextOverflow
import androidx.ui.unit.dp

@Composable
fun HomeScreen(
    viewModel: MainViewModel,
    scaffoldState: ScaffoldState = remember { ScaffoldState() }
) {
    Scaffold(
        scaffoldState = scaffoldState,

        topAppBar = {
            TopAppBar(title = { Text("Home") })
        },

        bodyContent = {
            Stack(modifier = Modifier.fillMaxSize().padding(8.dp)) {
                Text(text = "")
                Column(Modifier.gravity(Alignment.BottomCenter)) {
                    Text("klasse");
                }
            }
            MaterialTheme() {
                val typography = MaterialTheme.typography
                Column(
                    modifier = Modifier.padding(1.dp, 0.dp, 0.dp, 0.dp)
                ) {
                    Text(
                        "Cost per Month:",
                        style = typography.h6,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        "Filler Text",
                        style = typography.body2
                    )
                }
            }
        },
        bottomAppBar = {
            BotNavigation(vModel = viewModel)
        }


    )
}