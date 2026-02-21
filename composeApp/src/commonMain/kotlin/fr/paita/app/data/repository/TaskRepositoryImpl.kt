package fr.paita.app.data.repository

import fr.paita.app.data.local.TaskDataSource
import fr.paita.app.domain.model.Task
import fr.paita.app.domain.repository.TaskRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class TaskRepositoryImpl(
    private val dataSource: TaskDataSource
) : TaskRepository {

    override suspend fun getUncompletedTasks(): Flow<List<Task>?> = flow {
        try {
            //emit(AppResult.Loading)
            val tasks = dataSource.getUncompletedTasks()
            emit(tasks)

        } catch (e: Exception) {
            //emit(AppResult.Error(e))
            emit(null)
        }
    }

}