package com.example.programa_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.programa_recyclerview.adapter.JediAdapter
import com.example.programa_recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView(){
        binding.recyclerJedi.layoutManager = LinearLayoutManager(this)
        binding.recyclerJedi.adapter =
            JediAdapter(JediProvider.jediList) { jedi ->
                onItemSelected(
                    jedi
                )
            }

    }

    fun onItemSelected(jedi: Jedi){
        Toast.makeText(this, jedi.Rango, Toast.LENGTH_SHORT).show()
    }

}