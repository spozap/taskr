package dev.spozap.taskr.feature.add_task

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.spozap.taskr.core.data.repository.TaskRepository
import dev.spozap.taskr.core.model.Task
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import java.util.UUID
import javax.inject.Inject

@HiltViewModel
class AddTaskViewModel @Inject constructor(
    private val taskRepository: TaskRepository
) : ViewModel() {

    private val _state = MutableStateFlow(AddTaskState())
    val state = _state.asStateFlow()

    fun onAddTaskEvent(event: AddTaskEvent) {
        when (event) {
            is AddTaskEvent.UpdateTitle -> {
                _state.update { it.copy(title = event.title) }
            }

            is AddTaskEvent.Submit -> insertTask()
        }
    }

    private fun insertTask() {
        viewModelScope.launch {
            taskRepository.upsertTask(
                Task(
                    id = UUID.randomUUID().toString(),
                    title = _state.value.title
                )
            )
        }
    }
}

data class AddTaskState(
    val title: String = ""
)