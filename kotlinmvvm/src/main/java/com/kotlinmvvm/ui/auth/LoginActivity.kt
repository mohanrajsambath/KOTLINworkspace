package com.kotlinmvvm.ui.auth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.kotlinmvvm.R
import com.kotlinmvvm.databinding.ActivityLoginBinding
import com.kotlinmvvm.utils.toast

class LoginActivity : AppCompatActivity(),AuthListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_login)
        val bindUiLayout:ActivityLoginBinding =DataBindingUtil.setContentView(this,R.layout.activity_login)
        val mViewModel=ViewModelProviders.of(this).get(AuthViewModel::class.java)
        bindUiLayout.viewmodel=mViewModel
        mViewModel.authListener=this

    }

    override fun onStarted() {
        toast("Login Started")
    }

    override fun onSuccess() {
        toast("Login Success")
    }

    override fun onFailure(message: String) {
        toast(message)
    }
}
