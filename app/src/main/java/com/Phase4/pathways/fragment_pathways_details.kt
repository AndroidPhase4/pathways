package com.Phase4.pathways

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class fragment_pathways_details : Fragment() {

    companion object {
        fun newInstance() = fragment_pathways_details()
    }

    private lateinit var viewModel: FragmentPathwaysDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pathways_details_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FragmentPathwaysDetailsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}