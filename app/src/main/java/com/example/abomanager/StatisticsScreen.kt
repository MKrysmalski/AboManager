package com.example.abomanager

import androidx.compose.Composable
import androidx.compose.remember
import androidx.ui.core.ContentScale
import androidx.ui.core.Modifier
import androidx.ui.core.clip
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.graphics.Color.Companion.DarkGray
import androidx.ui.layout.*
import androidx.ui.material.*
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.ArrowBack
import androidx.ui.res.imageResource
import androidx.ui.res.vectorResource
import androidx.ui.text.style.TextOverflow
import androidx.ui.unit.dp

val navButtonPadding : Modifier = Modifier.padding(5.dp);



@Composable
fun StatisticsScreen(viewModel: MainViewModel, scaffoldState: ScaffoldState = remember { ScaffoldState() }) {
    Scaffold(
        scaffoldState = scaffoldState,

        topAppBar = {
            TopAppBar(title = { Text("Statistics") })
        },

        bodyContent = {
            MaterialTheme() {
                val typography = MaterialTheme.typography
                Column(
                    modifier = Modifier.padding(1.dp,0.dp,0.dp,0.dp)
                ) {
                    Text(
                        "Cost per day:",
                        style = typography.h6,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis)
                    Text(viewModel.stats.TotalSum.toString(),
                        style = typography.body2)
                    Text(
                        "Cost per Month:",
                        style = typography.h6,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis)
                    Text((viewModel.stats.TotalSum*30).toString(),
                        style = typography.body2)
                    Text(
                        "Cost per Year:",
                        style = typography.h6,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis)
                    Text((viewModel.stats.TotalSum*365).toString(),
                        style = typography.body2)
                    Text(
                        "Most expensive Abo (per Month):",
                        style = typography.h6,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis)
                    Text(viewModel.stats.highest.toString(),
                        style = typography.body2)
                    Text(
                        "Cheapest expensive Abo (per Month):",
                        style = typography.h6,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis)
                    Text(viewModel.stats.lowest.toString(),
                        style = typography.body2)
                    Text(
                        "Average cost per Abo (per Month):",
                        style = typography.h6,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis)
                    Text(viewModel.stats.average.toString(),
                        style = typography.body2)
                }
            }
        },
        bottomAppBar = {
            BotNavigation(vModel = viewModel)
        }

    )
}

