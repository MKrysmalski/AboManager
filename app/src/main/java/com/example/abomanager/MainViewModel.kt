package com.example.abomanager

import androidx.compose.Model
import java.util.Collections
import java.util.Collections.list

@Model
class MainViewModel {
    //This should maybe be read from a file
    val list = mutableListOf<AboViewModel>()
    val abos = AboList(list)

    constructor() {
        list.add(AboViewModel("Netflix"))
        list.add(AboViewModel("Michael"))
        list.add(AboViewModel("Markus"))
        list.add(AboViewModel("Franziska"))
        list.add(AboViewModel("Hauser"))
        list.add(AboViewModel("George"))
        list.add(AboViewModel("Peter Pan"))
    }
}