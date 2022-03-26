package com.Phase4.pathways.views.Cyber

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.Phase4.pathways.R
import com.Phase4.pathways.viewmodel.Cyber.FragmentCyberResourcesViewModel

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
        //Android.Developer (Google)
        val view = inflater.inflate(R.layout.fragment_cyber_resources_fragment, container, false)
        //Udacity
        val view2 = inflater.inflate(R.layout.fragment_cyber_resources_fragment, container, false)
        //Coursera
        val view3 = inflater.inflate(R.layout.fragment_cyber_resources_fragment, container, false)


        //Android.Developer (Google)
        edX = view.findViewById(R.id.edXCyberBtn)
        //Udacity Button
        courseraCyber = view.findViewById(R.id.courseraCyberBtn)
        //Coursera
        codecademyCyber = view.findViewById(R.id.codecademyCyberBtn)

        //Android.Developer (Google)
        edX?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragmentCyberResources_to_edxCyberFragment)
        })
        //Udacity Button
        courseraCyber?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragmentCyberResources_to_courseraCyberFragment)
        })
        //Coursera
        codecademyCyber?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragmentCyberResources_to_codecademyCyberFragment)
        })

        //Android.Developer (Google)
        return view
        //Udacity Button
        return view2
        //Coursera
        return view3


    }
}
