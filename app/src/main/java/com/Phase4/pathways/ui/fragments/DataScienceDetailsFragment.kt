package com.Phase4.pathways.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.Phase4.pathways.R

//
//

class DataScienceDetailsFragment : Fragment() {
    private var bootcampBtn: Button? = null
    private var jobsBtn: Button? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_data_scientist_details, container, false)
        val viewJobs = inflater.inflate(R.layout.fragment_data_scientist_details, container, false)


        bootcampBtn = view.findViewById(R.id.BootcampBtn)
        jobsBtn = view.findViewById(R.id.JobsBtn)


        bootcampBtn?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragment_data_scientist_details_to_fragment_bootcamp)
        })
        jobsBtn?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragment_data_scientist_details_to_jobDataScienceFragment)
        })
        return view
        return viewJobs
    }
}
