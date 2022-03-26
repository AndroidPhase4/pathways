package com.Phase4.pathways.views.Android

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.Phase4.pathways.R

//This is the Web Developer Resources Page
//Listed the resources for:
//Android.Developer (Google)
//Udacity
//Coursera


class FragmentAndroidResources : Fragment() {

    //Android.Developer (Google)
    private var androidDev: Button? = null
    //Udacity
    private var androidUdacity: Button? = null
    //Coursera
    private var androidCoursera: Button? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //Android.Developer (Google)
        val view = inflater.inflate(R.layout.fragment_android_resources_fragment, container, false)
        //Udacity
        val view2 = inflater.inflate(R.layout.fragment_android_resources_fragment, container, false)
        //Coursera
        val view3 = inflater.inflate(R.layout.fragment_android_resources_fragment, container, false)


        //Android.Developer (Google)
        androidDev = view.findViewById(R.id.androidDevBtn)
        //Udacity Button
        androidUdacity = view.findViewById(R.id.androidUdacityBtn)
        //Coursera
        androidCoursera = view.findViewById(R.id.androidCourseraBtn)

        //Android.Developer (Google)
        androidDev?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragmentAndroidResources_to_androidDeveloperGoogleFragment)
        })
        //Udacity Button
        androidUdacity?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragmentAndroidResources_to_androidUdacityFragment)
        })
        //Coursera
        androidCoursera?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragmentAndroidResources_to_androidCourseraFragment)
        })

        //Android.Developer (Google)
        return view
        //Udacity Button
        return view2
        //Coursera
        return view3


    }
}