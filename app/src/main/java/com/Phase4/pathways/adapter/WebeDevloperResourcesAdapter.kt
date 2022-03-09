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


    private var titles = arrayOf("Youtube", "Websites", "Apps")



    private var description = arrayOf(
        "https://www.youtube.com/channel/UC29ju8bIPH5as8OGnQzwJyA\n" +
                "https://www.youtube.com/channel/UCyIe-61Y8C4_o-zZCtO4ETQ\n" +
                "https://www.youtube.com/channel/UC5DNytAJ6_FISueUfzZCVsw",
        "https://www.freecodecamp.org\n" +
                "https://www.codecademy.com\n" +
                "https://www.w3schools.com\n" +
                "https://www.coursera.org\n" +
                "https://www.edx.org\n",
        "https://play.google.com/store/apps/details?id=com.sololearn&hl=en_US&gl=US\n" +
                "https://apps.apple.com/us/app/sololearn-learn-to-code/id1210079064\n" +
                "https://play.google.com/store/apps/details?id=net.androidsquad.androidmaster&hl=en_US&gl=US\n" +
                "https://play.google.com/store/apps/details?id=com.freeit.java&hl=en_US&gl=US\n" +
                "https://apps.apple.com/us/app/programming-hub-learn-coding/id1049691226\n")

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