package com.Phase4.pathways.ui.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.Phase4.pathways.R

class WebDeveloperDetailsFragment : Fragment() {
    private var bootcampBtn: Button? = null
    private var resourceBtn: Button? = null
    private var jobsBtn: Button? = null

     override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_web_developer_details, container, false)

         bootcampBtn = view.findViewById(R.id.BootcampBtn)
         resourceBtn = view.findViewById(R.id.ResourcesBtn)
         jobsBtn = view.findViewById(R.id.JobsWebDevBtn)

        bootcampBtn?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragment_web_developer_details_to_fragment_bootcamp)
        })

         resourceBtn?.setOnClickListener(View.OnClickListener {
             Navigation.findNavController(
                 requireView()
             ).navigate(R.id.action_fragment_web_developer_details_to_fragmentWebDevResources)
         })

        jobsBtn?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragment_web_developer_details_to_jobWebDevFragment)
        })
        return view
    }
}
