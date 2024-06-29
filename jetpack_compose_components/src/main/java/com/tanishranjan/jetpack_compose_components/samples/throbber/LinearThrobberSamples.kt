package com.tanishranjan.jetpack_compose_components.samples.throbber

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.tanishranjan.jetpack_compose_components.composables.throbber.LinearThrobber1
import com.tanishranjan.jetpack_compose_components.composables.throbber.LinearThrobber2

@Composable
internal fun LinearThrobber1Sample() {
    LinearThrobber1(
        modifier = Modifier.size(50.dp),
        color = Color.Red
    )
}

@Composable
internal fun LinearThrobber2Sample() {
    LinearThrobber2(
        modifier = Modifier.size(50.dp),
        color = Color.Red
    )
}