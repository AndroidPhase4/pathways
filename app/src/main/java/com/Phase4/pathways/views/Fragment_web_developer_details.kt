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
    private var resouceBtn: Button? = null


     override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_web_developer_details, container, false)
         //Resource Button
         val view2 = inflater.inflate(R.layout.fragment_web_developer_details, container, false)


         bootcampBtn = view.findViewById(R.id.BootcampBtn)
         //Resouce Button
         resouceBtn = view.findViewById(R.id.ResourcesBtn)

        bootcampBtn?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragment_web_developer_details_to_fragment_bootcamp)
        })
         //Resouces Button
         resouceBtn?.setOnClickListener(View.OnClickListener {
             Navigation.findNavController(
                 requireView()
             ).navigate(R.id.action_fragment_web_developer_details_to_fragmentWebDevResources)
         })

        return view
//Resoucre Button
         return view2


    }


}
