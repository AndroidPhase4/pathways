package com.Phase4.pathways.views.Android

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.Phase4.pathways.R
import com.Phase4.pathways.viewmodel.Android.AndroidUdacityViewModel

class AndroidUdacityFragment : Fragment() {

    companion object {
        fun newInstance() = AndroidUdacityFragment()
    }

    private lateinit var viewModel: AndroidUdacityViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.android_udacity_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AndroidUdacityViewModel::class.java)
        // TODO: Use the ViewModel
    }

}