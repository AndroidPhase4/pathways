package com.Phase4.pathways.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.Phase4.pathways.R
import kotlinx.android.synthetic.main.item_bootcamp.view.*

class BootcampAdapter (val bootcamp: List<Bootcamp>) : RecyclerView.Adapter<BootcampViewHolder>() {


    private var titles = arrayOf("Software Developer", "Data Science", "IT Specialist", "UX Designer")

    private var description = arrayOf(
        "This how you become a software developer",
        "This is how you become a data scienctist",
        "This is how you become a IT specialist",
        "This how you become a UX Designer"
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BootcampViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_bootcamp, parent, false)
        return BootcampViewHolder(view)
    }

    override fun onBindViewHolder(holder: BootcampViewHolder, position: Int) {

        holder.textViewTitle.text = titles[position]
        holder.textViewDesc.text = description[position]

    }

    override fun getItemCount(): Int {
        return titles.size
    }
}

class BootcampViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var imageView: ImageView = itemView.findViewById(R.id.image_view_project_icon)
    var textViewTitle: TextView = itemView.findViewById(R.id.text_view_project_title)
    var textViewDesc: TextView = itemView.findViewById(R.id.text_view_project_desc)
}
