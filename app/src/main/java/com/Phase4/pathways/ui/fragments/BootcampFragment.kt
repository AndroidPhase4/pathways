package com.Phase4.pathways.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Phase4.pathways.R
import com.Phase4.pathways.model.BootcampAdapter
import com.Phase4.pathways.data.Datasource


class BootcampFragment : Fragment() {

   lateinit var adapter: BootcampAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_bootcamp, container, false)

        initRecyclerView(view)
        return view
    }



    private fun initRecyclerView(view: View) {
        val data = Datasource().loadBootcamps()

        val recyclerView = view.findViewById<RecyclerView>(R.id.rvBootcamps)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        adapter = BootcampAdapter(this,data)
        recyclerView.adapter = adapter
    }



}