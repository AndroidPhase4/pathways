package com.Phase4.pathways.views

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.Phase4.pathways.R
import com.Phase4.pathways.viewmodel.UdacityWebDevResViewModel

class Udacity_Web_Dev_Res : Fragment() {

    companion object {
        fun newInstance() = Udacity_Web_Dev_Res()
    }

    private lateinit var viewModel: UdacityWebDevResViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.udacity__web__dev__res_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(UdacityWebDevResViewModel::class.java)
        // TODO: Use the ViewModel
    }

}