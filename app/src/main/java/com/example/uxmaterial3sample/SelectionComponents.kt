package com.example.uxmaterial3sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.uxmaterial3sample.ui.theme.UxMaterial3SampleTheme

class SelectionComponents : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UxMaterial3SampleTheme {
                Surface(

                ) {

                }
            }
        }
    }
}


data class ToggleableInfo(
    val isCheck: Boolean,
    val text: String
)

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    UxMaterial3SampleTheme {

    }
}