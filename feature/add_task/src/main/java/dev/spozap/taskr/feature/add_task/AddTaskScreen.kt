package dev.spozap.taskr.feature.add_task

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import dev.spozap.taskr.feature.add_task.AddTaskEvent.UpdateTitle

@Composable
internal fun AddTaskScreen(viewModel: AddTaskViewModel = hiltViewModel()) {

    val state = viewModel.state.collectAsStateWithLifecycle().value

    AddTaskScreen(state, viewModel::onAddTaskEvent)
}

@Composable
private fun AddTaskScreen(state: AddTaskState, onAddTaskEvent: (AddTaskEvent) -> Unit) {
    Column(Modifier.padding(16.dp)) {
        Text("New task", style = MaterialTheme.typography.titleLarge)
        OutlinedTextField(
            value = state.title,
            onValueChange = { onAddTaskEvent(UpdateTitle(it)) },
            label = { Text("Title") },
            modifier = Modifier
                .fillMaxWidth()
        )
        Button(onClick = { onAddTaskEvent(AddTaskEvent.Submit) }) {
            Text("Añadir")
        }
    }
}