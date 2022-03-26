package com.Phase4.pathways.ui.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.Phase4.pathways.R

//
//
class WebDeveloperDetailsFragment : Fragment() {
    private var bootcampBtn: Button? = null
<<<<<<< HEAD:app/src/main/java/com/Phase4/pathways/views/Fragment_web_developer_details.kt
    private var resouceBtn: Button? = null
=======
    private var jobsBtn: Button? = null

>>>>>>> main:app/src/main/java/com/Phase4/pathways/ui/fragments/WebDeveloperDetailsFragment.kt


     override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_web_developer_details, container, false)
<<<<<<< HEAD:app/src/main/java/com/Phase4/pathways/views/Fragment_web_developer_details.kt
         //Resource Button
         val view2 = inflater.inflate(R.layout.fragment_web_developer_details, container, false)


         bootcampBtn = view.findViewById(R.id.BootcampBtn)
         //Resouce Button
         resouceBtn = view.findViewById(R.id.ResourcesBtn)
=======
        val viewJobs = inflater.inflate(R.layout.fragment_web_developer_details, container, false)


        bootcampBtn = view.findViewById(R.id.BootcampBtn)
        jobsBtn = view.findViewById(R.id.JobsWebDevBtn)

>>>>>>> main:app/src/main/java/com/Phase4/pathways/ui/fragments/WebDeveloperDetailsFragment.kt

        bootcampBtn?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragment_web_developer_details_to_fragment_bootcamp)
        })
<<<<<<< HEAD:app/src/main/java/com/Phase4/pathways/views/Fragment_web_developer_details.kt
         //Resouces Button
         resouceBtn?.setOnClickListener(View.OnClickListener {
             Navigation.findNavController(
                 requireView()
             ).navigate(R.id.action_fragment_web_developer_details_to_fragmentWebDevResources)
         })

        return view
//Resoucre Button
         return view2


=======
        jobsBtn?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_fragment_web_developer_details_to_jobWebDevFragment)
        })
        return view
        return viewJobs
>>>>>>> main:app/src/main/java/com/Phase4/pathways/ui/fragments/WebDeveloperDetailsFragment.kt
    }


}
