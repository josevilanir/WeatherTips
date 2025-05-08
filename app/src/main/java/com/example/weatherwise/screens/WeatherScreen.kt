
package com.example.weatherwise.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun WeatherScreen(navController: NavController) {
    val forecast = listOf("Ter - ☀️ 31°C", "Qua - 🌧 28°C", "Qui - ⛅ 30°C")

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFEAF6FF)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Tempo agora em Natal - RN",
                fontSize = 22.sp,
                color = Color(0xFF003366)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(text = "Segunda-feira, 06 de Maio", fontSize = 16.sp)
            Text(text = "Atualizado às 17:30", fontSize = 14.sp, color = Color.Gray)

            Spacer(modifier = Modifier.height(32.dp))

            Text(text = "🌡️ Temperatura: 29°C", fontSize = 18.sp)
            Text(text = "🤒 Sensação térmica: 31°C", fontSize = 18.sp)
            Text(text = "💧 Umidade: 72%", fontSize = 18.sp)
            Text(text = "🌬️ Vento: 12 km/h", fontSize = 18.sp)

            Spacer(modifier = Modifier.height(32.dp))

            Text(text = "Próximos dias:", fontSize = 18.sp, fontWeight = FontWeight.Bold)

            Spacer(modifier = Modifier.height(8.dp))

            LazyRow {
                items(forecast) { dia ->
                    Card(
                        modifier = Modifier
                            .padding(end = 8.dp)
                            .width(120.dp),
                        elevation = 4.dp
                    ) {
                        Box(
                            modifier = Modifier
                                .padding(16.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(text = dia, fontSize = 16.sp)
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(32.dp))

            Button(
                onClick = { navController.navigate("tip") },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF0077CC)),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Ver Dica do Dia", color = Color.White)
            }
        }
    }
}
