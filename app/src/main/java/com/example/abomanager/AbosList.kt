package com.example.abomanager

import androidx.compose.Composable
import androidx.ui.foundation.VerticalScroller
import androidx.ui.layout.Column

@Composable
fun AbosList(abos: List<AboViewModel>) {
    VerticalScroller {
        Column {
            abos.forEach {
                AboRow(abo = it)
            }
        }
    }
}