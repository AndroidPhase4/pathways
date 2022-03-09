package com.Phase4.pathways.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Phase4.pathways.R
import com.Phase4.pathways.model.WebeDevloperResourcesAdapter
import com.Phase4.pathways.model.WebDeveloperResources
import com.Phase4.pathways.viewmodel.FragmentWebDeveloperResourcesViewModel

class Fragment_web_developer_resources : Fragment() {

    private lateinit var adapter: WebeDevloperResourcesAdapter
    private val title: List<WebDeveloperResources> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_web_developer_resources, container, false)

        initRecyclerView(view)
        return view
    }

    private fun initRecyclerView(view: View) {
        val recyclerView = view.findViewById<RecyclerView>(R.id.rvWebDevResources)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        adapter = WebeDevloperResourcesAdapter(title)
        recyclerView.adapter = adapter
    }

}