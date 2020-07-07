package com.example.abomanager

import androidx.compose.Composable
import androidx.compose.remember
import androidx.compose.state
import androidx.ui.core.Modifier
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Text
import androidx.ui.foundation.TextField
import androidx.ui.foundation.TextFieldValue
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.*
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.ArrowBack
import androidx.ui.res.vectorResource
import androidx.ui.unit.dp
import java.util.*

@Composable
fun AboControlEditScreen(viewModel: MainViewModel, scaffoldState: ScaffoldState = remember { ScaffoldState() }) {
    val tmpAbo: AboViewModel = AboViewModel("")

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
                val nameState = state { TextFieldValue("") }
                val periodState = state { TextFieldValue("") }
                val costState = state { TextFieldValue("") }
                val startState = state { TextFieldValue("") }
                val timespanState = state { TextFieldValue("") }
                val colorState = state { TextFieldValue("") }
                Column(
                    modifier = Modifier.padding(16.dp).fillMaxHeight()
                ) {
                    Column {
                        Row() {
                            Text("Name:")

                        }
                        Row() {
                            Text("Period:")
                            TextField(value = periodState.value, onValueChange = { periodState.value = it })
                        }
                        Row() {
                            Text("Cost:")
                            TextField(value = costState.value, onValueChange = { costState.value = it })
                        }
                        Row() {
                            Text("Starts:")
                        }
                        Row() {
                            Text("Time span:")
                        }
                        Row() {
                            Text("Color:")
                        }

                    }

                    Row() {
                        Button(onClick = {
                            //Reset the actual object and the input fields
                            nameState.value = TextFieldValue("")
                            periodState.value = TextFieldValue("")
                            costState.value = TextFieldValue("")
                            startState.value = TextFieldValue("")
                            timespanState.value = TextFieldValue("")
                            colorState.value = TextFieldValue("")
                            ResetTemplate(tmpAbo)
                        }, backgroundColor = Color.White) {
                            Icon(vectorResource(R.drawable.ic_baseline_account_circle_24))
                        }
                        Modifier.padding(15.dp)
                        Button(onClick = {
                            SubmitAbo(tmpAbo)
                        }, backgroundColor = Color.White) {
                            Icon(vectorResource(R.drawable.ic_baseline_account_circle_24))
                        }
                    }
                }
            }
        }
    )
}

fun ResetTemplate(abo: AboViewModel){
    abo.name = ""
    abo.abo_variant = 0
    abo.cost = 0.0
    abo.starting_day = Calendar.getInstance().getTime()
    abo.run_time = 1
    abo.color = "#FFFFFF"
}

fun SubmitAbo(abo: AboViewModel){
    //Check if everything is passed correctly
}