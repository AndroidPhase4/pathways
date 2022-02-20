package com.Phase4.pathways.views

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.Phase4.pathways.R

class WebDevMainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {

            //Add Fragment
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<WebDevMainFragment>(R.id.fragment_container_view_tag)
            }
        }
    }
}