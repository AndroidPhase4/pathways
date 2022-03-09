package com.Phase4.pathways.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.Phase4.pathways.R

class WebeDevloperResourcesAdapter (val webDeveloperResources: List<WebDeveloperResources>) :
    RecyclerView.Adapter<WebDeveloperResourcesViewHolder>() {


    private var titles = arrayOf("test title")

    private var description = arrayOf("test desc")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WebDeveloperResourcesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.web_dev_resources_list, parent, false)
        return WebDeveloperResourcesViewHolder(view)
    }

    override fun onBindViewHolder(holder: WebDeveloperResourcesViewHolder, position: Int) {

        holder.textViewTitle.text = titles[position]
        holder.textViewDesc.text = description[position]

    }

    override fun getItemCount(): Int {
        return titles.size
    }
}

class WebDeveloperResourcesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var imageView: ImageView = itemView.findViewById(R.id.web_dev_resources_image)
    var textViewTitle: TextView = itemView.findViewById(R.id.web_dev_resources_title)
    var textViewDesc: TextView = itemView.findViewById(R.id.web_dev_resources_desc)
}