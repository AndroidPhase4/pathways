package com.Phase4.pathways.views

import android.widget.TextView
import com.Phase4.pathways.viewmodel.LoggedInViewModel
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.google.firebase.auth.FirebaseUser
import android.widget.Toast
import com.Phase4.pathways.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

//import androidx.lifecycle.ViewModelProviders;
class LoggedInFragment : Fragment() {
    private var loggedInUserTextView: TextView? = null
    private var logOutButton: Button? = null

    //New Addition
    private var webDeveloperBtn: Button? = null
    private var androidDeveloperBtn: Button? = null
    private var dataScientistBtn: Button? = null
    private var cyberSecurityBtn: Button? = null
    private var loggedInViewModel: LoggedInViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loggedInViewModel = ViewModelProvider(this).get(LoggedInViewModel::class.java)
        loggedInViewModel!!.userLiveData.observe(
            this,
            { firebaseUser -> // if fireBase user detected display message
                if (firebaseUser != null) {
                    loggedInUserTextView!!.text = "Logged In User: " + firebaseUser.email
                    logOutButton!!.isEnabled = true
                } else {
                    logOutButton!!.isEnabled = false
                }
            })
        loggedInViewModel!!.loggedOutLiveData.observe(this, { loggedOut ->
            if (loggedOut) {
                Toast.makeText(context, "User Logged Out", Toast.LENGTH_SHORT).show()
                Navigation.findNavController(requireView())
                    .navigate(R.id.action_loggedInFragment_to_loginRegisterFragment)
            }
        })
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_loggedin, container, false)
        loggedInUserTextView = view.findViewById(R.id.fragment_loggedin_loggedInUser)
        logOutButton = view.findViewById(R.id.fragment_loggedin_logOut)

        webDeveloperBtn = view.findViewById(R.id.WebDeveloperBtn)
        androidDeveloperBtn = view.findViewById(R.id.AndroidDeveloperBtn)
        dataScientistBtn = view.findViewById(R.id.DataScientistBtn)
        cyberSecurityBtn = view.findViewById(R.id.CyberSecurityBtn)

        logOutButton?.setOnClickListener(View.OnClickListener { loggedInViewModel!!.logOut() })

        webDeveloperBtn?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_loggedInFragment_to_fragment_web_developer_details)
        })
        androidDeveloperBtn?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_loggedInFragment_to_fragment_android_developer_details)
        })
        dataScientistBtn?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_loggedInFragment_to_fragment_data_scientist_details)
        })
        cyberSecurityBtn?.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(
                requireView()
            ).navigate(R.id.action_loggedInFragment_to_fragment_cyber_security_details)
        })

        return view
    }
}