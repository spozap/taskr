package dev.spozap.taskr.core.data.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.spozap.taskr.core.data.repository.TaskRepository
import dev.spozap.taskr.core.data.repository.impl.OfflineTaskRepository

@Module
@InstallIn(SingletonComponent::class)
internal abstract class DataModule {

    @Binds
    internal abstract fun bindsTaskRepository(repository: OfflineTaskRepository): TaskRepository
}