package com.Phase4.pathways

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch


class TechNewsFragment : Fragment() {

    private lateinit var viewModel: TechNewsViewModel

    private lateinit var adapter: HitAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.recyclerview_technews, container, false)

        initRecyclerView(view)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Since tech news are only needed in the TechNewsFragment
        // the VM should only be bound to this fragment and not the whole activity.
        // dependency injection??

        val techNewsRepository = TechNewsRepository()
        val viewModelProviderFactory = TechNewsViewModelProviderFactory(techNewsRepository)
        viewModel = ViewModelProvider(this, viewModelProviderFactory)[TechNewsViewModel::class.java]

        // Here, we observe all changes from the tech news state of the VM.
        // Whenever you change the value of the StateFlow there, this collectLatest
        // function will trigger and notify the fragment with the latest news.
        // We simply take that latest news list and submit it to the RecyclerView.
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.techNews.collectLatest { news ->
                    adapter.hits = news
                }
            }
        }
    }

    private fun initRecyclerView(view: View) {
        val recyclerView = view.findViewById<RecyclerView>(R.id.rvTechnews)

        adapter = HitAdapter()
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(activity)
    }

}