package dev.spozap.taskr

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dagger.hilt.android.AndroidEntryPoint
import dev.spozap.core.design_system.theme.TaskrTheme
import dev.spozap.taskr.ui.TaskrApp
import dev.spozap.taskr.ui.rememberTaskAppState

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            val appState = rememberTaskAppState()

            TaskrTheme {
                TaskrApp(appState)
            }
        }
    }
}
