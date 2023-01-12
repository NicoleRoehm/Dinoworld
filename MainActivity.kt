package com.example.dino_eggs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.dino_eggs.adapter.DinoAdapter
import com.example.dino_eggs.data.DataSource
import com.example.dino_eggs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val datasource = DataSource()
        val dinolist = datasource.getDinos()

        binding.dinoRecycler.adapter = DinoAdapter(this, dinolist)
    }
}