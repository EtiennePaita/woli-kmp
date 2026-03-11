package fr.paita.app.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.tooling.preview.Preview
import fr.paita.app.ui.theme.PinkPrimaryAccentButton


@Composable
fun WoliLoader() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Black.copy(alpha = 0.15f)),
        contentAlignment = Alignment.Center
    ) {
        CircularProgressIndicator(
            color = PinkPrimaryAccentButton
        )
    }
}

@Preview
@Composable
private fun WoliLoader_Preview() {
    WoliLoader()
}