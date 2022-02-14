package com.Phase4.pathways.views

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.Navigation
import com.Phase4.pathways.R


class fragment_web_developer_details : Fragment() {
    private val loggedInUserTextView: TextView? = null
    private var logOutButton: Button? = null

    //New Addition
//    private var bootcampBtn: Button? = null

//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        val view = inflater.inflate(R.layout.fragment_web_developer_details, container, false)
//
//        logOutButton = view.findViewById<Button>(R.id.fragment_loggedin_logOut)
//       val bootcampBtn = view.findViewById<Button>(R.id.BootcampBtn)
//
//
////        logOutButton.setOnClickListener(View.OnClickListener { loggedInViewModel.logOut() })
//
////        bootcampBtn = setOnClickListener(View.OnClickListener {
////            Navigation.findNavController(
////                requireView()
////            ).navigate(R.id.action_fragment_web_developer_details_to_fragment_bootcamp)
////        })
//
//
//        bootcampBtn.setOnClickListener {
//            val intent = Intent(this, Fragment_bootcamp::class.java)
//            startActivity(intent)
//        }
//
//        return view
//    }
//override fun onCreateView(
//    inflater: LayoutInflater,
//    container: ViewGroup?,
//    savedInstanceState: Bundle?
//): View? {
//    _binding = StopScheduleFragmentBinding.inflate(inflater, container, false)
//    val view = binding.root
//    return view
//}

}