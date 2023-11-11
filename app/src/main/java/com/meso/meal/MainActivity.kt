package com.meso.meal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.meso.meal.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    private val mainViewModel by viewModel<MainViewModel>()
    private lateinit var binding: ActivityMainBinding
    private lateinit var mainddapter: MainAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.mainViewModel = mainViewModel
        binding.lifecycleOwner = this
        mainddapter = MainAdapter()
        binding.recyclerView.adapter = mainddapter
        setContentView(binding.root)

    }
}