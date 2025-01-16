package dev.spozap.taskr.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import dev.spozap.feature.home.navigation.HomeRoute
import dev.spozap.feature.home.navigation.homeScreen
import dev.spozap.taskr.feature.add_task.navigation.addTaskScreen

@Composable
internal fun TaskrNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = HomeRoute,
    ) {
        homeScreen()
        addTaskScreen()
    }
}