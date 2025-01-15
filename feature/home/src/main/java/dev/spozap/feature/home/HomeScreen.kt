package dev.spozap.feature.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import dev.spozap.feature.home.components.TaskStatsItemContainer
import dev.spozap.feature.home.components.TaskStatsItemContent
import dev.spozap.taskr.feature.home.R

@Composable
fun HomeRoute(
    viewModel: HomeViewModel = hiltViewModel()
) {
    HomeScreen()
}

@Composable
private fun HomeScreen() {
    Column(
        Modifier
            .fillMaxSize()
            .padding(8.dp)) {
        Text("You have 6 tasks to complete")
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            TaskStatsItemContainer {
                TaskStatsItemContent(
                    title = "Tasks today",
                    icon = {
                        Icon(
                            painter = painterResource(R.drawable.task_icon),
                            tint = Color.White,
                            contentDescription = "Task icon"
                        )
                    },
                    footer = {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            Text("8", fontSize = 32.sp, fontWeight = FontWeight.Bold)
                            Text("Tasks")
                        }
                    }
                )

            }
            TaskStatsItemContainer {
                TaskStatsItemContent(
                    title = "In progress",
                    icon = {
                        Icon(
                            painter = painterResource(R.drawable.todo_icon),
                            tint = Color.White,
                            contentDescription = "Todo tasks icon"
                        )
                    },
                    footer = {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            Text("4", fontSize = 32.sp, fontWeight = FontWeight.Bold)
                            Text("Tasks")
                        }
                    }
                )
            }
        }
    }
}