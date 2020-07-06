package com.example.abomanager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.Model
import androidx.ui.animation.Crossfade
import androidx.ui.core.*
import androidx.ui.foundation.*
import androidx.ui.layout.*
import androidx.ui.material.*
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                MainContent()
            }
        }
    }
}

@Composable
private fun MainContent() {
    Crossfade(Status.currentScreen) { screen ->
        Surface(color = MaterialTheme.colors.background) {
            when (screen) {
                is Screen.Home -> HomeScreen(screen.viewModel)
                is Screen.Profil -> ProfilScreen(screen.viewModel)
                is Screen.AboControl -> AboControlScreen(screen.viewModel)
                is Screen.Statistics -> StatisticsScreen(screen.viewModel)
            }
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MaterialTheme {
        MainContent()
    }
}