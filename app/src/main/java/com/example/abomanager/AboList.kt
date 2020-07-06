package com.example.abomanager

import java.util.Collections
import java.util.Collections.list

class AboList {
    val aboList = mutableListOf<Abo>()

    public fun AddAbo(abo: Abo){
        aboList.add(abo)
    }

    public fun RemoveAbo(aboName: String){
        var zaehler: Int = 0

        for(Abo in aboList){
            zaehler++

            if(Abo.name == aboName) {
                zaehler
                break;
            }
        }

        if(zaehler != -1){
            aboList.removeAt(zaehler);
        }
    }
}