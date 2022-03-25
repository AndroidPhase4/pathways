package com.Phase4.pathways.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.Phase4.pathways.R



    class fragment_android_developer_details : Fragment() {
      
        private var bootcampBtn: Button? = null
        private var resourceBtn: Button? = null

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            val view = inflater.inflate(R.layout.fragment_android_developer_details, container, false)
            val view2 = inflater.inflate(R.layout.fragment_android_developer_details, container, false)


            bootcampBtn = view.findViewById(R.id.BootcampBtn)
            resourceBtn = view.findViewById(R.id.ResourcesBtn)

            bootcampBtn?.setOnClickListener(View.OnClickListener {
                Navigation.findNavController(
                    requireView()
                ).navigate(R.id.action_fragment_android_developer_details_to_fragment_bootcamp)
            })
            resourceBtn?.setOnClickListener(View.OnClickListener {
                Navigation.findNavController(
                    requireView()
                ).navigate(R.id.action_fragment_android_developer_details_to_fragmentAndroidResources)
            })
            return view
            return view2
        }
    }