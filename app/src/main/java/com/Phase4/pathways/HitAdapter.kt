package com.Phase4.pathways

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.Phase4.pathways.databinding.ItemHitBinding

class HitAdapter : RecyclerView.Adapter<HitAdapter.HitViewHolder>() {
    inner class HitViewHolder(val binding: ItemHitBinding) : RecyclerView.ViewHolder(binding.root)

    private val diffCallback = object : DiffUtil.ItemCallback<Hit>() {
        override fun areItemsTheSame(oldItem: Hit, newItem: Hit): Boolean {
            return oldItem.story_id == newItem.story_id
        }

        override fun areContentsTheSame(oldItem: Hit, newItem: Hit): Boolean {
            return oldItem == newItem
        }
    }

    private val differ = AsyncListDiffer(this, diffCallback)
    var hits: List<Hit>
    get() = differ.currentList
    set(value) { differ.submitList(value)}

    override fun getItemCount(): Int {
        return hits.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HitViewHolder {
        return HitViewHolder(ItemHitBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ))
    }

    override fun onBindViewHolder(holder: HitViewHolder, position: Int) {
        holder.binding.apply {
            val hit = hits[position]
            tvTitle.text = hit.title
        }
    }

}