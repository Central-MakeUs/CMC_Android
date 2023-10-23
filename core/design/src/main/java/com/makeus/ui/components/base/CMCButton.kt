package com.makeus.ui.components.base

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.makeus.ui.theme.CmcTheme

@Composable
@Preview
fun CMCButton(
    modifier: Modifier = Modifier,
    text: String = "CMCButton",
    style: TextStyle = CmcTheme.typography.headline,
    border: BorderStroke = BorderStroke(1.dp, CmcTheme.colors.main_1),
    containerColor : Color = CmcTheme.colors.main_1,
    contentColor : Color = Color.White,
    onClick: () -> Unit = {}
) {
    Button(
        modifier = modifier.fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            containerColor = containerColor,
            contentColor = contentColor
        ),
        shape = RoundedCornerShape(5.dp),
        border = border,
        onClick = onClick
    ) {
        Text(
            text = text,
            style = style
        )
    }
}