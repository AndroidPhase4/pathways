package com.Phase4.pathways.views


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.Phase4.pathways.R


class fragment_web_developer_details : Fragment() {
    private var bootcampBtn: Button? = null
    private var webdevresourcesBtn: Button? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_web_developer_details, container, false)
//        val view2 = inflater.inflate(R.layout.fragment_web_developer_resources, container, false)

        bootcampBtn = view.findViewById(R.id.BootcampBtn)
        webdevresourcesBtn = view.findViewById(R.id.ResourcesBtn)

        bootcampBtn?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragment_web_developer_details_to_fragment_bootcamp)
        })

        webdevresourcesBtn?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragment_web_developer_details_to_fragment_web_developer_resources)
        })
        return view
    }
}

