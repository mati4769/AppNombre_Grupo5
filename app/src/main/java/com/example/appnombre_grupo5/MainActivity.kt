package com.example.appnombre_grupo5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat // Necesario para edge-to-edge
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.appnombre_grupo5.ui.screens.PostsScreen
import com.example.appnombre_grupo5.ui.theme.AppNombre_Grupo5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Permite que la app dibuje contenido debajo de las barras del sistema
        WindowCompat.setDecorFitsSystemWindows(window, false)

        // Aquí inicia Jetpack Compose
        setContent {
            // Aplicamos el tema Material 3
             AppNombre_Grupo5Theme{
                // Inyectamos el ViewModel
                val postViewModel: com.example.appnombre_grupo5.viewmodel.PostViewModel = viewModel()

                // Llamamos a la pantalla principal y pasamos el ViewModel
                PostsScreen(viewModel = postViewModel)
            }
        }
    }
}