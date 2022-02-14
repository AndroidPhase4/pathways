package com.Phase4.pathways.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import androidx.recyclerview.widget.RecyclerView
import com.Phase4.pathways.R
import com.Phase4.pathways.adapter.BootcampAdapter
import com.Phase4.pathways.data.Datasource

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.activity_main_navHostFragment) as NavHostFragment
        navController = navHostFragment.navController

//        setupActionBarWithNavController(navController)
        //initializing data == test location
        val myDataset = Datasource().loadBootcamps()
        var recylclerView = findViewById<RecyclerView>(R.id.recycler_view)

        recylclerView.adapter = BootcampAdapter(this,myDataset)
        recylclerView.setHasFixedSize(true)
    }

    //New Addition
//    override fun onSupportNavigationUp(): Boolean {
//        return navController.navigateUp() || super.onSupportNavigateUp()
//    }
}

