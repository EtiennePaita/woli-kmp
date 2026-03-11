package fr.paita.app.ui.components

import androidx.compose.animation.animateBounds
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.LookaheadScope
import androidx.compose.ui.unit.dp
import fr.paita.app.domain.model.Task

@Composable
fun TaskList(
    tasks:  List<Task>,
    onCheckedChanged: ((String, Boolean) -> Unit)
) {
    LookaheadScope {
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
                .animateBounds(this),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items(tasks, key = { it.id }) { task ->
                TaskCheckBox(
                    task.isCompleted,
                    { isChecked ->
                        onCheckedChanged(task.id, isChecked)
                    },
                    task.title,
                    modifier = Modifier.animateItem()
                )
            }
        }
    }
}