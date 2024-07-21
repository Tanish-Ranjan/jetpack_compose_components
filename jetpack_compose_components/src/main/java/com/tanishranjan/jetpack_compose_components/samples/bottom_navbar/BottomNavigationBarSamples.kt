package com.tanishranjan.jetpack_compose_components.samples.bottom_navbar

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.tanishranjan.jetpack_compose_components.composables.bottom_navbar.BottomNavigationBar
import com.tanishranjan.jetpack_compose_components.composables.bottom_navbar.data.NavigationItemData
import com.tanishranjan.jetpack_compose_components.properties.bottom_navbar.BottomNavBarVariant

@Composable
internal fun MinimalSample() {
    BottomNavigationBar(
        modifier = Modifier.fillMaxWidth(),
        variant = BottomNavBarVariant.Minimal(
            navItems = listOf(
                NavigationItemData(Icons.Filled.Notifications, "Notifications"),
                NavigationItemData(Icons.Filled.Home, "Home"),
                NavigationItemData(Icons.Filled.AccountCircle, "Profile")
            ),
            defaultSelectedIndex = 1
        ),
        onSelectionChanged = { index, reselected ->
            // Switch to the appropriate screen
        }
    )
}

@Composable
internal fun StandardSample() {
    BottomNavigationBar(
        modifier = Modifier.fillMaxWidth(),
        variant = BottomNavBarVariant.Standard(
            navItems = listOf(
                NavigationItemData(Icons.Filled.Notifications, "Notifications"),
                NavigationItemData(Icons.Filled.Home, "Home"),
                NavigationItemData(Icons.Filled.AccountCircle, "Profile")
            ),
            defaultSelectedIndex = 1
        ),
        onSelectionChanged = { index, reselected ->
            // Switch to the appropriate screen
        }
    )
}

@Composable
internal fun FilledSample() {
    BottomNavigationBar(
        modifier = Modifier.fillMaxWidth(),
        variant = BottomNavBarVariant.Filled(
            navItems = listOf(
                NavigationItemData(Icons.Filled.Notifications, "Notifications"),
                NavigationItemData(Icons.Filled.Home, "Home"),
                NavigationItemData(Icons.Filled.AccountCircle, "Profile")
            ),
            defaultSelectedIndex = 1
        ),
        onSelectionChanged = { index, reselected ->
            // Switch to the appropriate screen
        }
    )
}

@Composable
internal fun HaloSample() {
    BottomNavigationBar(
        modifier = Modifier.fillMaxWidth(),
        variant = BottomNavBarVariant.Halo(
            navItems = listOf(
                NavigationItemData(Icons.Filled.Notifications, "Notifications"),
                NavigationItemData(Icons.Filled.Home, "Home"),
                NavigationItemData(Icons.Filled.AccountCircle, "Profile")
            ),
            defaultSelectedIndex = 1
        ),
        onSelectionChanged = { index, reselected ->
            // Switch to the appropriate screen
        }
    )
}

@Composable
internal fun SwaySample() {
    BottomNavigationBar(
        modifier = Modifier.fillMaxWidth(),
        variant = BottomNavBarVariant.Sway(
            navItems = listOf(
                NavigationItemData(Icons.Filled.Notifications, "Notifications"),
                NavigationItemData(Icons.Filled.Home, "Home"),
                NavigationItemData(Icons.Filled.AccountCircle, "Profile")
            ),
            defaultSelectedIndex = 1
        ),
        onSelectionChanged = { index, reselected ->
            // Switch to the appropriate screen
        }
    )
}