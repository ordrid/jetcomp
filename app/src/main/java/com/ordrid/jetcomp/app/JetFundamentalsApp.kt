package com.ordrid.jetcomp.app

import androidx.compose.animation.Crossfade
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ordrid.jetcomp.router.JetFundamentalsRouter
import com.ordrid.jetcomp.router.Screen
import com.ordrid.jetcomp.screens.AlertDialogScreen
import com.ordrid.jetcomp.screens.ExploreButtonScreen
import com.ordrid.jetcomp.screens.NavigationScreen
import com.ordrid.jetcomp.screens.ProgressIndicatorScreen
import com.ordrid.jetcomp.screens.TextFieldScreen
import com.ordrid.jetcomp.screens.TextScreen

@Composable
fun JetFundamentalsApp() {
    Surface (color = MaterialTheme.colorScheme.background) {
        Crossfade(targetState = JetFundamentalsRouter.currentScreen) { screenState ->
            when(screenState.value) {
                is Screen.Navigation -> NavigationScreen()
                is Screen.Text -> TextScreen()
                is Screen.TextField -> TextFieldScreen()
                is Screen.Buttons -> ExploreButtonScreen()
                is Screen.ProgressIndicator -> ProgressIndicatorScreen()
                is Screen.AlertDialog -> AlertDialogScreen()
            }
        }
    }
}