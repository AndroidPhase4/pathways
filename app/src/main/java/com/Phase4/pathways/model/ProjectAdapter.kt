package com.Phase4.pathways.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.Phase4.pathways.R

class ProjectAdapter(val project: List<Project>) : RecyclerView.Adapter<ProjectViewHolder>() {

    private var titles =
        arrayOf("Software Developer", "Data Science", "IT Specialist", "UX Designer")

    private var description = arrayOf(
        "This how you become a software developer",
        "This is how you become a data scienctist",
        "This is how you become a IT specialist",
        "This how you become a UX Designer"
    )


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_project, parent, false)
        return ProjectViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProjectViewHolder, i: Int) {

        holder.textViewTitle.text = titles[i]
        holder.textViewDesc.text = description[i]

    }

    override fun getItemCount(): Int {
        return titles.size
    }
}

class ProjectViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
     var imageView: ImageView = itemView.findViewById(R.id.image_view_project_icon)
     var textViewTitle: TextView = itemView.findViewById(R.id.text_view_project_title)
     var textViewDesc: TextView = itemView.findViewById(R.id.text_view_project_desc)


    fun bindView(project: Project) {

    }


}