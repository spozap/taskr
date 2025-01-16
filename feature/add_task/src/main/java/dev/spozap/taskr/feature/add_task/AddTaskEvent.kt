package dev.spozap.taskr.feature.add_task

sealed interface AddTaskEvent {
    data class UpdateTitle(val title: String) : AddTaskEvent
}