package dev.spozap.taskr.feature.add_task.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import dev.spozap.taskr.feature.add_task.AddTaskScreen
import kotlinx.serialization.Serializable

@Serializable
data object AddTaskRoute

fun NavController.navigateToAddTask() {
    navigate(AddTaskRoute) {
        launchSingleTop = true
    }
}

fun NavGraphBuilder.addTaskScreen() {
    composable<AddTaskRoute> {
        AddTaskScreen()
    }
}