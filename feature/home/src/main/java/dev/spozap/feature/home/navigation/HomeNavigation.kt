package dev.spozap.feature.home.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import dev.spozap.feature.home.HomeRoute
import kotlinx.serialization.Serializable

@Serializable
data object HomeRoute

fun NavController.navigateToHome() {
    navigate(HomeRoute) {
        launchSingleTop = true
    }
}

fun NavGraphBuilder.homeScreen() {
    composable<HomeRoute> {
        HomeRoute()
    }
}