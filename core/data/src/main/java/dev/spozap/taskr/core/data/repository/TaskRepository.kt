package dev.spozap.taskr.core.data.repository

import dev.spozap.taskr.core.model.Task

interface TaskRepository {

    suspend fun upsertTask(task: Task)

}