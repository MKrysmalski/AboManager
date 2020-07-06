package com.example.abomanager

import androidx.annotation.ColorInt
import androidx.annotation.Size
import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.foundation.drawBackground
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.padding
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.unit.dp

@Composable
fun AboRow(abo: AboViewModel) {
    Column(modifier = Modifier.padding(start= 16.dp, end= 16.dp).drawBackground(color = Color(parseColor(abo.color)))) {
        Text(
            text = "Subscription: " + abo.name,
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

//Workaround because jetpack lacks the function Color.parseColor()
@ColorInt
fun parseColor(@Size(min = 1) colorString: String): Int {
    if (colorString[0] == '#') { // Use a long to avoid rollovers on #ffXXXXXX
        var color = colorString.substring(1).toLong(16)
        if (colorString.length == 7) { // Set the alpha value
            color = color or -0x1000000
        } else require(colorString.length == 9) { "Unknown color" }
        return color.toInt()
    }
    throw IllegalArgumentException("Unknown color")
}