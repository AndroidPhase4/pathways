package com.Phase4.pathways.views.WebDev

import android.content.Intent
import android.net.Uri
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.Phase4.pathways.R
import com.Phase4.pathways.databinding.UdacityWebDevResFragmentBinding
import com.Phase4.pathways.model.UrlRepository
import com.Phase4.pathways.viewmodel.UdacityWebDevResViewModel

class Udacity_Web_Dev_Res : Fragment() {
    private var _binding: UdacityWebDevResFragmentBinding? = null
    private val binding get() = _binding!!

    private val webUrl: Button get() = binding.udacityWebDevBtn
    private var urlRepository = UrlRepository()
    private var url = urlRepository.udacity


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = UdacityWebDevResFragmentBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        webUrl.setOnClickListener { launchWebsite() }
    }

    private fun launchWebsite() {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}


