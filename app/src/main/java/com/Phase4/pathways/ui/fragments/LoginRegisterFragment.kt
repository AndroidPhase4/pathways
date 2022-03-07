package com.Phase4.pathways.ui.fragments

import android.widget.EditText
import com.Phase4.pathways.viewmodel.LoginRegisterViewModel
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.Phase4.pathways.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_news.*

class LoginRegisterFragment : Fragment() {
    private var emailEditText: EditText? = null
    private var passwordEditText: EditText? = null
    private var loginButton: Button? = null
    private var registerButton: Button? = null
    private var loginRegisterViewModel: LoginRegisterViewModel? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginRegisterViewModel = ViewModelProvider(this).get(
            LoginRegisterViewModel::class.java
        )
        loginRegisterViewModel!!.userLiveData.observe(this, { firebaseUser ->
            if (firebaseUser != null) {
                Navigation.findNavController(requireView())
                    .navigate(R.id.action_loginRegisterFragment_to_loggedInFragment)
            }
        })

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_loginregister, container, false)
        emailEditText = view.findViewById(R.id.fragment_loginregister_email)
        passwordEditText = view.findViewById(R.id.fragment_loginregister_password)
        loginButton = view.findViewById(R.id.fragment_loginregister_login)
        registerButton = view.findViewById(R.id.fragment_loginregister_register)


        loginButton?.setOnClickListener(View.OnClickListener {
            val email = emailEditText?.getText().toString()
            val password = passwordEditText?.getText().toString()
            if (email.length > 0 && password.length > 0) {
                loginRegisterViewModel!!.login(email, password)
            } else {
                Toast.makeText(
                    context,
                    "Email Address and Password Must Be Entered",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })
        registerButton?.setOnClickListener(View.OnClickListener {
            val email = emailEditText?.getText().toString()
            val password = passwordEditText?.getText().toString()
            if (email.length > 0 && password.length > 0) {
                loginRegisterViewModel!!.register(email, password)
            } else {
                Toast.makeText(
                    context,
                    "Email Address and Password Must Be Entered",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })
        return view
    }
}