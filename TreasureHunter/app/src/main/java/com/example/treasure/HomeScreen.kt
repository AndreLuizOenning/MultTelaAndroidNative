package com.example.treasure

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        TopAppBar(title = { Text("Caça ao Tesouro") })

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = { navController.navigate("clue1") },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Iniciar Caça ao Tesouro")
        }
    }
}
