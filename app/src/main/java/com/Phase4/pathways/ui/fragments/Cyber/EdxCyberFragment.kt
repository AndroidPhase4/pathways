package com.Phase4.pathways.views.Cyber

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
import com.Phase4.pathways.databinding.EdxCyberFragmentBinding
import com.Phase4.pathways.databinding.KhanAcademyWebDevResourcesFragmentBinding
import com.Phase4.pathways.model.UrlRepository
import com.Phase4.pathways.viewmodel.Cyber.EdxCyberViewModel

class EdxCyberFragment : Fragment() {


    private var _binding: EdxCyberFragmentBinding? = null
    private val binding get() = _binding!!

    private val webUrl: Button get() = binding.edXCyberBtnWebUrl
    private var urlRepository = UrlRepository()
    private var url = urlRepository.edx

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = EdxCyberFragmentBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        webUrl.setOnClickListener { launchWebsite() }
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }

    private fun launchWebsite() {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }

}