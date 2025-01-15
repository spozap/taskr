package dev.spozap.taskr.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import dev.spozap.feature.home.navigation.HomeRoute
import dev.spozap.feature.home.navigation.homeScreen

@Composable
internal fun TaskrNavHost() {
    NavHost(
        navController = rememberNavController(),
        startDestination = HomeRoute
    ) {
        homeScreen()
    }
}