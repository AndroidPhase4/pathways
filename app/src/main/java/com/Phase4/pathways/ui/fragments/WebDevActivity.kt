package com.Phase4.pathways.views

import android.app.SearchManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.Phase4.pathways.R
import com.Phase4.pathways.data.UrlRepository

class WebDevActivity : AppCompatActivity() {

//Web dev resource button id is : ResourcesBtn
private val urlRepository = UrlRepository()

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
////Go to the Udacity Detail Page when button is clicked
//        val url = urlRepository.udacity
//        findViewById<Button>(R.id.btnLaunchBrowser).setOnClickListener {
//            // launchWebBrowser(url)
//            goToSecondActivity()
//        }
//        //Go to the Khan Academy Detail Page when button is clicked
//        findViewById<Button>(R.id.resourceBtn3).setOnClickListener {
//            goToKhanAcademy()
//        }
//
//        //Go to the Codecademy detail Page when button is clicked
//        findViewById<Button>(R.id.resourceBtn2).setOnClickListener {
//            goToCodecademy()
//        }
//    }
//    //LAUNCH
//    //Only
////Launch Udacity
//    private fun launchSecondActivity(url: String) {
//        val intent = Intent(Intent.ACTION_WEB_SEARCH).apply {
//            putExtra(SearchManager.QUERY, url)
//        }
//        startActivity(intent)
//    }
//    //    Launch Khan Academy
//    private fun launchKhanAcademy(url: String) {
//        val intent = Intent(Intent.ACTION_WEB_SEARCH).apply {
//            putExtra(SearchManager.QUERY, url)
//        }
//        startActivity(intent)
//    }
//
//    //    Launch Codecademy
//    private fun launchCodecademy(url: String) {
//        val intent = Intent(Intent.ACTION_WEB_SEARCH).apply {
//            putExtra(SearchManager.QUERY, url)
//        }
//        startActivity(intent)
//    }
//
//
//    //Go to Udacity Screen
//    private fun goToSecondActivity() {
//        val intent = Intent(this, SecondActivity::class.java)
//        startActivity(intent)
//    }
//    //Go to Khan Academy Screen
//    private fun goToKhanAcademy() {
//        val intent = Intent(this, KhanAcademyActivity::class.java)
//        startActivity(intent)
//    }
//    //Go to Codecademy Screen
//    private fun goToCodecademy() {
//        val intent = Intent(this, codecademyActivity::class.java)
//        startActivity(intent)
//    }
}
