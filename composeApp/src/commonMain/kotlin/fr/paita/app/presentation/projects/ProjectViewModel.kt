package fr.paita.app.presentation.projects

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import fr.paita.app.domain.repository.TaskRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class ProjectViewModel(
    private val repository: TaskRepository
): ViewModel() {
    private val _state = MutableStateFlow(ProjectUiState())
    val state = _state.asStateFlow()

    init {
        load()
    }

    fun onAction(action: ProjectAction) {
        when(action) {
            ProjectAction.CreateTask -> onCreateTaskAction()
        }
    }

    private fun load() {
        viewModelScope.launch {
            _state.update { it.copy(isLoading = true) }

            repository.getUncompletedTasks().collect { tasks ->
                _state.update {
                    it.copy(
                        isLoading = false,
                        tasks = tasks,
                    )
                }
            }
        }
    }

    private fun onCreateTaskAction() {

    }
}