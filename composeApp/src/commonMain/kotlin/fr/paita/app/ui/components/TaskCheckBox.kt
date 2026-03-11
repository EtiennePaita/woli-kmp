package fr.paita.app.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import fr.paita.app.ui.theme.LightGraySurfaceBackground
import fr.paita.app.ui.theme.PinkSecondaryAccentButton


@Composable
fun TaskCheckBox(
    isChecked: Boolean,
    onCheckedChanged: ((Boolean) -> Unit),
    title: String,
    modifier: Modifier = Modifier
) {

    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(
                LightGraySurfaceBackground,
                RoundedCornerShape(16.dp)
            )
            .clickable(role = Role.Checkbox) { onCheckedChanged(!isChecked) }
    ) {
        Row(
            modifier = modifier
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            Box(
                modifier = Modifier
                    .size(24.dp)
                    .drawBehind {
                        val cornerRadius = 24.dp.toPx()
                        drawRoundRect(
                            color = PinkSecondaryAccentButton,
                            cornerRadius = CornerRadius(cornerRadius, cornerRadius),
                            style = Stroke(width = 2.dp.toPx())
                        )
                    }
            ) {
                this@Row.AnimatedVisibility(
                    isChecked,
                    enter = fadeIn() + scaleIn(),
                    exit = fadeOut() + scaleOut()
                ) {
                    Icon(
                        imageVector = Icons.Default.CheckCircle,
                        contentDescription = "Check",
                        modifier = Modifier.fillMaxSize(),
                        tint = PinkSecondaryAccentButton
                    )
                }
            }

            Text(
                title,
                style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.SemiBold),
                color = MaterialTheme.colorScheme.primary,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1
            )

        }
    }

}