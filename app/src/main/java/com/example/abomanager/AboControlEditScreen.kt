package com.example.abomanager

import androidx.compose.Composable
import androidx.compose.remember
import androidx.ui.core.Modifier
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Text
import androidx.ui.foundation.TextField
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.Row
import androidx.ui.layout.padding
import androidx.ui.material.*
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.ArrowBack
import androidx.ui.res.vectorResource
import androidx.ui.unit.dp

@Composable
fun AboControlEditScreen(viewModel: MainViewModel, scaffoldState: ScaffoldState = remember { ScaffoldState() }) {
    var tmpAbo: AboViewModel

    Scaffold(
        scaffoldState = scaffoldState,
        topAppBar = {
            TopAppBar(
                title = {
                    Text(text = "Add Subscription")
                },
                navigationIcon = {
                    IconButton(onClick = {
                        Status.currentScreen = Screen.AboControl(viewModel)
                    }) {
                        Icon(Icons.Filled.ArrowBack)
                    }
                }
            )
        },
        bodyContent = {
            MaterialTheme {
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Row() {
                        Text("Name:")

                    }
                }
            }
        }
    )
}

fun SubmitAbo(abo: Abo){

}