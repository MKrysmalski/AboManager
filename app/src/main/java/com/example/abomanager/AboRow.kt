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
            text = "Subscription: " + abo.name,
            modifier = Modifier.padding(top= 4.dp),
            style = MaterialTheme.typography.body1
        )
        Text(
            text = "My Color: " + abo.color,
            modifier = Modifier.padding(top= 4.dp),
            style = MaterialTheme.typography.body1
        )
        Text(
            text = "Time Span: " + abo.abo_variant.toString(),
            modifier = Modifier.padding(top= 4.dp),
            style = MaterialTheme.typography.body1
        )
        Text(
            text = "Costs: " + abo.cost.toString(),
            modifier = Modifier.padding(top= 4.dp),
            style = MaterialTheme.typography.body1
        )
        Text(
            text = "Runtime: " + abo.run_time.toString(),
            modifier = Modifier.padding(top= 4.dp),
            style = MaterialTheme.typography.body1
        )
        Text(
            text = "Started: " + abo.starting_day.toString(),
            modifier = Modifier.padding(top= 4.dp),
            style = MaterialTheme.typography.body1
        )
        Divider(Modifier.padding(top= 8.dp, bottom= 4.dp))
    }
}