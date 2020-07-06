package com.example.abomanager

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.layout.Column
import androidx.ui.layout.padding
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.unit.dp

@Composable
fun AboRow(abo: AboViewModel) {
    Column(modifier = Modifier.padding(start= 16.dp, end= 16.dp)) {
        Text(
            text = abo.name,
            modifier = Modifier.padding(top= 4.dp),
            style = MaterialTheme.typography.body1
        )
        Divider(Modifier.padding(top= 8.dp, bottom= 4.dp))
    }
}