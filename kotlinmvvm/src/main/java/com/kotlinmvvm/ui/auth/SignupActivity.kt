package com.kotlinmvvm.ui.auth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModelProviders
import com.kotlinmvvm.R
import com.kotlinmvvm.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity(),AuthListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //set which layout gonna bind
        val mBindSignupBinding:ActivitySignupBinding = DataBindingUtil.setContentView(this,R.layout.activity_signup)

        //configure which ViewModel provides data to this activity
        val mViewModel =ViewModelProviders.of(this).get(AuthViewModel::class.java)

        //Assin viewmodel object to activity
        mBindSignupBinding.viewmodelSignup=mViewModel

        //configure the interface
        mViewModel.authListener=this

    }


    override fun onStarted() {
    }

    override fun onSuccess(mLoginResponse: LiveData<String>) {
    }

    override fun onFailure(message: String) {
    }
}
