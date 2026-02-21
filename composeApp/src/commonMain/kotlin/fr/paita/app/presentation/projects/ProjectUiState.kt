package fr.paita.app.presentation.projects

import fr.paita.app.domain.model.Task


data class ProjectUiState(
    val isLoading: Boolean = false,
    val tasks: List<Task>? = null
)