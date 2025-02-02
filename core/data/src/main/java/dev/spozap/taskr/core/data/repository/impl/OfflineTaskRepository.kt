package dev.spozap.taskr.core.data.repository.impl

import dev.spozap.taskr.core.data.model.toEntity
import dev.spozap.taskr.core.data.repository.TaskRepository
import dev.spozap.taskr.core.database.dao.TaskDao
import dev.spozap.taskr.core.model.Task
import javax.inject.Inject

class OfflineTaskRepository @Inject constructor(
    private val taskDao: TaskDao
) : TaskRepository {
    override suspend fun upsertTask(task: Task) = taskDao.upsertTask(task.toEntity())
}