package dev.spozap.taskr.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import dev.spozap.core.design_system.theme.components.TaskrBackground
import dev.spozap.feature.home.HomeRoute

@Composable
internal fun TaskrApp() {
    TaskrBackground {
        Scaffold(containerColor = Color.Transparent) { padding ->
            Column(
                Modifier
                    .fillMaxSize()
                    .padding(padding)
            ) {
                HomeRoute()
            }
        }
    }
}