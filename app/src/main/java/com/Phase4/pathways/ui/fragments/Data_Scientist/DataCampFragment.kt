package com.Phase4.pathways.views.Data_Scientist

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.Phase4.pathways.databinding.DataCampFragmentBinding
import com.Phase4.pathways.model.UrlRepository


class DataCampFragment : Fragment() {
    private var _binding: DataCampFragmentBinding? = null
    private val binding get() = _binding!!

    private val webUrl: Button get() = binding.dataCampBtnUrl
    private var urlRepository = UrlRepository()
    private var url = urlRepository.dataCamp


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DataCampFragmentBinding.inflate(layoutInflater, container, false)
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
