package com.example.programa_recyclerview.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.programa_recyclerview.Jedi
import com.example.programa_recyclerview.databinding.ItemJediBinding

class JediViewHolder(view:View):RecyclerView.ViewHolder(view){

    val binding = ItemJediBinding.bind(view)

    fun render(jediModel: Jedi, onClickListener: (Jedi) -> Unit){
        binding.tvJediName.text = jediModel.Name
        binding.tvRango.text = jediModel.Rango
        Glide.with(binding.ivJedi.context).load(jediModel.photo).into(binding.ivJedi)
        itemView.setOnClickListener {onClickListener(jediModel)}
        binding.ivJedi.setOnClickListener {
            Toast.makeText(
                binding.ivJedi.context,
                jediModel.Name,
                Toast.LENGTH_SHORT
            ).show()
        }

    }
}