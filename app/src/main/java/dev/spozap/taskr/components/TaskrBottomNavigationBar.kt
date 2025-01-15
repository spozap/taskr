package dev.spozap.taskr.components

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import dev.spozap.taskr.navigation.TopLevelDestination


@Composable
internal fun TaskrBottomNavigationBar() {
    NavigationBar {
        TopLevelDestination.entries.forEach { destination ->
            NavigationBarItem(
                selected = false,
                icon = {
                    Icon(
                        imageVector = destination.icon,
                        contentDescription = destination.title
                    )
                },
                onClick = {}
            )
        }
    }
}