package com.tanishranjan.jetpack_compose_components.composables.throbber

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.StartOffset
import androidx.compose.animation.core.StartOffsetType
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.min
import kotlin.math.cos
import kotlin.math.sin

/**
 * A composable function that creates a rippling circular throbber.
 *
 * @param modifier [Modifier] to be applied to the entire composable.
 * @param color The color of the ripple.
 *
 * @since 1.0.0
 * @author Tanish Ranjan
 * @sample com.tanishranjan.jetpack_compose_components.samples.throbber.CircularThrobber1Sample
 */
@Composable
fun CircularThrobber1(
    modifier: Modifier = Modifier,
    color: Color = MaterialTheme.colorScheme.primary,
) {

    BoxWithConstraints(
        modifier = modifier
    ) {

        val density = LocalDensity.current
        val minDimension = remember {
            with(density) {
                min(maxHeight, maxWidth).toPx()
            }
        }
        val transition = rememberInfiniteTransition(label = "Infinite Transition")

        val rippleColor: Color by transition.animateColor(
            initialValue = color,
            targetValue = Color.Transparent,
            animationSpec = infiniteRepeatable(
                animation = tween(
                    durationMillis = 1000,
                    easing = FastOutLinearInEasing
                )
            ),
            label = "Ripple Color"
        )

        val size by transition.animateFloat(
            initialValue = 0f,
            targetValue = minDimension / 2,
            animationSpec = infiniteRepeatable(
                animation = tween(
                    durationMillis = 1000
                )
            ),
            label = "Ripple Size"
        )

        Canvas(
            Modifier.fillMaxSize()
        ) {

            drawCircle(
                rippleColor,
                size
            )

        }

    }

}

/**
 * A composable function that creates a circular throbber similar to the Windows loading indicator.
 *
 * @param modifier [Modifier] to be applied to the entire composable.
 * @param strokeWidth The width of the throbber stroke in density pixels (dp).
 * @param color The color of the throbber.
 * @param trackColor The color of the background track for the throbber.
 * @param deflectionAngle A deflection angle in degrees applied to the starting position of the arc.
 *
 * @since 1.0.0
 * @author Tanish Ranjan
 * @sample com.tanishranjan.jetpack_compose_components.samples.throbber.CircularThrobber2Sample
 */
@Composable
fun CircularThrobber2(
    modifier: Modifier = Modifier,
    strokeWidth: Dp = 4.dp,
    color: Color = MaterialTheme.colorScheme.primary,
    trackColor: Color = Color.Transparent,
    deflectionAngle: Float = 0f
) {

    val transition = rememberInfiniteTransition(label = "Infinite Transition")

    val startAngle by transition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 1000,
                easing = LinearEasing
            ),
            repeatMode = RepeatMode.Restart
        ),
        label = "Start Angle"
    )

    val sweepAngle by transition.animateFloat(
        initialValue = 360f,
        targetValue = 0f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 1500,
                easing = LinearEasing
            ),
            repeatMode = RepeatMode.Reverse
        ),
        label = "Sweep Angle"
    )

    Canvas(modifier = modifier) {

        val strokeWidthPixels = strokeWidth.toPx()

        drawCircle(
            color = trackColor,
            style = Stroke(width = strokeWidthPixels),
            radius = size.minDimension / 2 - strokeWidthPixels / 2,
            center = Offset(
                x = size.minDimension / 2,
                y = size.minDimension / 2
            )
        )

        drawArc(
            color = color,
            startAngle = startAngle - 90f + deflectionAngle,
            sweepAngle = sweepAngle,
            useCenter = false,
            style = Stroke(width = strokeWidthPixels, cap = StrokeCap.Round),
            topLeft = Offset(
                x = strokeWidthPixels / 2,
                y = strokeWidthPixels / 2
            ),
            size = Size(
                width = size.minDimension - strokeWidthPixels,
                height = size.minDimension - strokeWidthPixels,
            )
        )

    }

}

/**
 * A composable function that creates a circular throbber similar to the Web loading indicator.
 *
 * @param modifier [Modifier] to be applied to the entire composable.
 * @param strokeWidth The width of the throbber stroke in density pixels (dp).
 * @param color The color of the throbber.
 * @param deflectionAngle A deflection angle in degrees applied to the starting position of the arc.
 *
 * @since 1.0.0
 * @author Tanish Ranjan
 * @sample com.tanishranjan.jetpack_compose_components.samples.throbber.CircularThrobber3Sample
 */
@Composable
fun CircularThrobber3(
    modifier: Modifier = Modifier,
    color: Color = MaterialTheme.colorScheme.primary,
    strokeWidth: Dp = 4.dp,
    deflectionAngle: Float = 0f
) {

    val transition = rememberInfiniteTransition(label = "Infinite Transition")

    val angle by transition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 1000,
                easing = LinearEasing
            )
        ),
        label = "Rotation Angle"
    )

    Canvas(
        modifier = Modifier
            .rotate(-90f + angle + deflectionAngle)
            .then(modifier)
    ) {

        val strokeWidthPixels = strokeWidth.toPx()

        drawArc(
            brush = Brush.sweepGradient(
                listOf(
                    Color.Transparent,
                    color,
                )
            ),
            startAngle = 5f,
            sweepAngle = 345f,
            useCenter = false,
            style = Stroke(width = strokeWidthPixels, cap = StrokeCap.Round),
            topLeft = Offset(
                x = strokeWidthPixels / 2,
                y = strokeWidthPixels / 2
            ),
            size = Size(
                width = size.minDimension - strokeWidthPixels,
                height = size.minDimension - strokeWidthPixels,
            )
        )

    }

}

/**
 * A composable function that creates a circular throbber with eight dots.
 *
 * @param modifier [Modifier] to be applied to the entire composable.
 * @param color The color of the dots.
 * @param dotRadius The radius of the dots in density pixels (dp).
 *
 * @since 1.0.0
 * @author Tanish Ranjan
 * @sample com.tanishranjan.jetpack_compose_components.samples.throbber.CircularThrobber4Sample
 */
@Composable
fun CircularThrobber4(
    modifier: Modifier = Modifier,
    color: Color = MaterialTheme.colorScheme.primary,
    dotRadius: Dp = 4.dp
) {

    val transition = rememberInfiniteTransition(label = "Infinite Transition")

    val dot1 by transition.animateFloat(
        initialValue = 0.25f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 800),
            repeatMode = RepeatMode.Reverse,
            initialStartOffset = StartOffset(
                offsetMillis = 1400,
                offsetType = StartOffsetType.FastForward
            )
        ),
        label = "Dot1 Size Percentage"
    )

    val dot2 by transition.animateFloat(
        initialValue = 0.25f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 800),
            repeatMode = RepeatMode.Reverse,
            initialStartOffset = StartOffset(
                offsetMillis = 1200,
                offsetType = StartOffsetType.FastForward
            )
        ),
        label = "Dot2 Size Percentage"
    )

    val dot3 by transition.animateFloat(
        initialValue = 0.25f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 800),
            repeatMode = RepeatMode.Reverse,
            initialStartOffset = StartOffset(
                offsetMillis = 1000,
                offsetType = StartOffsetType.FastForward
            )
        ),
        label = "Dot3 Size Percentage"
    )

    val dot4 by transition.animateFloat(
        initialValue = 0.25f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 800),
            repeatMode = RepeatMode.Reverse,
            initialStartOffset = StartOffset(
                offsetMillis = 800,
                offsetType = StartOffsetType.FastForward
            )
        ),
        label = "Dot4 Size Percentage"
    )

    val dot5 by transition.animateFloat(
        initialValue = 0.25f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 800),
            repeatMode = RepeatMode.Reverse,
            initialStartOffset = StartOffset(
                offsetMillis = 600,
                offsetType = StartOffsetType.FastForward
            )
        ),
        label = "Dot5 Size Percentage"
    )

    val dot6 by transition.animateFloat(
        initialValue = 0.25f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 800),
            repeatMode = RepeatMode.Reverse,
            initialStartOffset = StartOffset(
                offsetMillis = 400,
                offsetType = StartOffsetType.FastForward
            )
        ),
        label = "Dot6 Size Percentage"
    )

    val dot7 by transition.animateFloat(
        initialValue = 0.25f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 800),
            repeatMode = RepeatMode.Reverse,
            initialStartOffset = StartOffset(
                offsetMillis = 200,
                offsetType = StartOffsetType.FastForward
            )
        ),
        label = "Dot7 Size Percentage"
    )

    val dot8 by transition.animateFloat(
        initialValue = 0.25f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 800),
            repeatMode = RepeatMode.Reverse
        ),
        label = "Dot8 Size Percentage"
    )

    val dotSizes = listOf(dot1, dot2, dot3, dot4, dot5, dot6, dot7, dot8)

    Canvas(modifier) {
        val centerX = size.minDimension / 2f
        val centerY = size.minDimension / 2f
        val radius = size.minDimension / 2f - dotRadius.toPx()

        repeat(8) { index ->
            val angle = Math.PI * 2 * (index.toDouble() / 8)
            val x = centerX + radius * cos(angle)
            val y = centerY + radius * sin(angle)
            drawCircle(
                color = color,
                center = Offset(x.toFloat(), y.toFloat()),
                radius = dotRadius.toPx() * dotSizes[index]
            )
        }
    }

}