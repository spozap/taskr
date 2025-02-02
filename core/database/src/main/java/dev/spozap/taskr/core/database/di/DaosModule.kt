package dev.spozap.taskr.core.database.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.spozap.taskr.core.database.TaskrDatabase
import dev.spozap.taskr.core.database.dao.TaskDao

@Module
@InstallIn(SingletonComponent::class)
internal object DaosModule {
    @Provides
    fun providesTaskDao(database: TaskrDatabase): TaskDao = database.taskDao()
}