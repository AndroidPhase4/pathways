package com.Phase4.pathways.adapters

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.Phase4.pathways.R
import com.Phase4.pathways.models.Job
import com.Phase4.pathways.ui.fragments.JobsFragment

class JobAdapter(
    private val context: JobsFragment,
    private val jobs: List<Job>
) : RecyclerView.Adapter<JobAdapter.JobViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_job, parent, false)
        return JobViewHolder(view)
    }

    override fun getItemCount(): Int {
        return jobs.size
    }

    override fun onBindViewHolder(holder: JobViewHolder, position: Int) {
        val job = jobs[position]

        holder.jobTitle.text = context.resources.getString(job.jobTitleId)
        holder.jobImageView.setImageResource(job.jobImageResourceId)
        holder.jobDescription.text = context.resources.getString(job.jobDescriptionId)

        holder.itemView.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(context.resources.getString(job.jobUrlResourceId))
            context.startActivity(intent)
        }
    }

    inner class JobViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val jobTitle: TextView = itemView.findViewById(R.id.tvJobTitle)
        val jobImageView: ImageView = itemView.findViewById(R.id.ivJobImage)
        val jobDescription: TextView = itemView.findViewById(R.id.tvJobDescription)
    }
}

