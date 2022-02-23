package com.Phase4.pathways.views

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.Phase4.pathways.R
import kotlinx.android.synthetic.main.item_bootcamp.view.*

class BootcampAdapter (
    private val bootcamps: MutableList<Bootcamp>
) : RecyclerView.Adapter<BootcampAdapter.BootcampViewHolder>() {

    class BootcampViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BootcampViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_bootcamp, parent, false)
        return BootcampViewHolder(view)
    }

    override fun getItemCount(): Int {
        return bootcamps.size
    }

    override fun onBindViewHolder(holder: BootcampViewHolder, position: Int) {
        val currBootcamp = bootcamps[position]
        holder.itemView.apply {

           tvTodoTitle.text = currBootcamp.title
        }
    }


}