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
        abo.costsPerDay=abo.cost/abo.abo_variant
    }

    fun TotalCostPerWeek(abo: AboViewModel){
        abo.costsPerWeek=abo.costsPerDay*7
    }

    fun TotalCostPerMonth(abo: AboViewModel){
        abo.costsPerMonth=abo.costsPerDay*30
    }

    fun TotalCostPerYear(abo: AboViewModel){
        abo.costsPerYear=abo.costsPerDay*365
    }

    //The subscription with the highest cost
    fun GetLowest(){
        var tmp: Double = 0.0
        list.forEach {
            //Compare Highest with tmp
            if(tmp<it.costsPerDay){
                tmp=it.costsPerDay
            }
        }
        lowest=tmp;
    }

    //The subscription with the lowest cost
    fun GetHighest(abo:AboViewModel){
        var tmp: Double = abo.costsPerDay
        list.forEach {
            if(tmp>it.costsPerDay){
                tmp=it.costsPerDay
            }
        }
        highest=tmp
    }

    //Average from all subscriptions
    fun GetAverage(){
        var tmp:Double=0.0
        list.forEach {
            tmp+=it.costsPerDay
            }
        average=tmp/list.size
    }
    //Percentile in a list from each subscription
    fun GetPercentages(abo:AboViewModel){
        var tmp:Double=0.0
        list.forEach {
            tmp+=it.costsPerDay
            abo.PercentageCost=100/tmp*abo.costsPerDay
        }
    }
}

