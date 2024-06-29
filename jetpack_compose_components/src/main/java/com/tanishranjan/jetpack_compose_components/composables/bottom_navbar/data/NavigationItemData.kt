package com.tanishranjan.jetpack_compose_components.composables.bottom_navbar.data

import androidx.compose.ui.graphics.vector.ImageVector

/**
 * A data class representing a single navigation item for a bottom navigation bar.
 *
 * @param icon The image vector resource representing the icon for the navigation item.
 * @param title The title displayed for the navigation item.
 *
 * @since 1.0.0
 * @author Tanish Ranjan
 */
data class NavigationItemData(
    val icon: ImageVector,
    val title: String,
)