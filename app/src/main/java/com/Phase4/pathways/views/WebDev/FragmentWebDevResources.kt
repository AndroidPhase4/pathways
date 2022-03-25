package com.Phase4.pathways.views.WebDev

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.Navigation
import com.Phase4.pathways.R
import com.Phase4.pathways.databinding.FragmentWebDevResourcesFragmentBinding
import com.Phase4.pathways.viewmodel.FragmentWebDevResourcesViewModel
//This is the Web Developer Resources Page
//Listed the resources for:
//Udacity
//Khan Academy
//Codecademy

class FragmentWebDevResources : Fragment() {
    //Udacity
    private var udacityBtn: Button? = null
    //KA
    private var khanBtn: Button? = null
    //Codecademy
    private var codecademyBtn: Button? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //Udacity
        val view = inflater.inflate(R.layout.fragment_web_dev_resources_fragment, container, false)
        //KA
        val view2 = inflater.inflate(R.layout.fragment_web_dev_resources_fragment, container, false)
        //Codecademy
        val view3 = inflater.inflate(R.layout.fragment_web_dev_resources_fragment, container, false)


        //Udacity
        udacityBtn = view.findViewById(R.id.btnLaunchBrowser)
        //KA Button
        khanBtn = view.findViewById(R.id.resourceBtn3)
        //Codecademy
        codecademyBtn = view.findViewById(R.id.resourceBtn2)


        udacityBtn?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragmentWebDevResources_to_udacity_Web_Dev_Res)
        })
        //KA Button
        khanBtn?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragmentWebDevResources_to_khanAcademy_web_dev_resources)
        })
//Codecademy
        codecademyBtn?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragmentWebDevResources_to_codeCademy_web_dev_res)
        })

        return view
        //KA Button
        return view2
        //Codecademy
        return view3


    }


}


//
//
//    //Create variables for button to use in this file
////    private var [name of button xml file] : Button? = null
//
//
//    companion object {
//        fun newInstance() = FragmentWebDevResources()
//    }
//
//    private lateinit var viewModel: FragmentWebDevResourcesViewModel
//
//    private var _binding: FragmentWebDevResourcesFragmentBinding? = null
//    private val binding get() = _binding!!
//
//    private val btnLaunchBrowser: Button get() = binding.btnLaunchBrowser
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        return inflater.inflate(R.layout.fragment_web_dev_resources_fragment, container, false)
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        //Define and assign buttons
//        _binding = FragmentWebDevResourcesFragmentBinding.bind(view)
//
//        btnLaunchBrowser.setOnClickListener { //function goes here
//            launchBrowser()
//        }
//    }
//
//    private fun launchBrowser() {
//        // navigate to web page
//
//    }
//}
