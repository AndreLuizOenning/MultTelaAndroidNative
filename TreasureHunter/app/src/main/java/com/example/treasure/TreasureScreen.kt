package com.example.treasure

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TreasureScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TopAppBar(title = { Text("Você Encontrou o Tesouro!") })

        Spacer(modifier = Modifier.height(20.dp))

        Text("Parabéns! Você encontrou o tesouro!")

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { navController.navigate("home")},
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Recomeçar")
        }
    }
}
