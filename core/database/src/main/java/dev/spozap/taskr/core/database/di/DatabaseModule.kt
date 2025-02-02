package dev.spozap.taskr.core.database.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import dev.spozap.taskr.core.database.TaskrDatabase
import javax.inject.Singleton

private const val DATABASE_NAME: String = "taskr_db"

@Module
@InstallIn(SingletonComponent::class)
internal object DatabaseModule {
    @[Provides Singleton]
    fun providesTaskrDatabase(@ApplicationContext context: Context): TaskrDatabase =
        Room.databaseBuilder(context, TaskrDatabase::class.java, DATABASE_NAME).build()
}