package com.ordrid.jetcomp.router

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

sealed class Screen {
    object Navigation : Screen()
    object Text : Screen()
    object TextField : Screen()
    object Buttons: Screen()
    object ProgressIndicator : Screen()
    object AlertDialog : Screen()
}

object JetFundamentalsRouter{
    val currentScreen : MutableState<Screen> = mutableStateOf(Screen.Navigation)

    fun navigateTo(destination: Screen) {
        currentScreen.value = destination
    }
}