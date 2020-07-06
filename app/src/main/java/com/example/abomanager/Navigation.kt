package com.example.abomanager

import androidx.compose.Model

sealed class Screen {
    class Home(val viewModel: MainViewModel) : Screen()              //Overview for the costs
    class Profil(val viewModel: MainViewModel) : Screen()            //Setting for language, profil, color etc.
    class AboControl(val viewModel: MainViewModel) : Screen()        //Manage your abonnements
    class AboControlEdit(val viewModel: MainViewModel) : Screen()    //Add or modify an abonnement
    class Statistics(val viewModel: MainViewModel) : Screen()        //Indepth detail for the application
    data class SecondLevel(val message: String) : Screen()
}

@Model
object Status{
    var currentScreen: Screen = Screen.Home(MainViewModel())
}