package com.Phase4.pathways.views.Android

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.Phase4.pathways.databinding.AndroidDeveloperGoogleFragmentBinding
import com.Phase4.pathways.model.UrlRepository

class AndroidDeveloperGoogleFragment : Fragment() {

    private var _binding: AndroidDeveloperGoogleFragmentBinding? = null
    private val binding get() = _binding!!

    private val webUrl: Button get() = binding.androidDevGoogleBtn
    private var urlRepository = UrlRepository()
    private var url = urlRepository.androidDeveloperGoogle


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = AndroidDeveloperGoogleFragmentBinding.inflate(layoutInflater, container, false)
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