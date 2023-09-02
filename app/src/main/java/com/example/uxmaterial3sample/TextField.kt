package com.example.uxmaterial3sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.MonitorWeight
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uxmaterial3sample.ui.theme.UxMaterial3SampleTheme

class TextField : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UxMaterial3SampleTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    textField()

                }
            }
        }
    }
}


@Composable
fun textField() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var filledText by remember {
            mutableStateOf("")
        }
        TextField(
            value = filledText,
            onValueChange = { filledText = it },
            textStyle = LocalTextStyle.current.copy(
                textAlign = TextAlign.Right
            ),
//                            label = {
//                                Text(text = "Enter your Weight")
//                            },
            placeholder = { Text(text = "Weight") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.MonitorWeight,
                    contentDescription = "Weight"
                )
            },
            suffix = {
                Text(text = "kg")
            },
            supportingText = {
                Text(text = "*required")
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Decimal,
                imeAction = ImeAction.Next
            ),
            keyboardActions = KeyboardActions(
                onNext = {
                    println("hi (:")
                }
            )
        )

        Spacer(modifier = Modifier.size(12.dp))
        var outText by remember {
            mutableStateOf("")
        }
        OutlinedTextField(value = outText, onValueChange = { outText = it },
            textStyle = LocalTextStyle.current.copy(
                textAlign = TextAlign.Right
            ),
//                            label = {
//                                Text(text = "Enter your Weight")
//                            },
            placeholder = { Text(text = "Weight") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.MonitorWeight,
                    contentDescription = "Weight"
                )
            },
            suffix = {
                Text(text = "kg")
            },
            supportingText = {
                Text(text = "*required")
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Decimal,
                imeAction = ImeAction.Next
            ),
            keyboardActions = KeyboardActions(
                onNext = {
                    println("hi (:")
                }
            ))
    }
}

@Preview
@Composable
fun PreviewTextField() {
    textField()
}




