package com.Phase4.pathways.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.Phase4.pathways.R

class CyberSecurityDetailsFragment : Fragment() {
    private var bootcampBtn: Button? = null
    private var resourceBtn: Button? = null
    private var jobsBtn: Button? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_cyber_security_details, container, false)

        bootcampBtn = view.findViewById(R.id.BootcampBtn)
        resourceBtn = view.findViewById(R.id.ResourcesBtn)
        jobsBtn = view.findViewById(R.id.JobsBtn)

        bootcampBtn?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragment_cyber_security_details_to_fragment_bootcamp)
        })

        resourceBtn?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragment_cyber_security_details_to_fragmentCyberResources)
        })

        jobsBtn?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragment_cyber_security_details_to_jobCyberSecurityFragment)
        })
        return view
    }
}