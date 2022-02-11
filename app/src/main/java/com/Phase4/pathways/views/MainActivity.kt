package com.Phase4.pathways.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import com.Phase4.pathways.R

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.activity_main_navHostFragment) as NavHostFragment
        navController = navHostFragment.navController

//        setupActionBarWithNavController(navController)
    }

    //New Addition in Kotlin
//    override fun onSupportNavigationUp(): Boolean {
//        return navController.navigateUp() || super.onSupportNavigateUp()
//    }
}

