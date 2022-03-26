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
        //Android.Developer (Google)
        val view = inflater.inflate(R.layout.fragment_data_resources_fragment, container, false)
        //Udacity
        val view2 = inflater.inflate(R.layout.fragment_data_resources_fragment, container, false)
        //Coursera
        val view3 = inflater.inflate(R.layout.fragment_data_resources_fragment, container, false)


        //Android.Developer (Google)
        dataCamp = view.findViewById(R.id.dataCampBtn)
        //Udacity Button
        coursera = view.findViewById(R.id.courseraDataBtn)
        //Coursera
        harvard = view.findViewById(R.id.harvardBtn)

        //Android.Developer (Google)
        dataCamp?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragmentDataResources_to_dataCampFragment)
        })
        //Udacity Button
        coursera?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragmentDataResources_to_courseraDataScienceFragment)
        })
        //Coursera
        harvard?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragmentDataResources_to_harvardDataFragment)
        })

        //Android.Developer (Google)
        return view
        //Udacity Button
        return view2
        //Coursera
        return view3


    }
}

