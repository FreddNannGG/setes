package com.example.programa_recyclerview.adapter

import android.content.DialogInterface.OnClickListener
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.programa_recyclerview.Jedi
import com.example.programa_recyclerview.R

class JediAdapter(private val jediList:List<Jedi>, private val onClickListener: (Jedi) -> Unit) : RecyclerView.Adapter<JediViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JediViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return JediViewHolder(layoutInflater.inflate(R.layout.item_jedi, parent, false))
    }

    override fun onBindViewHolder(holder: JediViewHolder, position: Int) {
        val item = jediList[position]
        holder.render(item, onClickListener)
    }

    override fun getItemCount(): Int = jediList.size
}
