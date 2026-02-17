package fr.paita.app.ui.projects

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import fr.paita.app.ui.theme.LightTextColorVariant
import fr.paita.app.ui.theme.Pink
import fr.paita.app.ui.theme.WoliTheme


@Composable
fun ProjectScreen() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .safeContentPadding(),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "Projects",
            style = MaterialTheme.typography.headlineLarge,
            color = MaterialTheme.colorScheme.primary,
            textAlign = TextAlign.Center
        )

        ProjectEmptyState()
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

@Composable
private fun ProjectContent() {

}

@Preview
@Composable
private fun ProjectContent_Preview() {
    ProjectContent()
}

@Composable
private fun ProjectEmptyState() {
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
            "No Projects Yet",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(Modifier.height(12.dp))
        Text(
            "Start organizing your workflow by creating your first project folder",
            style = MaterialTheme.typography.bodyMedium.copy(
                color = LightTextColorVariant
            ),
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(horizontal = 24.dp)
        )

        Spacer(Modifier.height(32.dp))
        Button(
            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
            onClick = {}
        ) {
            Text("Create new project")
        }

    }
}

@Preview
@Composable
private fun ProjectEmptyState_Preview() {
    WoliTheme {
        ProjectEmptyState()
    }
}