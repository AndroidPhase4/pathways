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
//ResourcesBtn

class CyberSecurityDetailsFragment : Fragment() {
    private var bootcampBtn: Button? = null
<<<<<<< HEAD:app/src/main/java/com/Phase4/pathways/views/Fragment_cyber_security_details.kt
    private var resourceBtn: Button? = null

=======
    private var jobsBtn: Button? = null
>>>>>>> main:app/src/main/java/com/Phase4/pathways/ui/fragments/CyberSecurityDetailsFragment.kt

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_cyber_security_details, container, false)
<<<<<<< HEAD:app/src/main/java/com/Phase4/pathways/views/Fragment_cyber_security_details.kt
        val view2 = inflater.inflate(R.layout.fragment_cyber_security_details, container, false)


        bootcampBtn = view.findViewById(R.id.BootcampBtn)
        resourceBtn = view.findViewById(R.id.ResourcesBtn)
=======
        val viewJobs = inflater.inflate(R.layout.fragment_cyber_security_details, container, false)


        bootcampBtn = view.findViewById(R.id.BootcampBtn)
        jobsBtn = view.findViewById(R.id.JobsBtn)
>>>>>>> main:app/src/main/java/com/Phase4/pathways/ui/fragments/CyberSecurityDetailsFragment.kt


        bootcampBtn?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragment_cyber_security_details_to_fragment_bootcamp)
        })
<<<<<<< HEAD:app/src/main/java/com/Phase4/pathways/views/Fragment_cyber_security_details.kt
        resourceBtn?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragment_cyber_security_details_to_fragmentCyberResources)
        })
        return view
        return view2
=======
        jobsBtn?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragment_cyber_security_details_to_jobCyberSecurityFragment)
        })
        return view
        return viewJobs
>>>>>>> main:app/src/main/java/com/Phase4/pathways/ui/fragments/CyberSecurityDetailsFragment.kt
    }
}