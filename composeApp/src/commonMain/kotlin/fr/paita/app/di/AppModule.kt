package fr.paita.app.di

import fr.paita.app.data.local.FakeTaskDataSource
import fr.paita.app.data.local.TaskDataSource
import fr.paita.app.data.repository.TaskRepositoryImpl
import fr.paita.app.domain.repository.TaskRepository
import fr.paita.app.presentation.projects.ProjectViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val appModule = module {
    //single<TaskDataSource> { FakeTaskDataSource() }
    single<TaskDataSource> { TaskDataSource() }
    single<TaskRepository> { TaskRepositoryImpl(get()) }
    viewModelOf(::ProjectViewModel)
}