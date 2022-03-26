package com.Phase4.pathways.views.WebDev

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.Phase4.pathways.databinding.KhanAcademyWebDevResourcesFragmentBinding
import com.Phase4.pathways.model.UrlRepository


class KhanAcademy_web_dev_resources : Fragment() {

    private var _binding: KhanAcademyWebDevResourcesFragmentBinding? = null
    private val binding get() = _binding!!

    private val webUrl: Button get() = binding.khanAcademyButton
    private var urlRepository = UrlRepository()
    private var url = urlRepository.khanAcademy

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = KhanAcademyWebDevResourcesFragmentBinding.inflate(layoutInflater, container, false)
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


//Connect Button to go to web url



//Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
//startActivity(browserIntent);

//private fun NavController.navigate(url: String) {
//    val intent = Intent(Intent.ACTION_WEB_SEARCH).apply {
//        putExtra(SearchManager.QUERY, url)
//    }
//    this.context.startActivity(intent);
//
//}


//
//    companion object {
//        fun newInstance() = KhanAcademy_web_dev_resources()
//    }
//
//    private lateinit var viewModel: KhanAcademyWebDevResourcesViewModel
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        return inflater.inflate(R.layout.khan_academy_web_dev_resources_fragment, container, false)
//    }
//
//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//        viewModel = ViewModelProvider(this).get(KhanAcademyWebDevResourcesViewModel::class.java)
//    }
//
//}