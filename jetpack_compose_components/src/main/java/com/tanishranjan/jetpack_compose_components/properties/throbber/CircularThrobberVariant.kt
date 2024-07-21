package com.tanishranjan.jetpack_compose_components.properties.throbber

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

sealed class CircularThrobberVariants {

    data class Ripple(
        val color: Color = Color.Unspecified
    ) : CircularThrobberVariants()

    data class Windows(
        val strokeWidth: Dp = 4.dp,
        val color: Color = Color.Unspecified,
        val trackColor: Color = Color.Transparent,
        val deflectionAngle: Float = 0f
    ) : CircularThrobberVariants()

    data class Web(
        val color: Color = Color.Unspecified,
        val strokeWidth: Dp = 4.dp,
        val deflectionAngle: Float = 0f
    ) : CircularThrobberVariants()

    data class Legacy(
        val color: Color = Color.Unspecified,
        val dotRadius: Dp = 4.dp
    ): CircularThrobberVariants()

}