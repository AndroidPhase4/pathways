package com.Phase4.pathways.views

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.Phase4.pathways.R
import com.Phase4.pathways.viewmodel.FragmentDataScientistDetailsViewModel

class fragment_data_scientist_details : Fragment() {

    private lateinit var viewModel: FragmentDataScientistDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_data_scientist_details, container, false)
    }


}