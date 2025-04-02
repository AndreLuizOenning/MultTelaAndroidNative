package com.example.treasure

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ClueScreen(navController: NavController, clueNumber: Int) {
    var answer by remember { mutableStateOf("") }

    val question = when (clueNumber){
        1 -> "Qual liquido é considerado essencial para vida na terra?"
        2 -> "Qual o nome do nosso planeta?"
        3 -> "Qual o nome do elemento de origem de Aang(Avatar)?"
        else -> ""
    }
    val correctAnswer = when (clueNumber) {
        1 -> "agua"
        2 -> "terra"
        3 -> "ar"
        else -> ""
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        TopAppBar(title = { Text("Pista $clueNumber") })

        Spacer(modifier = Modifier.height(20.dp))

        Text("Pista ${clueNumber}: ${question}")
        TextField(
            value = answer,
            onValueChange = { answer = it },
            label = { Text("Sua Resposta") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp)
        )

        Button(
            onClick = {
                if (answer.equals(correctAnswer, ignoreCase = true)) {
                    if (clueNumber < 3) {
                        navController.navigate("clue${clueNumber + 1}")
                    } else {
                        navController.navigate("treasure")
                    }
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Enviar Resposta")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { navController.popBackStack() },
            modifier = Modifier.fillMaxWidth()) {
            Text("Voltar")
        }
    }
}
