package fr.paita.app

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import fr.paita.app.presentation.navigation.AppNavigation
import fr.paita.app.ui.theme.WoliTheme

@Composable
fun App() {
    WoliTheme {
        Surface (
            modifier = Modifier
                .fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            AppNavigation()
        }
    }
}

@Preview
@Composable
fun App_Preview() {
    App()
}