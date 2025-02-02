package dev.spozap.taskr.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import dev.spozap.taskr.core.database.dao.TaskDao
import dev.spozap.taskr.core.database.model.TaskEntity


@Database(entities = [TaskEntity::class], version = 1)
abstract class TaskrDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
}