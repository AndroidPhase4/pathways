package com.Phase4.pathways.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Phase4.pathways.R
import com.Phase4.pathways.model.Bootcamp
import com.Phase4.pathways.model.BootcampAdapter


class Fragment_bootcamp : Fragment() {

    private lateinit var adapter: BootcampAdapter
    private val title: List<Bootcamp> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_bootcamp, container, false)

        initRecyclerView(view)
        return view
    }

    private fun initRecyclerView(view: View) {
        val recyclerView = view.findViewById<RecyclerView>(R.id.rvBootcamps)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        adapter = BootcampAdapter(title)
        recyclerView.adapter = adapter
    }

}