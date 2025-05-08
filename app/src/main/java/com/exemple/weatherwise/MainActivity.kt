package com.example.weatherwise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.weatherwise.screens.TipScreen
import com.example.weatherwise.screens.WelcomeScreen
import com.example.weatherwise.screens.WeatherScreen
import com.example.weatherwise.ui.theme.WeatherWiseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherWiseApp()
        }
    }
}

@Composable
fun WeatherWiseApp() {
    WeatherWiseTheme {
        Surface(color = MaterialTheme.colors.background) {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "welcome") {
                composable("welcome") { WelcomeScreen(navController) }
                composable("weather") { WeatherScreen(navController) }
                composable("tip") { TipScreen(navController) }
            }
        }
    }
}
