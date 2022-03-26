package com.Phase4.pathways.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.Phase4.pathways.R

<<<<<<< HEAD:app/src/main/java/com/Phase4/pathways/views/Fragment_data_scientist_details.kt

class fragment_data_scientist_details : Fragment() {
    private var bootcampBtn: Button? = null
    private var resouceBtn: Button? = null
=======
//
//

class DataScienceDetailsFragment : Fragment() {
    private var bootcampBtn: Button? = null
    private var jobsBtn: Button? = null

>>>>>>> main:app/src/main/java/com/Phase4/pathways/ui/fragments/DataScienceDetailsFragment.kt

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_data_scientist_details, container, false)
<<<<<<< HEAD:app/src/main/java/com/Phase4/pathways/views/Fragment_data_scientist_details.kt
        val view2 = inflater.inflate(R.layout.fragment_data_scientist_details, container, false)


        bootcampBtn = view.findViewById(R.id.BootcampBtn)
        resouceBtn = view.findViewById(R.id.ResourcesBtn)
=======
        val viewJobs = inflater.inflate(R.layout.fragment_data_scientist_details, container, false)


        bootcampBtn = view.findViewById(R.id.BootcampBtn)
        jobsBtn = view.findViewById(R.id.JobsBtn)
>>>>>>> main:app/src/main/java/com/Phase4/pathways/ui/fragments/DataScienceDetailsFragment.kt


        bootcampBtn?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragment_data_scientist_details_to_fragment_bootcamp)
        })
<<<<<<< HEAD:app/src/main/java/com/Phase4/pathways/views/Fragment_data_scientist_details.kt
        resouceBtn?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragment_data_scientist_details_to_fragmentDataResources)
=======
        jobsBtn?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragment_data_scientist_details_to_jobDataScienceFragment)
>>>>>>> main:app/src/main/java/com/Phase4/pathways/ui/fragments/DataScienceDetailsFragment.kt
        })
        return view
        return viewJobs
    }
}
