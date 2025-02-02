package dev.spozap.taskr.core.data.model

import dev.spozap.taskr.core.database.model.TaskEntity
import dev.spozap.taskr.core.model.Task

fun Task.toEntity(): TaskEntity = TaskEntity(
    id = id,
    title = title
)