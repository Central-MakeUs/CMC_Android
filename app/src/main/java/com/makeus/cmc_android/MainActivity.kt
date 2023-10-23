package com.makeus.cmc_android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.makeus.ui.components.base.CMCButton
import com.makeus.ui.theme.CmcTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CmcTheme {
                CMCButton()
            }
        }
    }
}