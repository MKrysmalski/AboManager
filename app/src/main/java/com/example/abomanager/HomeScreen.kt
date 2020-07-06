package com.example.abomanager

import android.icu.text.CaseMap
import androidx.compose.Composable
import androidx.compose.remember
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Text
import androidx.ui.material.*
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.ArrowBack
import androidx.ui.res.vectorResource

@Composable
fun HomeScreen(scaffoldState: ScaffoldState = remember { ScaffoldState() }) {
    Scaffold(
        scaffoldState = scaffoldState,
        topAppBar = {
            TopAppBar(title = { Text(text = "Home") },
                actions = {
                    Button(onClick = {
                        Status.currentScreen=Screen.Statistics
                    }){
                        Text("Statistics")
                    }
                    Button(onClick = {
                        Status.currentScreen=Screen.AboControl
                    }) {
                        Text("AboControl")
                    }
                    Button(onClick = {
                        Status.currentScreen=Screen.Profil
                    }) {
                        Text("Profile")
                    }
                })

        },
        bodyContent = {
            Text("Empty Home Screen")
        }


    )
}