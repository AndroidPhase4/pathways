package com.Phase4.pathways

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView

class HitAdapter : RecyclerView.Adapter<HitAdapter.HitViewHolder>() {

    inner class HitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewTitle: TextView = itemView.findViewById(R.id.tvTitle)
    }

    private val diffCallback = object : DiffUtil.ItemCallback<Hit>() {
        override fun areItemsTheSame(oldItem: Hit, newItem: Hit): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Hit, newItem: Hit): Boolean {
            return oldItem == newItem
        }
    }

    private val differ = AsyncListDiffer(this, diffCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HitViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_hit,parent, false)
        return HitViewHolder(view)
    }

    override fun onBindViewHolder(holder: HitViewHolder, position: Int) {
        val hit = differ.currentList[position]
            holder.textViewTitle.text = hit.title
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

}