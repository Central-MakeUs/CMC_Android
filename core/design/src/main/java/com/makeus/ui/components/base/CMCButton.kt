package com.makeus.ui.components.base

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun CMCButton(
    modifier: Modifier = Modifier,
    text: String = "CMCButton",
) {
    Text(
        modifier = modifier,
        text = "CMCButton"
    )
}