package dev.spozap.taskr.feature.add_task

import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
internal fun AddTaskScreen(viewModel: AddTaskViewModel = hiltViewModel()) {
    AddTaskScreen()
}

@Composable
private fun AddTaskScreen() {
    OutlinedTextField(value = "", onValueChange = {}, label = { Text("Título") })
}