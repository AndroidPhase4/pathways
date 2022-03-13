//package com.Phase4.pathways.views
//
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.fragment.app.Fragment
//import java.util.Observer
//
//
///*
// *      MainFragment
// *      - shows the UI
// *      - listens to viewModel for updates on UI
// */
//
//class WebDevMainFragment: Fragment() {
//
//    // View Binding
//    private var _binding: FragmentMainBinding? = null
//    private val binding get() = _binding!!
//
//    //Create a viewModel
//    private val viewModel: by MainViewModel activityViewModels()
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        _binding = FragmentMainBinding.inflate(inflater, container, false)
//        val view = binding.root
//        return view
//    }
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        setupClickListeners()
//        fragmentTextUpdateObserver()
//    }
//
//    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding = null
//    }
//
//    // Setup the button in our fragment to call getUpdatedText method in viewModel
//    private fun setupClickListeners() {
//        binding.fragmentButton.setOnClickListener { viewModel.getUpdatedText() }
//    }
//
//    // Observer is waiting for viewModel to update our UI
//    private fun fragmentTextUpdateObserver() {
//        viewModel.uiTextLiveData.observe(viewLifecycleOwner, Observer { updateText ->
//            binding.fragmentTextView.text = updatedText
//        })
//    }
//}