package fr.paita.app.previews.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import fr.paita.app.ui.components.TaskCheckBox
import fr.paita.app.ui.theme.WoliTheme

@Preview(showBackground = true)
@Composable
fun TaskCheckBox_Checked_Preview() {
    WoliTheme {
        TaskCheckBox(
            true,
            {  },
            "Visit Mandela park"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TaskCheckBox_Unchecked_Preview() {
    WoliTheme {
        TaskCheckBox(
            false,
            {  },
            "Visit Mandela park"
        )
    }
}