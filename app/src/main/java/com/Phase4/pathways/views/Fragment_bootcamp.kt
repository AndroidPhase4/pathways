package com.Phase4.pathways.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil.setContentView
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.RecyclerView
import com.Phase4.pathways.R
import com.Phase4.pathways.adapter.BootcampAdapter
import com.Phase4.pathways.data.Datasource


class Fragment_bootcamp : AppCompatActivity() {
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
}

//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"
//
//
//class Fragment_bootcamp : Fragment() {
//    private var param1: String? = null
//    private var param2: String? = null
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
////        setContentView(R.layout.bootcamp_list)
////
////
////        //initializing data == test location
////        val myDataset = Datasource().loadBootcamps()
////        var recylclerView = findViewById<RecyclerView>(R.id.recycler_view)
////
////        recylclerView.adapter = BootcampAdapter(this,myDataset)
////        recylclerView.setHasFixedSize(true)
//
//
//        arguments?.let {
//            param1 = it.getString(ARG_PARAM1)
//            param2 = it.getString(ARG_PARAM2)
//        }
//
//    }
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_bootcamp, container, false)
//    }
//
//    companion object {
//
//        fun newInstance(param1: String, param2: String) =
//            Fragment_bootcamp().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
//            }
//    }
//}