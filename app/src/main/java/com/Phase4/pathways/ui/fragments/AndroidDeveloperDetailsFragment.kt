package com.Phase4.pathways.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.Phase4.pathways.R

<<<<<<< HEAD:app/src/main/java/com/Phase4/pathways/views/Fragment_android_developer_details.kt


    class fragment_android_developer_details : Fragment() {
      
        private var bootcampBtn: Button? = null
        private var resourceBtn: Button? = null
=======
//
//
    class AndroidDeveloperDetailsFragment : Fragment() {
      
        private var bootcampBtn: Button? = null
        private var jobsBtn: Button? = null
>>>>>>> main:app/src/main/java/com/Phase4/pathways/ui/fragments/AndroidDeveloperDetailsFragment.kt

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            val view = inflater.inflate(R.layout.fragment_android_developer_details, container, false)
<<<<<<< HEAD:app/src/main/java/com/Phase4/pathways/views/Fragment_android_developer_details.kt
            val view2 = inflater.inflate(R.layout.fragment_android_developer_details, container, false)


            bootcampBtn = view.findViewById(R.id.BootcampBtn)
            resourceBtn = view.findViewById(R.id.ResourcesBtn)
=======
            val viewJobs = inflater.inflate(R.layout.fragment_android_developer_details, container, false)


        bootcampBtn = view.findViewById(R.id.BootcampBtn)
        jobsBtn = view.findViewById(R.id.androidJobsBtn)

>>>>>>> main:app/src/main/java/com/Phase4/pathways/ui/fragments/AndroidDeveloperDetailsFragment.kt

        bootcampBtn?.setOnClickListener(View.OnClickListener {
                Navigation.findNavController(
                    requireView()
                ).navigate(R.id.action_fragment_android_developer_details_to_fragment_bootcamp)
            })
<<<<<<< HEAD:app/src/main/java/com/Phase4/pathways/views/Fragment_android_developer_details.kt
            resourceBtn?.setOnClickListener(View.OnClickListener {
                Navigation.findNavController(
                    requireView()
                ).navigate(R.id.action_fragment_android_developer_details_to_fragmentAndroidResources)
            })
            return view
            return view2
=======
        jobsBtn?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragment_android_developer_details_to_jobAndroidDevFragment)
        })
            return view
            return viewJobs
>>>>>>> main:app/src/main/java/com/Phase4/pathways/ui/fragments/AndroidDeveloperDetailsFragment.kt
        }
    }