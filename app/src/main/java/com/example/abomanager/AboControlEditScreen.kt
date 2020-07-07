package com.example.abomanager

import androidx.compose.Composable
import androidx.compose.remember
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.material.*
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.ArrowBack
import androidx.ui.res.vectorResource

@Composable
fun AboControlEditScreen(viewModel: MainViewModel, scaffoldState: ScaffoldState = remember { ScaffoldState() }) {
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
            Column {

            }
        }
    )
}

fun SubmitAbo(abo: Abo){

}