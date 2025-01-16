package dev.spozap.taskr.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import dev.spozap.feature.home.navigation.navigateToHome
import dev.spozap.taskr.feature.add_task.navigation.navigateToAddTask
import dev.spozap.taskr.navigation.TopLevelDestination

@Composable
fun rememberTaskAppState(
    navController: NavHostController = rememberNavController()
): TaskrAppState {
    return remember(
        navController
    ) {
        TaskrAppState(navController)
    }
}

class TaskrAppState(
    val navController: NavHostController
) {

    val topLevelDestinations: List<TopLevelDestination> = TopLevelDestination.entries

    fun navigateToTopLevelDestination(topLevelDestination: TopLevelDestination) {
        when (topLevelDestination) {
            TopLevelDestination.ADD_TASK -> navController.navigateToAddTask()
            TopLevelDestination.HOME -> navController.navigateToHome()
        }
    }
}