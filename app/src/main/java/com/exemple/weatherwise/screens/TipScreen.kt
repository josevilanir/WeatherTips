package com.example.weatherwise.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun TipScreen(navController: NavController) {
    val dicas = listOf(
        "Leve um guarda-chuva! Pode chover mais tarde.",
        "Hoje está ótimo para um passeio ao ar livre.",
        "Não se esqueça do protetor solar!",
        "Clima ideal para tomar um café quentinho!",
        "Use roupas leves, o calor vai apertar!"
    )

    var dicaAtual by remember { mutableStateOf(dicas.random()) }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFEAF6FF)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("💡 Dica do Dia", fontSize = 24.sp, fontWeight = FontWeight.Bold)

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = dicaAtual,
                fontSize = 20.sp,
                color = Color(0xFF003366),
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            Spacer(modifier = Modifier.height(32.dp))

            Button(
                onClick = { dicaAtual = dicas.random() },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF0077CC))
            ) {
                Text("🔄 Ver outra dica", color = Color.White)
            }

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedButton(onClick = { navController.popBackStack() }) {
                Text("⬅️ Voltar")
            }
        }
    }
}
