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
                var number by remember { mutableStateOf("") }
                Column(Modifier.fillMaxSize().padding(24.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                    Text("Bangla Talk", style = MaterialTheme.typography.headlineLarge)
                    Spacer(Modifier.height(24.dp))
                    OutlinedTextField(value = number, onValueChange = { number = it }, label = { Text("Phone number or username") })
                    Spacer(Modifier.height(16.dp))
                    Button(onClick = { /* Calling is not connected in this starter. */ }) { Text("Call (demo only)") }
                    Spacer(Modifier.height(12.dp))
                    Text("Starter interface only — VoIP calling is not implemented yet.", style = MaterialTheme.typography.bodySmall)
                }
            }
        }
    }
}
