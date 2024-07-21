package com.tanishranjan.jetpack_compose_components.properties.throbber

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

sealed class LinearThrobberVariant {

    data class BloomingDots(
        val dotRadius: Dp = 4.dp,
        val spaceBetweenDots: Dp = 4.dp,
        val dotColor: Color = Color.Unspecified
    ) : LinearThrobberVariant()

    data class BouncingDots(
        val dotRadius: Dp = 4.dp,
        val spaceBetweenDots: Dp = 4.dp,
        val travelDistance: Dp = 8.dp,
        val dotColor: Color = Color.Unspecified
    ) : LinearThrobberVariant()

}