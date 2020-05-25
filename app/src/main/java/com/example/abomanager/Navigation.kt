package com.example.abomanager

import androidx.compose.Model

sealed class Screen {
    object Home : Screen()              //Overview for the costs
    object Profil : Screen()            //Setting for language, profil, color etc.
    object AboControl : Screen()        //Manage your abonnements
    object AboControlEdit : Screen()    //Add or modify an abonnement
    object Statistics : Screen()        //Indepth detail for the application
    data class SecondLevel(val message: String) : Screen()
}

@Model
object Status{
    var currentScreen: Screen = Screen.Home
}