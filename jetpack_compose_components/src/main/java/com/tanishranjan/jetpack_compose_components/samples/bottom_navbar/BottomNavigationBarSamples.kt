package com.tanishranjan.jetpack_compose_components.samples.bottom_navbar

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.tanishranjan.jetpack_compose_components.composables.bottom_navbar.BottomNavigationBar1
import com.tanishranjan.jetpack_compose_components.composables.bottom_navbar.BottomNavigationBar2
import com.tanishranjan.jetpack_compose_components.composables.bottom_navbar.BottomNavigationBar3
import com.tanishranjan.jetpack_compose_components.composables.bottom_navbar.BottomNavigationBar4
import com.tanishranjan.jetpack_compose_components.composables.bottom_navbar.BottomNavigationBar5
import com.tanishranjan.jetpack_compose_components.composables.bottom_navbar.data.NavigationItemData

@Composable
internal fun BottomNavigationBar1Sample() {
    BottomNavigationBar1(
        modifier = Modifier.fillMaxWidth(),
        navItems = listOf(
            NavigationItemData(Icons.Filled.Notifications, "Notifications"),
            NavigationItemData(Icons.Filled.Home, "Home"),
            NavigationItemData(Icons.Filled.AccountCircle, "Profile")
        ),
        defaultSelectedIndex = 1,
        itemSelected = { index, reselected ->
            // Switch to the appropriate screen
        }
    )
}

@Composable
internal fun BottomNavigationBar2Sample() {
    BottomNavigationBar2(
        modifier = Modifier.fillMaxWidth(),
        navItems = listOf(
            NavigationItemData(Icons.Filled.Notifications, "Notifications"),
            NavigationItemData(Icons.Filled.Home, "Home"),
            NavigationItemData(Icons.Filled.AccountCircle, "Profile")
        ),
        defaultSelectedIndex = 1,
        itemSelected = { index, reselected ->
            // Switch to the appropriate screen
        }
    )
}

@Composable
internal fun BottomNavigationBar3Sample() {
    BottomNavigationBar3(
        modifier = Modifier.fillMaxWidth(),
        navItems = listOf(
            NavigationItemData(Icons.Filled.Notifications, "Notifications"),
            NavigationItemData(Icons.Filled.Home, "Home"),
            NavigationItemData(Icons.Filled.AccountCircle, "Profile")
        ),
        defaultSelectedIndex = 1,
        itemSelected = { index, reselected ->
            // Switch to the appropriate screen
        }
    )
}

@Composable
internal fun BottomNavigationBar4Sample() {
    BottomNavigationBar4(
        modifier = Modifier.fillMaxWidth(),
        navItems = listOf(
            NavigationItemData(Icons.Filled.Notifications, "Notifications"),
            NavigationItemData(Icons.Filled.Home, "Home"),
            NavigationItemData(Icons.Filled.AccountCircle, "Profile")
        ),
        defaultSelectedIndex = 1,
        itemSelected = { index, reselected ->
            // Switch to the appropriate screen
        }
    )
}

@Composable
internal fun BottomNavigationBar5Sample() {
    BottomNavigationBar5(
        modifier = Modifier.fillMaxWidth(),
        navItems = listOf(
            NavigationItemData(Icons.Filled.Notifications, "Notifications"),
            NavigationItemData(Icons.Filled.Home, "Home"),
            NavigationItemData(Icons.Filled.AccountCircle, "Profile")
        ),
        defaultSelectedIndex = 1,
        itemSelected = { index, reselected ->
            // Switch to the appropriate screen
        }
    )
}