package com.example.weatherwise.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.weatherwise.R

@Composable
fun WelcomeScreen(navController: NavController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFEAF6FF)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_weather),
                contentDescription = "Logo",
                tint = Color.Unspecified,
                modifier = Modifier
                    .size(80.dp)
                    .padding(bottom = 16.dp)
            )

            Text(
                text = "WeatherWise",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF003366)
            )

            Spacer(modifier = Modifier.height(32.dp))

            Text(
                text = "Seja bem-vindo!",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Permita acesso à sua localização para ver previsões do tempo",
                fontSize = 16.sp,
                modifier = Modifier.padding(horizontal = 24.dp),
                color = Color.DarkGray
            )

            Spacer(modifier = Modifier.height(32.dp))

            Button(
                onClick = { navController.navigate("weather") },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF0077CC)),
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                Text(text = "Usar minha localização atual", color = Color.White)
            }

            Spacer(modifier = Modifier.height(32.dp))

            Image(
                painter = painterResource(id = R.drawable.ic_map),
                contentDescription = "Mapa ilustrativo",
                modifier = Modifier.size(150.dp)
            )
        }
    }
}
