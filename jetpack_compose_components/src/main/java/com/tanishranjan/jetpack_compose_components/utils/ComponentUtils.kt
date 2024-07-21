package com.tanishranjan.jetpack_compose_components.utils

import androidx.compose.ui.graphics.Color

class ComponentUtils {

    companion object {

        fun Color.useIfUnspecified(alternateColor: Color): Color {
            return if (this == Color.Unspecified) {
                alternateColor
            } else {
                this
            }
        }

    }

}