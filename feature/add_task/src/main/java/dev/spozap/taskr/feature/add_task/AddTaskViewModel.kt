package dev.spozap.taskr.feature.add_task

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class AddTaskViewModel : ViewModel() {

    private val _state = MutableStateFlow(AddTaskState())
    val state = _state.asStateFlow()

    fun onAddTaskEvent(event: AddTaskEvent) {
        when (event) {
            is AddTaskEvent.UpdateTitle -> {
                _state.update { it.copy(title = event.title) }
            }
        }
    }
}

data class AddTaskState(
    val title: String = ""
)