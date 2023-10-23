package com.makeus.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.makeus.ui.theme.CmcColors.Companion.updateColorFrom

@Composable
fun CmcTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    colors: CmcColors = CmcColors(),
    darkColors: CmcColors = CmcColors(),
    typography: CmcTypography = CmcTypography(),
    content: @Composable () -> Unit
) {
    val currentColor = remember { if (darkTheme) darkColors else colors }
    val rememberedColors = remember { currentColor.copy() }.apply { updateColorFrom(currentColor) }
    CompositionLocalProvider(
        LocalColors provides rememberedColors,
        LocalTypography provides typography
    ) {
        ProvideTextStyle(typography.bodyM1, content = content)
    }

    val view = LocalView.current

    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colors.background_1.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }
}