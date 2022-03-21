package com.Phase4.pathways.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.Phase4.pathways.R
import com.Phase4.pathways.models.Bootcamp
import com.Phase4.pathways.ui.fragments.BootcampFragment

class BootcampAdapter(
    private val context: BootcampFragment,
    private val bootcamps: List<Bootcamp>
    ) : RecyclerView.Adapter<BootcampAdapter.BootcampViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BootcampViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_bootcamp, parent, false)
        return BootcampViewHolder(view)
    }

    override fun getItemCount(): Int {
        return bootcamps.size
    }

    // involves populating data into item through the holder
    override fun onBindViewHolder(holder: BootcampViewHolder, position: Int) {
        val bootcamp = bootcamps[position]
        holder.title.text = context.resources.getString(bootcamp.titleResourceId)
        holder.imageView.setImageResource(bootcamp.imageResourceId)
        holder.description.text = context.resources.getString(bootcamp.descriptionResourceId)
    }

    inner class BootcampViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
          val title: TextView = itemView.findViewById(R.id.tvBootcampTitle)
          val imageView: ImageView = itemView.findViewById(R.id.ivBootcampImage)
          val description: TextView = itemView.findViewById(R.id.tvBootcampDescription)
    }
}

