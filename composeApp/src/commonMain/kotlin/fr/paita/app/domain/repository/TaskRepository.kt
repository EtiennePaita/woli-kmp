package fr.paita.app.domain.repository

import fr.paita.app.domain.model.Task
import kotlinx.coroutines.flow.Flow

interface TaskRepository {
    suspend fun getUncompletedTasks(): Flow<List<Task>?>
}