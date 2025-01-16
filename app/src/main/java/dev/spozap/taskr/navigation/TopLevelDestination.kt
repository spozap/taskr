package dev.spozap.taskr.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector
import dev.spozap.feature.home.navigation.HomeRoute
import dev.spozap.taskr.feature.add_task.navigation.AddTaskRoute
import kotlin.reflect.KClass

enum class TopLevelDestination(
    val icon: ImageVector,
    val title: String,
    val route: KClass<*>
) {
    HOME(
        icon = Icons.Default.Home,
        title = "Inicio",
        route = HomeRoute::class
    ),
    ADD_TASK(
        icon = Icons.Default.Add,
        title = "Crear",
        route = AddTaskRoute::class
    )
}