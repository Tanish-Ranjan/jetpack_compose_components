package com.tanishranjan.jetpack_compose_components.properties.bottom_navbar

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tanishranjan.jetpack_compose_components.composables.bottom_navbar.data.NavigationItemData

sealed class BottomNavBarVariant {

    data class Minimal(
        val navItems: Collection<NavigationItemData>,
        val iconSize: Dp = 24.dp,
        val shrinkSize: Dp = 4.dp,
        val defaultSelectedIndex: Int = 0,
        val shape: Shape = RoundedCornerShape(8.dp),
        val navigationBarColor: Color = Color.Unspecified,
        val itemTint: Color = Color.Unspecified,
        val selectedItemTint: Color = Color.Unspecified,
    ) : BottomNavBarVariant()

    data class Standard(
        val navItems: Collection<NavigationItemData>,
        val selectedItemCornerRadius: Dp = 4.dp,
        val internalPadding: Dp = 8.dp,
        val iconSize: Dp = 24.dp,
        val defaultSelectedIndex: Int = 0,
        val shape: Shape = RoundedCornerShape(8.dp),
        val navigationBarColor: Color = Color.Unspecified,
        val itemTint: Color = Color.Unspecified,
        val selectedItemTint: Color = Color.Unspecified,
        val selectedBackgroundTint: Color = Color.Unspecified,
    ) : BottomNavBarVariant()

    data class Filled(
        val navItems: Collection<NavigationItemData>,
        val iconSize: Dp = 24.dp,
        val defaultSelectedIndex: Int = 0,
        val shape: Shape = RoundedCornerShape(8.dp),
        val navigationBarColor: Color = Color.Unspecified,
        val itemTint: Color = Color.Unspecified,
        val selectedItemTint: Color = Color.Unspecified,
        val selectedBackgroundTint: Color = Color.Unspecified,
    ) : BottomNavBarVariant()

    data class StandardText(
        val navItems: Collection<NavigationItemData>,
        val selectedItemCornerRadius: Dp = 4.dp,
        val internalPadding: Dp = 8.dp,
        val iconSize: Dp = 24.dp,
        val fontSize: TextUnit = 12.sp,
        val defaultSelectedIndex: Int = 0,
        val shape: Shape = RoundedCornerShape(8.dp),
        val navigationBarColor: Color = Color.Unspecified,
        val itemTint: Color = Color.Unspecified,
        val selectedItemTint: Color = Color.Unspecified,
        val selectedBackgroundTint: Color = Color.Unspecified,
    ) : BottomNavBarVariant()

    data class Sway(
        val navItems: Collection<NavigationItemData>,
        val internalPadding: Dp = 8.dp,
        val iconSize: Dp = 24.dp,
        val fontSize: TextUnit = 12.sp,
        val defaultSelectedIndex: Int = 0,
        val selectedItemOffset: Dp = 8.dp,
        val shape: Shape = RoundedCornerShape(8.dp),
        val navigationBarColor: Color = Color.Unspecified,
        val itemTint: Color = Color.Unspecified,
        val selectedItemTint: Color = Color.Unspecified,
        val selectedBackgroundTint: Color = Color.Unspecified,
    ) : BottomNavBarVariant()

}