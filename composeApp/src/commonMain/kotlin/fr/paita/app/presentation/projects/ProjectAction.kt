package fr.paita.app.presentation.projects

sealed class ProjectAction {
    data object CreateTask : ProjectAction()
    data class CompleteTask(val id: String) : ProjectAction()
    data class UncompleteTask(val id: String) : ProjectAction()
}