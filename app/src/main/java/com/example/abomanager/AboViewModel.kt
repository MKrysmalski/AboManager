package com.example.abomanager

import java.util.*

data class AboViewModel(
    val name: String,
    var abo_variant : Int = -1,
    var cost : Double = 0.0,
    var starting_day : Date = Calendar.getInstance().getTime(),
    var run_time : Int = 1,
    var color : String = "#FFFFFF"
    ) {
}