package com.example.abomanager

class Calculator(abos: List<AboViewModel>) {
    val list = abos
    var average: Double = 0.0
    var highest: Double = 0.0
    var lowest: Double = 0.0

    //Even out the subscriptions
    fun MakeEven(){
        // Here should be even more gehirnschmalz
        // costs / abo_variant = costs per day
    }

    //The cost from one subscription in the complete period
    fun TotalCostPerDay(abo: AboViewModel){
        // costs / abo_variant
    }

    fun TotalCostPerWeek(abo: AboViewModel){
        // costs per day * week = Kosten pro Woche
    }

    fun TotalCostPerMonth(abo: AboViewModel){
        // costs per day * month = Kosten pro Monat
    }

    fun TotalCostPerYear(abo: AboViewModel){
        // costs per day * year = Kosten pro Jahr
    }

    //The subscription with the highest cost
    fun GetHighest(){
        var tmp: Double = 0.0
        list.forEach {
            //Compare Highest with tmp
        }
    }

    //The subscription with the lowest cost
    fun GetLowest(){

    }

    //Average from all subscriptions
    fun GetAverage(){

    }

    //Percentile in a list from each subscription
    fun GetPercentages(){
        // Here should be some gehirnschmalz
    }
}