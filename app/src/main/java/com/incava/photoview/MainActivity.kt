package com.incava.photoview

import android.graphics.Matrix
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.incava.photoview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val matrix = Matrix()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.photoView.getSuppMatrix(matrix)
        binding.aura.setOnClickListener{returnView()}
    }

    private fun returnView(){
        binding.photoView.setSuppMatrix(matrix)
    }

}