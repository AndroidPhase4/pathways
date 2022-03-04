package com.Phase4.pathways.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.view.isVisible
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.Phase4.pathways.*
import com.Phase4.pathways.databinding.ActivityMainBinding
import com.Phase4.pathways.databinding.RecyclerviewTechnewsBinding
import com.Phase4.pathways.model.BootcampAdapter
import retrofit2.HttpException
import java.io.IOException


const val TAG = "MainActivity"

//class MainActivity : AppCompatActivity() {
//
//    private lateinit var navController: NavController
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        val navHostFragment = supportFragmentManager
//            .findFragmentById(R.id.activity_main_navHostFragment) as NavHostFragment
//        navController = navHostFragment.navController
//
//    }
//}

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    lateinit var viewModel: TechNewsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val techNewsRepository = TechNewsRepository()
        val viewModelProviderFactory = TechNewsViewModelProviderFactory(techNewsRepository)
        viewModel = ViewModelProvider(this, viewModelProviderFactory).get(TechNewsViewModel::class.java)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.activity_main_navHostFragment) as NavHostFragment
        navController = navHostFragment.navController

    }
}