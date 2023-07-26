package com.example.recyclerviewapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewapp.databinding.ItemRowBinding

class sampleAdapter(val items : MutableList<sampleModel>)
    : RecyclerView.Adapter<sampleAdapter.ViewHolder>() {

    private lateinit var binding: ItemRowBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): sampleAdapter.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        binding=ItemRowBinding.inflate(inflater,parent, false)
        return ViewHolder(binding)

    }

    override fun onBindViewHolder(holder: sampleAdapter.ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size

    inner class ViewHolder(itemView : ItemRowBinding) : RecyclerView.ViewHolder(itemView.root){
        fun bind(item : sampleModel){
            binding.apply {
                tvId.text=item.id.toString()
                tvName.text=item.name
            }

       }

    }
}