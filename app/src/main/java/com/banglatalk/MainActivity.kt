package com.banglatalk

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                var number by remember {
                    mutableStateOf("")
                }

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Bangla Talk",
                        style = MaterialTheme.typography.headlineLarge
                    )

                    Spacer(modifier = Modifier.height(24.dp))

                    OutlinedTextField(
                        value = number,
                        onValueChange = { number = it },
                        label = {
                            Text("Phone number or username")
                        },
                        modifier = Modifier.fillMaxWidth()
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Button(
                        onClick = {
                            // VoIP calling will be connected later.
                        },
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("Call")
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    Text(
                        text = "Welcome to Bangla Talk!",
                        style = MaterialTheme.typography.bodySmall
                    )
                }
            }
        }
    }
}
