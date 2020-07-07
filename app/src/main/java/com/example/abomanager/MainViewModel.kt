package com.example.abomanager

import androidx.compose.Model
import java.util.*
import java.util.Collections.list

@Model
class MainViewModel {
    //This should maybe be read from a file
    val list = mutableListOf<AboViewModel>()
    val abos = AboList(list)
    val stats = Calculator(list)

    constructor() {
        list.add(AboViewModel("Netflix", 1,1.0, Calendar.getInstance().getTime(),1,"#053225"))
        list.add(AboViewModel("Michael"))
        list.add(AboViewModel("Markus"))
        list.add(AboViewModel("Franziska"))
        list.add(AboViewModel("Hauser"))
        list.add(AboViewModel("George"))
        list.add(AboViewModel("Peter Pan"))
    }

    fun UpdateList() {

    }
}