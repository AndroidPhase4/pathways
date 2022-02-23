package com.Phase4.pathways

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Phase4.pathways.model.Project
import com.Phase4.pathways.model.ProjectAdapter
import java.util.*
import kotlin.collections.ArrayList


class RecyclerviewFragment : Fragment() {

    private lateinit var layoutManager: RecyclerView.LayoutManager
    private lateinit var adapter: RecyclerView.Adapter<RecyclerView.ViewHolder>
    val title: List<Project> = ArrayList()



    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_recyclerview, container, false)

        val title = view.findViewById<TextView>(R.id.text_view_project_title)
        val description = view.findViewById<TextView>(R.id.text_view_project_desc)

        initRecyclerView(view)
        return view

    }

    private fun initRecyclerView(view: View){
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(activity)

        recyclerView.adapter = adapter
    }



    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)


        }









}