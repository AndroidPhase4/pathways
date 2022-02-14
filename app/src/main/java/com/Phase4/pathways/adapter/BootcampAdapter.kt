package com.Phase4.pathways.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.Phase4.pathways.R
import com.Phase4.pathways.model.Bootcamp

class BootcampAdapter(
    private val context: Context,
    private val dataset: List<Bootcamp>
) : RecyclerView.Adapter<BootcampAdapter.BootcampViewHolder> () {
    class BootcampViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.bootcamp_title)
        val textView2: TextView = view.findViewById(R.id.bootcamp_description)
        val imageView: ImageView = view.findViewById(R.id.bootcamp_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BootcampViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.bootcamp_list, parent, false)

        return BootcampViewHolder(adapterLayout)
    }


    override fun onBindViewHolder(holder: BootcampViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text =  context.resources.getString(item.stringResourceId)
        holder.textView2.text =  context.resources.getString(item.stringResourceId2)
        holder.imageView.setImageResource(item.imageResourceId)
    }


    override fun getItemCount(): Int {
        return dataset.size
    }


}