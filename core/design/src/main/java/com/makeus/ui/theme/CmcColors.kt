package com.makeus.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color


data class CmcColors(
    val main_1: Color = Color(0xFF615DFF),
    val error: Color = Color(0xFFFF2633),
    val background_1: Color = Color(0xFF1D1B30),
    val gray_50: Color = Color(0xFFFFFFFF),
    val gray_100: Color = Color(0xFFFAFAFA),
    val gray_200: Color = Color(0xFFF8F8F8),
    val gray_300: Color = Color(0xFFF0F0F0),
    val gray_400: Color = Color(0xFFDEDEDE),
    val gray_500: Color = Color(0xFFBDBFC1),
    val gray_600: Color = Color(0xFF909397),
    val gray_700: Color = Color(0xFF7B7F83),
    val gray_800: Color = Color(0xFF63666A),
    val gray_900: Color = Color(0xFF3A3D40),
    val gray_950: Color = Color(0xFF262525),
    val black: Color = Color(0xFF121212)
) {
    companion object {
        fun updateColorFrom(other: CmcColors) : CmcColors = CmcColors(
            main_1 = other.main_1,
            error = other.error,
            background_1 = other.background_1,
            gray_50 = other.gray_50,
            gray_100 = other.gray_100,
            gray_200 = other.gray_200,
            gray_300 = other.gray_300,
            gray_400 = other.gray_400,
            gray_500 = other.gray_500,
            gray_600 = other.gray_600,
            gray_700 = other.gray_700,
            gray_800 = other.gray_800,
            gray_900 = other.gray_900,
            gray_950 = other.gray_950,
            black = other.black,
        )
    }
}
