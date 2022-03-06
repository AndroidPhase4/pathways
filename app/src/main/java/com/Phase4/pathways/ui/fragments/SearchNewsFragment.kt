package com.Phase4.pathways.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.Phase4.pathways.R
import com.Phase4.pathways.ui.NewsActivity
import com.Phase4.pathways.ui.NewsViewModel

class SearchNewsFragment : Fragment(R.layout.fragment_search_news) {

    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel
    }
}