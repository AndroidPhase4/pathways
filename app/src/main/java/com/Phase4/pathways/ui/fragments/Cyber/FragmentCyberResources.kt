package com.Phase4.pathways.views.Cyber

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.Phase4.pathways.R

class FragmentCyberResources : Fragment() {


    //Android.Developer (Google)
    private var edX: Button? = null
    //Udacity
    private var courseraCyber: Button? = null
    //Coursera
    private var codecademyCyber: Button? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_cyber_resources_fragment, container, false)

        edX = view.findViewById(R.id.edXCyberBtn)
        courseraCyber = view.findViewById(R.id.courseraCyberBtn)
        codecademyCyber = view.findViewById(R.id.codecademyCyberBtn)

        edX?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragmentCyberResources_to_edxCyberFragment)
        })

        courseraCyber?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragmentCyberResources_to_courseraCyberFragment)
        })

        codecademyCyber?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragmentCyberResources_to_codecademyCyberFragment)
        })

        return view

    }
}
