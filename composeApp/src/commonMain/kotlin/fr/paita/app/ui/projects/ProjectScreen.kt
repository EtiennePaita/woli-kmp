package fr.paita.app.ui.projects

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Folder
import androidx.compose.material.icons.filled.SmartToy
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import fr.paita.app.presentation.projects.ProjectAction
import fr.paita.app.presentation.projects.ProjectUiState
import fr.paita.app.presentation.projects.ProjectViewModel
import fr.paita.app.ui.components.WoliLoader
import fr.paita.app.ui.theme.LightTextColorVariant
import fr.paita.app.ui.theme.Pink
import fr.paita.app.ui.theme.WoliTheme
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.viewmodel.koinViewModel
import woli_kmp.composeapp.generated.resources.Res
import woli_kmp.composeapp.generated.resources.create_new_project
import woli_kmp.composeapp.generated.resources.no_project
import woli_kmp.composeapp.generated.resources.no_project_subtitle
import woli_kmp.composeapp.generated.resources.project_screen_title


@Composable
fun ProjectScreen(
    viewModel: ProjectViewModel = koinViewModel()
) {

    val uiState = viewModel.state.collectAsStateWithLifecycle()

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .safeContentPadding(),
    ) {
        Text(
            text = stringResource(Res.string.project_screen_title),
            style = MaterialTheme.typography.headlineLarge,
            color = MaterialTheme.colorScheme.primary,
            textAlign = TextAlign.Center
        )


        if (uiState.value.tasks.isNullOrEmpty()) {
            ProjectEmptyState(
                onCreateNewProject = {
                    viewModel.onAction(ProjectAction.CreateTask)
                }
            )
        } else {
            ProjectContent(uiState.value)
        }

        if (uiState.value.isLoading) WoliLoader()
    }

}


@Composable
private fun ProjectContent(
    state: ProjectUiState
) {

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(Icons.Default.SmartToy, contentDescription = "c")
        Spacer(Modifier.height(24.dp))

        state.tasks?.forEach { t ->
            Row {
                Text(t.title)
            }
        }
    }
}

@Composable
private fun ProjectEmptyState(
    onCreateNewProject: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Box(
            modifier = Modifier
                .size(100.dp)
                .background(color = Pink.copy(alpha = 0.3f), shape = CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Box(Modifier.size(45.dp)) {
                Icon(
                    modifier = Modifier.fillMaxSize(),
                    imageVector = Icons.Default.Folder,
                    contentDescription = "Folder",
                    tint = Pink
                )
            }
        }

        Spacer(Modifier.height(16.dp))
        Text(
            stringResource(Res.string.no_project),
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(Modifier.height(12.dp))
        Text(
            stringResource(Res.string.no_project_subtitle),
            style = MaterialTheme.typography.bodyMedium.copy(
                color = LightTextColorVariant
            ),
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(horizontal = 24.dp)
        )

        Spacer(Modifier.height(32.dp))
        Button(
            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
            onClick = onCreateNewProject
        ) {
            Text(stringResource(Res.string.create_new_project))
        }

    }
}



@Preview
@Composable
private fun ProjectScreen_Preview() {
    WoliTheme {
        Surface {
            ProjectScreen()
        }
    }
}

@Preview
@Composable
private fun ProjectContent_Preview() {
    ProjectContent(ProjectUiState())
}


@Preview
@Composable
private fun ProjectEmptyState_Preview() {
    WoliTheme {
        ProjectEmptyState {}
    }
}