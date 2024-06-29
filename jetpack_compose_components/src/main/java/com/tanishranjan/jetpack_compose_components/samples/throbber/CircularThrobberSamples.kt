package com.tanishranjan.jetpack_compose_components.samples.throbber

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.tanishranjan.jetpack_compose_components.composables.throbber.CircularThrobber1
import com.tanishranjan.jetpack_compose_components.composables.throbber.CircularThrobber2
import com.tanishranjan.jetpack_compose_components.composables.throbber.CircularThrobber3
import com.tanishranjan.jetpack_compose_components.composables.throbber.CircularThrobber4

@Composable
internal fun CircularThrobber1Sample() {
    CircularThrobber1(
        modifier = Modifier.size(50.dp),
        color = Color.Red
    )
}

@Composable
internal fun CircularThrobber2Sample() {
    CircularThrobber2(
        modifier = Modifier.size(50.dp),
        color = Color.Red
    )
}

@Composable
internal fun CircularThrobber3Sample() {
    CircularThrobber3(
        modifier = Modifier.size(50.dp),
        color = Color.Red
    )
}

@Composable
internal fun CircularThrobber4Sample() {
    CircularThrobber4(
        modifier = Modifier.size(50.dp),
        color = Color.Red
    )
}