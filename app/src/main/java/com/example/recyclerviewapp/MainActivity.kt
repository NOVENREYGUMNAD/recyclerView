package com.example.recyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var nameList : MutableList<sampleModel> = mutableListOf()
    private lateinit var sampleAdapter: sampleAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadData()
        sampleAdapter = sampleAdapter(nameList)
        binding.apply {
           rvMain.apply {
               layoutManager=LinearLayoutManager(this@MainActivity)
               adapter=sampleAdapter
           }
        }

    }

    private fun loadData(){
        nameList.add(sampleModel(1,"Bundle 0"))
        nameList.add(sampleModel(2,"sample 1"))
        nameList.add(sampleModel(3,"sample 2"))
        nameList.add(sampleModel(4,"sample 3"))
        nameList.add(sampleModel(5,"sample 4"))
        nameList.add(sampleModel(6,"sample 5"))
    }
}