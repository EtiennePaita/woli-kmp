package fr.paita.app

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import fr.paita.app.di.appModule
import fr.paita.app.presentation.navigation.AppNavigation
import fr.paita.app.ui.theme.WoliTheme
import org.koin.compose.KoinApplication

@Composable
fun App() = WoliTheme {
    KoinApplication(
        application = {
            modules(appModule)
        }
    ) {
        Surface(
            modifier = Modifier
                .fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            AppNavigation()
        }
    }
}

/*
@Preview
@Composable
fun App_Preview() {
    App()
}
 */