@Composable
fun Throbber(
    modifier: Modifier = Modifier.size(100.dp),
    strokeWidth: Float = 8f,
    trackColor: Color = Color.Transparent,
    color: Color = MaterialTheme.colorScheme.primary,
) {

    val transition = rememberInfiniteTransition()

    val startAngle by transition.animateValue(
        initialValue = 0f,
        targetValue = 360f,
        typeConverter = Float.VectorConverter,
        animationSpec = infiniteRepeatable(
            tween(
                1000,
                0,
                LinearEasing
            ),
            RepeatMode.Restart
        )
    )

    val sweepAngle by transition.animateValue(
        initialValue = 360f,
        targetValue = 0f,
        typeConverter = Float.VectorConverter,
        animationSpec = infiniteRepeatable(
            tween(
                1500,
                0,
                LinearEasing
            ),
            RepeatMode.Reverse
        )
    )

    Canvas(
        modifier
    ) {

        drawCircle(
            trackColor,
            0.4f * size.minDimension,
            style = Stroke(width = strokeWidth)
        )

        drawArc(
            color,
            startAngle,
            sweepAngle,
            false,
            Offset(
                0.1f * (size.minDimension),
                0.1f * (size.minDimension)
            ),
            Size(
                0.8f * size.minDimension,
                0.8f * size.minDimension
            ),
            1f,
            Stroke(
                strokeWidth,
                cap = StrokeCap.Round
            )
        )

    }

}
