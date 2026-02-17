package fr.paita.app.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable


@Composable
fun WoliTheme(
    darkTheme: Boolean = isSystemInDarkTheme(), // Checks if your system is in dark theme mode.
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColorScheme else LightColorScheme
    MaterialTheme(
        colorScheme = colors,
        typography = WiloTypography(),
        shapes = Shapes,
        content = content,
    )
}