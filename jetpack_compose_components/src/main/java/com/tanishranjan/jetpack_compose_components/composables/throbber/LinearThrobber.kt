package com.tanishranjan.jetpack_compose_components.composables.throbber

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.StartOffset
import androidx.compose.animation.core.StartOffsetType
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * A composable function that creates a linear throbber with three blooming dots.
 *
 * @param modifier [Modifier] to be applied to the entire composable.
 * @param color The color of the dots.
 * @param dotRadius The radius of the dots in density pixels (dp).
 * @param spaceBetweenDots The horizontal space between the dots in density pixels (dp).
 *
 * @since 1.0.0
 * @author Tanish Ranjan
 * @sample com.tanishranjan.jetpack_compose_components.samples.throbber.LinearThrobber1Sample
 */
@Composable
fun LinearThrobber1(
    modifier: Modifier = Modifier,
    dotRadius: Dp = 4.dp,
    spaceBetweenDots: Dp = 4.dp,
    color: Color = MaterialTheme.colorScheme.primary
) {

    val transition = rememberInfiniteTransition(label = "Infinite Transition")

    val dot1 by transition.animateFloat(
        initialValue = 0.25f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 300,
                delayMillis = 250,
                easing = LinearEasing
            ),
            repeatMode = RepeatMode.Reverse,
            initialStartOffset = StartOffset(
                offsetMillis = 300,
                offsetType = StartOffsetType.FastForward
            )
        ),
        label = "Dot1 Size Percentage"
    )

    val dot2 by transition.animateFloat(
        initialValue = 0.25f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 300,
                delayMillis = 250,
                easing = LinearEasing
            ),
            repeatMode = RepeatMode.Reverse,
            initialStartOffset = StartOffset(
                offsetMillis = 150,
                offsetType = StartOffsetType.FastForward
            )
        ),
        label = "Dot2 Size Percentage"
    )

    val dot3 by transition.animateFloat(
        initialValue = 0.25f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 300,
                delayMillis = 250,
                easing = LinearEasing
            ),
            repeatMode = RepeatMode.Reverse
        ),
        label = "Dot3 Size Percentage"
    )

    Canvas(
        modifier = modifier
    ) {

        val radius = dotRadius.toPx()
        val gap = radius * 2 + spaceBetweenDots.toPx()
        val widthCenter = size.width / 2
        val heightCenter = size.height / 2

        drawCircle(
            color = color,
            radius = radius * dot1,
            center = Offset(
                widthCenter - gap,
                heightCenter
            )
        )

        drawCircle(
            color = color,
            radius = radius * dot2,
            center = Offset(
                widthCenter,
                heightCenter
            )
        )

        drawCircle(
            color = color,
            radius = radius * dot3,
            center = Offset(
                widthCenter + gap,
                heightCenter
            )
        )

    }

}

/**
 * A composable function that creates a linear throbber with three bouncing dots.
 *
 * @param modifier [Modifier] to be applied to the entire composable.
 * @param color The color of the dots.
 * @param dotRadius The radius of the dots in density pixels (dp).
 * @param spaceBetweenDots The horizontal space between the dots in density pixels (dp).
 * @param travelDistance The vertical distance each dot travels up and down in density pixels (dp).
 *
 * @since 1.0.0
 * @author Tanish Ranjan
 * @sample com.tanishranjan.jetpack_compose_components.samples.throbber.LinearThrobber2Sample
 */
@Composable
fun LinearThrobber2(
    modifier: Modifier = Modifier,
    dotRadius: Dp = 4.dp,
    spaceBetweenDots: Dp = 4.dp,
    travelDistance: Dp = 8.dp,
    color: Color = MaterialTheme.colorScheme.primary
) {

    val density = LocalDensity.current
    val transition = rememberInfiniteTransition(label = "Infinite Transition")

    val travelDistancePixels = remember {
        with(density) {
            travelDistance.toPx()
        }
    }

    val dot1Offset by transition.animateFloat(
        initialValue = travelDistancePixels,
        targetValue = 0f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 300,
                delayMillis = 250,
                easing = LinearEasing
            ),
            repeatMode = RepeatMode.Reverse,
            initialStartOffset = StartOffset(
                offsetMillis = 300,
                offsetType = StartOffsetType.FastForward
            )
        ),
        label = "Dot1 Offset"
    )

    val dot2Offset by transition.animateFloat(
        initialValue = travelDistancePixels,
        targetValue = 0f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 300,
                delayMillis = 250,
                easing = LinearEasing
            ),
            repeatMode = RepeatMode.Reverse,
            initialStartOffset = StartOffset(
                offsetMillis = 150,
                offsetType = StartOffsetType.FastForward
            )
        ),
        label = "Dot2 Offset"
    )

    val dot3Offset by transition.animateFloat(
        initialValue = travelDistancePixels,
        targetValue = 0f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 300,
                delayMillis = 250,
                easing = LinearEasing
            ),
            repeatMode = RepeatMode.Reverse
        ),
        label = "Dot3 Offset"
    )

    Canvas(
        modifier = modifier
    ) {

        val radius = dotRadius.toPx()
        val gap = radius * 2 + spaceBetweenDots.toPx()
        val widthCenter = size.width / 2
        val heightCenter = size.height / 2
        val dotOffsetY = heightCenter - travelDistancePixels / 2

        drawCircle(
            color = color,
            radius = radius,
            center = Offset(
                widthCenter - gap,
                dotOffsetY + dot1Offset
            )
        )

        drawCircle(
            color = color,
            radius = radius,
            center = Offset(
                widthCenter,
                dotOffsetY + dot2Offset
            )
        )

        drawCircle(
            color = color,
            radius = radius,
            center = Offset(
                widthCenter + gap,
                dotOffsetY + dot3Offset
            )
        )

    }

}