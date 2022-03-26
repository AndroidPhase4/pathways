package com.Phase4.pathways.views.Data_Scientist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.Phase4.pathways.R

class FragmentDataResources : Fragment() {
    private var dataCamp: Button? = null
    private var coursera: Button? = null
    private var harvard: Button? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_data_resources_fragment, container, false)

        dataCamp = view.findViewById(R.id.dataCampBtn)
        coursera = view.findViewById(R.id.courseraDataBtn)
        harvard = view.findViewById(R.id.harvardBtn)

        dataCamp?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragmentDataResources_to_dataCampFragment)
        })

        coursera?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragmentDataResources_to_courseraDataScienceFragment)
        })

        harvard?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragmentDataResources_to_harvardDataFragment)
        })

        return view
    }
}

