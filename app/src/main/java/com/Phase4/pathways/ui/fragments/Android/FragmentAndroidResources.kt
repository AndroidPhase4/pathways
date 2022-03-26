package com.Phase4.pathways.views.Android

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.Phase4.pathways.R


class FragmentAndroidResources : Fragment() {
    private var androidDev: Button? = null
    private var androidUdacity: Button? = null
    private var androidCoursera: Button? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_android_resources_fragment, container, false)

        androidDev = view.findViewById(R.id.androidDevBtn)
        androidUdacity = view.findViewById(R.id.androidUdacityBtn)
        androidCoursera = view.findViewById(R.id.androidCourseraBtn)

        androidDev?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragmentAndroidResources_to_androidDeveloperGoogleFragment)
        })

        androidUdacity?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragmentAndroidResources_to_androidUdacityFragment)
        })

        androidCoursera?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragmentAndroidResources_to_androidCourseraFragment)
        })

        //Android.Developer (Google)
        return view
    }
}