package dev.spozap.taskr.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import dev.spozap.core.design_system.theme.components.TaskrBackground
import dev.spozap.taskr.components.TaskrBottomNavigationBar
import dev.spozap.taskr.navigation.TaskrNavHost

@Composable
internal fun TaskrApp() {
    TaskrBackground {
        Scaffold(
            containerColor = Color.Transparent,
            bottomBar = { TaskrBottomNavigationBar() }) { padding ->
            Column(
                Modifier
                    .fillMaxSize()
                    .padding(padding)
            ) {
                TaskrNavHost()
            }
        }
    }
}