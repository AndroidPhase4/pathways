package com.Phase4.pathways.model

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.Phase4.pathways.R
import com.Phase4.pathways.models.Bootcamp
import com.Phase4.pathways.ui.fragments.BootcampFragment
import com.google.android.material.snackbar.Snackbar

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

    override fun onBindViewHolder(holder: BootcampViewHolder, position: Int) {
        val bootcamp = bootcamps[position]

        holder.title.text = context.resources.getString(bootcamp.titleResourceId)
        holder.imageView.setImageResource(bootcamp.imageResourceId)
        holder.description.text = context.resources.getString(bootcamp.descriptionResourceId)

        holder.itemView.setOnClickListener {
            Snackbar.make(holder.itemView, "Clicked a bootcamp",  Snackbar.LENGTH_SHORT).show()

            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(context.resources.getString(bootcamp.urlResourceId))
            context.startActivity(intent)
        }
    }

    inner class BootcampViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
          val title: TextView = itemView.findViewById(R.id.tvBootcampTitle)
          val imageView: ImageView = itemView.findViewById(R.id.ivBootcampImage)
          val description: TextView = itemView.findViewById(R.id.tvBootcampDescription)
    }
}


