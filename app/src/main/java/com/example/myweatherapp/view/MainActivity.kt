package com.example.myweatherapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myweatherapp.R
import com.example.myweatherapp.databinding.MainActivityBinding
import com.example.myweatherapp.view.main.MainFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}