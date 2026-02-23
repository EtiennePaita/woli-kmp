package fr.paita.app.previews

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import fr.paita.app.presentation.projects.ProjectUiState
import fr.paita.app.ui.screens.projects.ProjectContent
import fr.paita.app.ui.screens.projects.ProjectEmptyState
import fr.paita.app.ui.theme.WoliTheme


@Preview(showBackground = true)
@Composable
private fun ProjectContent_Preview() {
    WoliTheme {
        ProjectContent(ProjectUiState())
    }
}


@Preview(showBackground = true)
@Composable
private fun ProjectEmptyState_Preview() {
    WoliTheme {
        ProjectEmptyState {}
    }
}