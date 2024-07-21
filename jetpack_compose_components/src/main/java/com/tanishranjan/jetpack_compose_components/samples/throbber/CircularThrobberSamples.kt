package com.tanishranjan.jetpack_compose_components.samples.throbber

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.tanishranjan.jetpack_compose_components.composables.throbber.CircularThrobber
import com.tanishranjan.jetpack_compose_components.properties.throbber.CircularThrobberVariants

@Composable
internal fun RippleSample() {
    CircularThrobber(
        modifier = Modifier.size(50.dp),
        variant = CircularThrobberVariants.Ripple(
            color = Color.Red
        )
    )
}

@Composable
internal fun WindowsSample() {
    CircularThrobber(
        modifier = Modifier.size(50.dp),
        variant = CircularThrobberVariants.Windows(
            color = Color.Red
        )
    )
}

@Composable
internal fun WebSample() {
    CircularThrobber(
        modifier = Modifier.size(50.dp),
        variant = CircularThrobberVariants.Web(
            color = Color.Red
        )
    )
}

@Composable
internal fun LegacySample() {
    CircularThrobber(
        modifier = Modifier.size(50.dp),
        variant = CircularThrobberVariants.Legacy(
            color = Color.Red
        )
    )
}