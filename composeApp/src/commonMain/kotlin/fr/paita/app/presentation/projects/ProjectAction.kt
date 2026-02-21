package fr.paita.app.presentation.projects

sealed class ProjectAction {
    data object CreateTask : ProjectAction()
}