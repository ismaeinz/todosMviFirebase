package com.example.mviandfirestoretodoapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.mviandfirestoretodoapp.feature_tasks.ui.theme.MVIAndFirestoreTodoAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MVIAndFirestoreTodoAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize())
                { innerPadding ->

                }
            }
        }
    }
}

