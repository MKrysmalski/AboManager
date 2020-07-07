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
        list.add(AboViewModel("Netflix", 1,2.0, Calendar.getInstance().getTime(),1,"#053225"))
        UpdateAbo(list[list.count()-1])
        list.add(AboViewModel("Netflix", 1,5.3, Calendar.getInstance().getTime(),1,"#053225"))
        UpdateAbo(list[list.count()-1])
        list.add(AboViewModel("Netflix", 1,4.0, Calendar.getInstance().getTime(),1,"#053225"))
        UpdateAbo(list[list.count()-1])
        list.add(AboViewModel("Netflix", 10,10.2, Calendar.getInstance().getTime(),1,"#053225"))
        UpdateAbo(list[list.count()-1])
        list.add(AboViewModel("Netflix", 1,2.0, Calendar.getInstance().getTime(),1,"#053225"))
        UpdateAbo(list[list.count()-1])


        list.forEach {
           UpdateAbo(it)
        }
    }

    fun UpdateList() {

    }

    fun UpdateAbo(abo: AboViewModel) {
        stats.CostPerYear(abo)
        stats.CostPerDay(abo)
        stats.CostPerMonth(abo)
        stats.CostPerWeek(abo)
        stats.GetPercentages(abo)
        stats.TotalSumPerDay()
        stats.GetHighest(abo)
        stats.GetLowest()
        stats.GetPercentages(abo)
        stats.GetAverage()
    }
}