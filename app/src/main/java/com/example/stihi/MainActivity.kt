package com.example.stihi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.util.Log

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "Этой ночью Дед мороз \n")
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Снег и стужу нам принёс. \n")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Замела метель дороги, \n")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Мёрзнут руки, мёрзнут ноги, \n")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Щиплет щёки,щиплет нос, \n")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Здравствуй, Дедушка Мороз!")
    }
}