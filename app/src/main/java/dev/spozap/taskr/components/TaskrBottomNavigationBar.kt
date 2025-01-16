package dev.spozap.taskr.components

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import dev.spozap.taskr.ui.TaskrAppState


@Composable
internal fun TaskrBottomNavigationBar(appState: TaskrAppState) {
    NavigationBar {
        appState.topLevelDestinations.forEach { destination ->
            NavigationBarItem(
                selected = false,
                icon = {
                    Icon(
                        imageVector = destination.icon,
                        contentDescription = destination.title
                    )
                },
                onClick = { appState.navigateToTopLevelDestination(destination) }
            )
        }
    }
}