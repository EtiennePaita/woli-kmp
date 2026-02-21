package fr.paita.app.data.local

import fr.paita.app.domain.model.Task
import kotlinx.coroutines.delay

open class TaskDataSource() {

    open suspend fun getUncompletedTasks(): List<Task>? {
        return null
    }
}


class FakeTaskDataSource() : TaskDataSource() {
    override suspend fun getUncompletedTasks(): List<Task> {
        delay(1600)

        return listOf(
            Task(
                "ijzceY",
                "Envoyer mail au CEO Jacques",
                "bla bla bla",
                false
            ),
            Task(
                "jxuTsZ",
                "Dossier Taiwan",
                "bla bla bla",
                false
            ),
            Task(
                "mcitGE",
                "Payer cabinet de conseil",
                "bla bla bla",
                false
            ),
            Task(
                "hUncFS",
                "FTA account JPN",
                "bla bla bla",
                false
            ),
            Task(
                "reunsh",
                "Réunion alternant",
                "bla bla bla",
                false
            ),
            Task(
                "voYEas",
                "Communiqué de press",
                "bla bla bla",
                false
            ),
            Task(
                "lOjYye",
                "Modifier rubrique F-2a Appel d'offre",
                "bla bla bla",
                false
            ),
            Task(
                "zXvvGj",
                "Répondre avis client",
                "bla bla bla",
                false
            ),
        )

    }
}