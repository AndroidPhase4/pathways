package com.Phase4.pathways.views

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.Phase4.pathways.R
import com.Phase4.pathways.viewmodel.KhanAcademyWebDevResourcesViewModel

class KhanAcademy_web_dev_resources : Fragment() {

    companion object {
        fun newInstance() = KhanAcademy_web_dev_resources()
    }

    private lateinit var viewModel: KhanAcademyWebDevResourcesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.khan_academy_web_dev_resources_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(KhanAcademyWebDevResourcesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}