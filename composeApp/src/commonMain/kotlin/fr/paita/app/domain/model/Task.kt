package fr.paita.app.domain.model

data class Task(
    val id: String,
    val title: String,
    val description: String,
    val isCompleted: Boolean,
    //val folderId: String,
)
