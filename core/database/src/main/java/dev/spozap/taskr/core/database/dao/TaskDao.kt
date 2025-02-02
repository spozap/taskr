package dev.spozap.taskr.core.database.dao

import androidx.room.Dao
import androidx.room.Upsert
import dev.spozap.taskr.core.database.model.TaskEntity

@Dao
interface TaskDao {
    @Upsert
    suspend fun upsertTask(task: TaskEntity)
}