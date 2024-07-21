package com.tanishranjan.jetpack_compose_components.samples.throbber

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.tanishranjan.jetpack_compose_components.composables.throbber.LinearThrobber
import com.tanishranjan.jetpack_compose_components.properties.throbber.LinearThrobberVariant

@Composable
internal fun BloomingDotsSample() {
    LinearThrobber(
        modifier = Modifier.size(50.dp),
        variant = LinearThrobberVariant.BloomingDots(dotColor = Color.Red)
    )
}

@Composable
internal fun BouncingDotsSample() {
    LinearThrobber(
        modifier = Modifier.size(50.dp),
        variant = LinearThrobberVariant.BouncingDots(dotColor = Color.Red)
    )
}