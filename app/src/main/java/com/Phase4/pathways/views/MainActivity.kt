package com.Phase4.pathways.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.Phase4.pathways.R
import com.Phase4.pathways.model.Bootcamp
import com.Phase4.pathways.model.BootcampAdapter
import kotlinx.android.synthetic.main.recyclerview_bootcamps.rvBootcamps


class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var bootcampAdapter: BootcampAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.activity_main_navHostFragment) as NavHostFragment
        navController = navHostFragment.navController

      }

}