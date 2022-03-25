package com.Phase4.pathways.views.Android

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.Phase4.pathways.R
import com.Phase4.pathways.viewmodel.Android.AndroidCourseraViewModel

class AndroidCourseraFragment : Fragment() {

    companion object {
        fun newInstance() = AndroidCourseraFragment()
    }

    private lateinit var viewModel: AndroidCourseraViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.android_coursera_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AndroidCourseraViewModel::class.java)
        // TODO: Use the ViewModel
    }

}