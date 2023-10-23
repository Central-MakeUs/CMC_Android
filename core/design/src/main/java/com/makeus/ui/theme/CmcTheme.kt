package com.makeus.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf

val LocalTypography = staticCompositionLocalOf { CmcTypography() }
val LocalColors = staticCompositionLocalOf { CmcColors() }

object CmcTheme {

    val colors: CmcColors
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current

    val typography: CmcTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current
}