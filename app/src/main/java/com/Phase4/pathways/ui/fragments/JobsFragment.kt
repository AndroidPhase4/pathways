package com.Phase4.pathways.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Phase4.pathways.R
import com.Phase4.pathways.adapters.JobAdapter
import com.Phase4.pathways.data.JobsDatasource

class JobsFragment : Fragment() {

     lateinit var adapter: JobAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_jobs, container, false)

        initRecyclerView(view)
        return view
    }

    private fun initRecyclerView(view: View) {
        val data = JobsDatasource().loadJobs()

        val recyclerView = view.findViewById<RecyclerView>(R.id.rvJobs)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        adapter = JobAdapter(this, data)
        recyclerView.adapter = adapter
    }
}