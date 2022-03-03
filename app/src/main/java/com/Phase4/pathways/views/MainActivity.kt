package com.Phase4.pathways.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.Phase4.pathways.HitAdapter
import com.Phase4.pathways.R
import com.Phase4.pathways.RetrofitInstance
import com.Phase4.pathways.databinding.ActivityMainBinding
import com.Phase4.pathways.databinding.RecyclerviewTechnewsBinding
import com.Phase4.pathways.model.BootcampAdapter
import retrofit2.HttpException
import java.io.IOException


const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

//    // New Addition
//    private lateinit var binding: RecyclerviewTechnewsBinding
//    private lateinit var HitAdapter: HitAdapter
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = RecyclerviewTechnewsBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        setupRecyclerView()
//
//        lifecycleScope.launchWhenCreated {
//            binding.progressBar.isVisible = true
//            val response = try {
//                RetrofitInstance.api.getHits()
//            } catch(e: IOException) {
//               Log.e(TAG,"IOException, you might not have internet connection")
//                binding.progressBar.isVisible = false
//                return@LaunchWhenCreated
//            } catch(e: HttpException) {
//                Log.e(TAG,"HttpException, unexpected response")
//                binding.progressBar.isVisible = false
//                return@LaunchWhenCreated
//            }
//            if(response.isSuccessful && response.body() != null) {
//                hitAdapter.hits = response.body()!!
//            } else {
//                Log.e(TAG,"Response not successful")
//            }
//            binding.progressBar.isVisible = false
//        }
//
//        val navHostFragment = supportFragmentManager
//            .findFragmentById(R.id.activity_main_navHostFragment) as NavHostFragment
//        navController = navHostFragment.navController
//    }
//
//    private fun setupRecyclerView() = binding.rvTechnews.apply {
//        hitAdapter = HitAdapter()
//        adapter = hitAdapter
//        layoutManager = LinearLayoutManager(this@MainActivity)
//    }
//}

// WORKS
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.activity_main_navHostFragment) as NavHostFragment
        navController = navHostFragment.navController

    }
}