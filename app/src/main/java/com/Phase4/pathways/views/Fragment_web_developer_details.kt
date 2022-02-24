package com.Phase4.pathways.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.Phase4.pathways.R

class fragment_web_developer_details : Fragment() {

//    companion object {
//        fun newInstance() = fragment_pathways_details()
//    }
//
//    private lateinit var viewModel: FragmentPathwaysDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_web_developer_details, container, false)
    }

}