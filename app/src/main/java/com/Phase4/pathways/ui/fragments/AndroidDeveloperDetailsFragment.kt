package com.Phase4.pathways.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.Phase4.pathways.R

    class AndroidDeveloperDetailsFragment : Fragment() {
        private var bootcampBtn: Button? = null
        private var jobsBtn: Button? = null

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            val view = inflater.inflate(R.layout.fragment_android_developer_details, container, false)

            bootcampBtn = view.findViewById(R.id.BootcampBtn)
            jobsBtn = view.findViewById(R.id.JobsBtn)

            bootcampBtn?.setOnClickListener(View.OnClickListener {
                Navigation.findNavController(
                    requireView()
                ).navigate(R.id.action_fragment_android_developer_details_to_fragment_bootcamp)
            })

            jobsBtn?.setOnClickListener(View.OnClickListener {
                Navigation.findNavController(
                    requireView()
                ).navigate(R.id.action_fragment_android_developer_details_to_jobsFragment)
            })
            return view
        }
    }