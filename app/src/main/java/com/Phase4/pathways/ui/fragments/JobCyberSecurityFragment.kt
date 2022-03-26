package com.Phase4.pathways.ui.fragments

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
import com.Phase4.pathways.data.JobUrls
import com.Phase4.pathways.databinding.JobCyberSecurityFragmentBinding
import com.Phase4.pathways.databinding.JobDataScienceFragmentBinding
import com.Phase4.pathways.viewmodel.JobCyberSecurityViewModel

class JobCyberSecurityFragment : Fragment() {

    private var _binding: JobCyberSecurityFragmentBinding? = null
    private val binding get() = _binding!!

    private val webUrl: Button get() = binding.cyberSecurityJobsBtn
    private var urlRepository = JobUrls()
    private var url = urlRepository.cyberJobUrl


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = JobCyberSecurityFragmentBinding.inflate(layoutInflater, container, false)
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
