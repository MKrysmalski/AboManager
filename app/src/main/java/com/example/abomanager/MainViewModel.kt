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
        UpdateAbo(list[list.count()])
        list.add(AboViewModel("Netflix", 1,5.3, Calendar.getInstance().getTime(),1,"#053225"))
        UpdateAbo(list[list.count()])
        list.add(AboViewModel("Netflix", 1,4.0, Calendar.getInstance().getTime(),1,"#053225"))
        UpdateAbo(list[list.count()])
        list.add(AboViewModel("Netflix", 1,10.2, Calendar.getInstance().getTime(),1,"#053225"))
        UpdateAbo(list[list.count()])
        list.add(AboViewModel("Netflix", 1,2.0, Calendar.getInstance().getTime(),1,"#053225"))
        UpdateAbo(list[list.count()])

        stats.CostPerDay(list[0])

        stats.TotalSumPerDay()
    }

    fun UpdateList() {

    }

    fun UpdateAbo(abo: AboViewModel) {
        stats.CostPerYear(abo)
        stats.CostPerDay(abo)
        stats.CostPerMonth(abo)
        stats.CostPerWeek(abo)
        stats.GetPercentages(abo)
    }
}