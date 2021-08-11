package com.cmota.unsplash.ui

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.cmota.unsplash.ui.theme.UnsplashTheme

class MainActivity : AppCompatActivity() {

    private val unsplashViewModel: UnsplashViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            UnsplashTheme {
                /* Your Code Goes Here */
            }
        }
    }
}