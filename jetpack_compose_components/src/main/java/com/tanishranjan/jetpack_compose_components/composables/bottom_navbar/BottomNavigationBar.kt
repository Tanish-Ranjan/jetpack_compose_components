package com.tanishranjan.jetpack_compose_components.composables.bottom_navbar

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tanishranjan.jetpack_compose_components.composables.bottom_navbar.data.NavigationItemData

/**
 * A bottom navigation bar composable with icons and labels.
 *
 * @param navItems A list of [NavigationItemData] objects representing the navigation items
 *                 to be displayed in the bar. Each item should have an image vector and a title.
 * @param modifier [Modifier] to be applied to the entire bottom navigation bar.
 * @param iconSize The size of the icons in the navigation bar items.
 * @param defaultSelectedIndex The default selected index of the navigation bar.
 * @param shape The shape of the bottom navigation bar.
 * @param navigationBarColor The color of the bottom navigation bar background.
 * @param itemTint The tint color for the non-selected navigation bar item icons.
 * @param selectedItemTint The tint color for the selected navigation bar item icon.
 * @param itemSelected A callback function that gets called when a navigation bar item is selected.
 *                     The function receives two arguments: the selected item index and a boolean
 *                     indicating whether the same item was reselected.
 *
 * @since 1.0.0
 * @author Tanish Ranjan
 * @sample com.tanishranjan.jetpack_compose_components.samples.bottom_navbar.BottomNavigationBar1Sample
 */
@Composable
fun BottomNavigationBar1(
    navItems: List<NavigationItemData>,
    modifier: Modifier = Modifier,
    iconSize: Dp = 24.dp,
    defaultSelectedIndex: Int = 0,
    shape: Shape = RoundedCornerShape(8.dp),
    navigationBarColor: Color = MaterialTheme.colorScheme.surfaceVariant,
    itemTint: Color = MaterialTheme.colorScheme.onSurfaceVariant,
    selectedItemTint: Color = MaterialTheme.colorScheme.primary,
    itemSelected: (index: Int, reselected: Boolean) -> Unit
) {

    Surface(
        modifier = Modifier
            .height(56.dp)
            .then(modifier),
        shape = shape,
        color = navigationBarColor,
    ) {

        var selectedItemIndex by remember {
            mutableIntStateOf(defaultSelectedIndex)
        }

        Row(
            Modifier.fillMaxSize()
        ) {

            navItems.forEachIndexed { index, item ->

                val isSelected = selectedItemIndex == index

                Box(
                    Modifier
                        .fillMaxHeight()
                        .weight(1f)
                        .clickable {
                            val reselected = selectedItemIndex == index
                            selectedItemIndex = index
                            itemSelected(selectedItemIndex, reselected)
                        },
                    contentAlignment = Alignment.Center
                ) {

                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.title,
                        modifier = Modifier.size(iconSize),
                        tint = if (isSelected) selectedItemTint else itemTint
                    )

                }

            }

        }

    }

}

/**
 * A bottom navigation bar composable with icons and labels.
 *
 * @param navItems A list of [NavigationItemData] objects representing the navigation items
 *                 to be displayed in the bar. Each item should have an image vector and a title.
 * @param modifier [Modifier] to be applied to the entire bottom navigation bar.
 * @param selectedItemCornerRadius The corner radius for the background of the selected item.
 * @param internalPadding The padding applied within the background of each navigation item.
 * @param iconSize The size of the icons in the navigation bar items.
 * @param defaultSelectedIndex The default selected index of the navigation bar.
 * @param shape The shape of the bottom navigation bar.
 * @param navigationBarColor The color of the bottom navigation bar background.
 * @param itemTint The tint color for the non-selected navigation bar item icons.
 * @param selectedItemTint The tint color for the selected navigation bar item icon.
 * @param backgroundTint The background tint color for the unselected navigation bar items.
 * @param selectedBackgroundTint The background tint color for the selected navigation bar item.
 * @param itemSelected A callback function that gets called when a navigation bar item is selected.
 *                     The function receives two arguments: the selected item index and a boolean
 *                     indicating whether the same item was reselected.
 *
 * @since 1.0.0
 * @author Tanish Ranjan
 * @sample com.tanishranjan.jetpack_compose_components.samples.bottom_navbar.BottomNavigationBar2Sample
 */
@Composable
fun BottomNavigationBar2(
    navItems: List<NavigationItemData>,
    modifier: Modifier = Modifier,
    selectedItemCornerRadius: Dp = 4.dp,
    internalPadding: Dp = 8.dp,
    iconSize: Dp = 24.dp,
    defaultSelectedIndex: Int = 0,
    shape: Shape = RoundedCornerShape(8.dp),
    navigationBarColor: Color = MaterialTheme.colorScheme.surfaceVariant,
    itemTint: Color = MaterialTheme.colorScheme.onSurfaceVariant,
    selectedItemTint: Color = MaterialTheme.colorScheme.onPrimary,
    backgroundTint: Color = Color.Transparent,
    selectedBackgroundTint: Color = MaterialTheme.colorScheme.primary,
    itemSelected: (index: Int, reselected: Boolean) -> Unit
) {

    Surface(
        modifier = Modifier
            .height(56.dp)
            .then(modifier),
        shape = shape,
        color = navigationBarColor,
    ) {

        var selectedItemIndex by remember {
            mutableIntStateOf(defaultSelectedIndex)
        }

        Row(
            Modifier.fillMaxSize()
        ) {

            navItems.forEachIndexed { index, item ->

                val isSelected = selectedItemIndex == index

                Box(
                    Modifier
                        .fillMaxHeight()
                        .weight(1f),
                    contentAlignment = Alignment.Center
                ) {

                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(selectedItemCornerRadius))
                            .background(if (isSelected) selectedBackgroundTint else backgroundTint)
                            .padding(internalPadding)
                            .clickable {
                                val reselected = selectedItemIndex == index
                                selectedItemIndex = index
                                itemSelected(selectedItemIndex, reselected)
                            },
                        contentAlignment = Alignment.Center
                    ) {

                        Icon(
                            imageVector = item.icon,
                            contentDescription = item.title,
                            modifier = Modifier.size(iconSize),
                            tint = if (isSelected) selectedItemTint else itemTint
                        )

                    }

                }

            }

        }

    }

}

/**
 * A bottom navigation bar composable with icons and labels.
 *
 * @param navItems A list of [NavigationItemData] objects representing the navigation items
 *                 to be displayed in the bar. Each item should have an image vector and a title.
 * @param modifier [Modifier] to be applied to the entire bottom navigation bar.
 * @param iconSize The size of the icons in the navigation bar items.
 * @param defaultSelectedIndex The default selected index of the navigation bar.
 * @param shape The shape of the bottom navigation bar.
 * @param navigationBarColor The color of the bottom navigation bar background.
 * @param itemTint The tint color for the non-selected navigation bar item icons.
 * @param selectedItemTint The tint color for the selected navigation bar item icon.
 * @param backgroundTint The background tint color for the unselected navigation bar items.
 * @param selectedBackgroundTint The background tint color for the selected navigation bar item.
 * @param itemSelected A callback function that gets called when a navigation bar item is selected.
 *                     The function receives two arguments: the selected item index and a boolean
 *                     indicating whether the same item was reselected.
 *
 * @since 1.0.0
 * @author Tanish Ranjan
 * @sample com.tanishranjan.jetpack_compose_components.samples.bottom_navbar.BottomNavigationBar3Sample
 */
@Composable
fun BottomNavigationBar3(
    navItems: List<NavigationItemData>,
    modifier: Modifier = Modifier,
    iconSize: Dp = 24.dp,
    defaultSelectedIndex: Int = 0,
    shape: Shape = RoundedCornerShape(8.dp),
    navigationBarColor: Color = MaterialTheme.colorScheme.surfaceVariant,
    itemTint: Color = MaterialTheme.colorScheme.onSurfaceVariant,
    selectedItemTint: Color = MaterialTheme.colorScheme.onPrimary,
    backgroundTint: Color = Color.Transparent,
    selectedBackgroundTint: Color = MaterialTheme.colorScheme.primary,
    itemSelected: (index: Int, reselected: Boolean) -> Unit
) {

    Surface(
        modifier = Modifier
            .height(56.dp)
            .then(modifier),
        shape = shape,
        color = navigationBarColor,
    ) {

        var selectedItemIndex by remember {
            mutableIntStateOf(defaultSelectedIndex)
        }

        Row(
            Modifier.fillMaxSize()
        ) {

            navItems.forEachIndexed { index, item ->

                val isSelected = selectedItemIndex == index

                Box(
                    Modifier
                        .fillMaxHeight()
                        .weight(1f)
                        .clickable {
                            val reselected = selectedItemIndex == index
                            selectedItemIndex = index
                            itemSelected(selectedItemIndex, reselected)
                        }
                        .background(
                            if (isSelected) selectedBackgroundTint else backgroundTint
                        ),
                    contentAlignment = Alignment.Center
                ) {

                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.title,
                        modifier = Modifier.size(iconSize),
                        tint = if (isSelected) selectedItemTint else itemTint
                    )

                }

            }

        }

    }

}

/**
 * A bottom navigation bar composable with icons and labels.
 *
 * @param navItems A list of [NavigationItemData] objects representing the navigation items
 *                 to be displayed in the bar. Each item should have an image vector and a title.
 * @param modifier [Modifier] to be applied to the entire bottom navigation bar.
 * @param selectedItemCornerRadius The corner radius for the background of the selected item.
 * @param internalPadding The padding applied within the background of each navigation item.
 * @param iconSize The size of the icons in the navigation bar items.
 * @param fontSize The font size for the navigation bar item labels.
 * @param defaultSelectedIndex The default selected index of the navigation bar.
 * @param shape The shape of the bottom navigation bar.
 * @param navigationBarColor The color of the bottom navigation bar background.
 * @param itemTint The tint color for the non-selected navigation bar item icons.
 * @param selectedItemTint The tint color for the selected navigation bar item icon.
 * @param backgroundTint The background tint color for the unselected navigation bar items.
 * @param selectedBackgroundTint The background tint color for the selected navigation bar item.
 * @param itemSelected A callback function that gets called when a navigation bar item is selected.
 *                     The function receives two arguments: the selected item index and a boolean
 *                     indicating whether the same item was reselected.
 *
 * @since 1.0.0
 * @author Tanish Ranjan
 * @sample com.tanishranjan.jetpack_compose_components.samples.bottom_navbar.BottomNavigationBar4Sample
 */
@Composable
fun BottomNavigationBar4(
    navItems: List<NavigationItemData>,
    modifier: Modifier = Modifier,
    selectedItemCornerRadius: Dp = 4.dp,
    internalPadding: Dp = 8.dp,
    iconSize: Dp = 24.dp,
    fontSize: TextUnit = 12.sp,
    defaultSelectedIndex: Int = 0,
    shape: Shape = RoundedCornerShape(8.dp),
    navigationBarColor: Color = MaterialTheme.colorScheme.surfaceVariant,
    itemTint: Color = MaterialTheme.colorScheme.onSurfaceVariant,
    selectedItemTint: Color = MaterialTheme.colorScheme.onPrimary,
    backgroundTint: Color = Color.Transparent,
    selectedBackgroundTint: Color = MaterialTheme.colorScheme.primary,
    itemSelected: (index: Int, reselected: Boolean) -> Unit
) {

    Surface(
        modifier = Modifier
            .height(56.dp)
            .then(modifier),
        shape = shape,
        color = navigationBarColor,
    ) {

        var selectedItemIndex by remember {
            mutableIntStateOf(defaultSelectedIndex)
        }

        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {

            navItems.forEachIndexed { index, item ->

                val isSelected = selectedItemIndex == index

                Box(
                    Modifier
                        .clickable {
                            val reselected = selectedItemIndex == index
                            selectedItemIndex = index
                            itemSelected(selectedItemIndex, reselected)
                        }
                        .clip(RoundedCornerShape(selectedItemCornerRadius))
                        .background(
                            if (isSelected) selectedBackgroundTint else backgroundTint
                        )
                        .padding(internalPadding),
                    contentAlignment = Alignment.Center
                ) {

                    Row(
                        modifier = Modifier.padding(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Icon(
                            imageVector = item.icon,
                            contentDescription = item.title,
                            modifier = Modifier.size(iconSize),
                            tint = if (isSelected) selectedItemTint else itemTint
                        )

                        AnimatedVisibility(visible = isSelected) {
                            Text(
                                text = item.title,
                                modifier = Modifier.padding(start = 4.dp),
                                color = selectedItemTint,
                                fontSize = fontSize
                            )
                        }

                    }

                }

            }

        }

    }

}

/**
 * A bottom navigation bar composable with icons and labels.
 *
 * @param navItems A list of [NavigationItemData] objects representing the navigation items
 *                 to be displayed in the bar. Each item should have an image vector and a title.
 * @param modifier [Modifier] to be applied to the entire bottom navigation bar.
 * @param internalPadding The padding applied within the background of each navigation item.
 * @param iconSize The size of the icons in the navigation bar items.
 * @param fontSize The font size for the navigation bar item labels.
 * @param defaultSelectedIndex The default selected index of the navigation bar.
 * @param selectedItemOffset The vertical offset applied to the selected navigation item
 *                           (positive value moves up).
 * @param shape The shape of the bottom navigation bar.
 * @param navigationBarColor The color of the bottom navigation bar background.
 * @param itemTint The tint color for the non-selected navigation bar item icons.
 * @param selectedItemTint The tint color for the selected navigation bar item icon.
 * @param backgroundTint The background tint color for the unselected navigation bar items.
 * @param selectedBackgroundTint The background tint color for the selected navigation bar item.
 * @param itemSelected A callback function that gets called when a navigation bar item is selected.
 *                     The function receives two arguments: the selected item index and a boolean
 *                     indicating whether the same item was reselected.
 *
 * @since 1.0.0
 * @author Tanish Ranjan
 * @sample com.tanishranjan.jetpack_compose_components.samples.bottom_navbar.BottomNavigationBar5Sample
 */
@Composable
fun BottomNavigationBar5(
    navItems: List<NavigationItemData>,
    modifier: Modifier = Modifier,
    internalPadding: Dp = 8.dp,
    iconSize: Dp = 24.dp,
    fontSize: TextUnit = 12.sp,
    defaultSelectedIndex: Int = 0,
    selectedItemOffset: Dp = 8.dp,
    shape: Shape = RoundedCornerShape(8.dp),
    navigationBarColor: Color = MaterialTheme.colorScheme.surfaceVariant,
    itemTint: Color = MaterialTheme.colorScheme.onSurfaceVariant,
    selectedItemTint: Color = MaterialTheme.colorScheme.onPrimary,
    backgroundTint: Color = Color.Transparent,
    selectedBackgroundTint: Color = MaterialTheme.colorScheme.primary,
    itemSelected: (index: Int, reselected: Boolean) -> Unit
) {

    Box(
        modifier = Modifier
            .height(56.dp)
            .background(navigationBarColor, shape)
            .then(modifier),
    ) {

        var selectedItemIndex by remember {
            mutableIntStateOf(defaultSelectedIndex)
        }

        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {

            navItems.forEachIndexed { index, item ->

                val isSelected = selectedItemIndex == index

                Box(
                    Modifier
                        .fillMaxSize()
                        .weight(1f)
                        .clickable {
                            val reselected = selectedItemIndex == index
                            selectedItemIndex = index
                            itemSelected(selectedItemIndex, reselected)
                        },
                    contentAlignment = Alignment.Center
                ) {

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .then(
                                if (isSelected) {
                                    Modifier.offset(y = selectedItemOffset * (-1))
                                } else {
                                    Modifier
                                }
                            ),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {

                        Box(
                            Modifier
                                .clip(CircleShape)
                                .background(
                                    if (isSelected) selectedBackgroundTint else backgroundTint
                                )
                                .padding(internalPadding)
                        ) {
                            Icon(
                                imageVector = item.icon,
                                contentDescription = item.title,
                                modifier = Modifier.size(iconSize),
                                tint = if (isSelected) selectedItemTint else itemTint
                            )
                        }

                        AnimatedVisibility(visible = isSelected) {
                            Text(
                                text = item.title,
                                modifier = Modifier.padding(top = 4.dp),
                                color = itemTint,
                                fontSize = fontSize
                            )
                        }

                    }

                }

            }

        }

    }

}