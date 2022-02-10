package com.Phase4.pathways.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.Phase4.pathways.R
import com.Phase4.pathways.adapter.BootcampAdapter
import com.Phase4.pathways.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //initializing data
        val myDataset = Datasource().loadBootcamps()
        var recylclerView = findViewById<RecyclerView>(R.id.recycler_view)

        recylclerView.adapter = BootcampAdapter(this,myDataset)
        recylclerView.setHasFixedSize(true)
    }
}

