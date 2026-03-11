package fr.paita.app.previews

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import fr.paita.app.domain.model.Task
import fr.paita.app.presentation.projects.ProjectUiState
import fr.paita.app.ui.screens.projects.ProjectContent
import fr.paita.app.ui.screens.projects.ProjectEmptyState
import fr.paita.app.ui.theme.WoliTheme


@Preview(showBackground = true)
@Composable
private fun ProjectContent_Preview() {
    WoliTheme {
        ProjectContent(
            listOf(
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
                    "Modifier rubrique F-2a Appel d'offre projet XTB banque",
                    "bla bla bla",
                    false
                ),
                Task(
                    "zXvvGj",
                    "Répondre avis client",
                    "bla bla bla",
                    false
                ),
            ),
            onCheckedChanged = { _,_ ->}
        )
    }
}


@Preview(showBackground = true)
@Composable
private fun ProjectEmptyState_Preview() {
    WoliTheme {
        ProjectEmptyState {}
    }
}