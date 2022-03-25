package com.Phase4.pathways.views.WebDev

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.Phase4.pathways.R
import com.Phase4.pathways.viewmodel.CodeCademyWebDevResViewModel

class codeCademy_web_dev_res : Fragment() {

    companion object {
        fun newInstance() = codeCademy_web_dev_res()
    }

    private lateinit var viewModel: CodeCademyWebDevResViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.code_cademy_web_dev_res_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CodeCademyWebDevResViewModel::class.java)
        // TODO: Use the ViewModel
    }

}