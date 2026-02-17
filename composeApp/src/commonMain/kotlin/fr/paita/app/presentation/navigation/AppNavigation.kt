package fr.paita.app.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import fr.paita.app.ui.projects.ProjectScreen
import kotlinx.serialization.Serializable

@Serializable data object Projects

@Serializable data object CreateTask


@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Projects
    ) {

        composable<Projects> { backStackEntry ->
            ProjectScreen()
        }

        composable<CreateTask> { backStackEntry ->

        }

    }

}