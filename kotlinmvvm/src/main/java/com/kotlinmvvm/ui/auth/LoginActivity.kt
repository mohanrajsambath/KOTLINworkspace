package com.kotlinmvvm.ui.auth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.kotlinmvvm.R
import com.kotlinmvvm.data.database.entities.User
import com.kotlinmvvm.databinding.ActivityLoginBinding
import com.kotlinmvvm.utils.hide
import com.kotlinmvvm.utils.show
import com.kotlinmvvm.utils.toast
import kotlinx.android.synthetic.main.activity_login.*

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
        //toast("Login Started")
        progress_bar.show()
    }

    override fun onSuccess(user: User) {
        toast("${user.name} is Logged In")
    }

    override fun onFailure(message: String) {
        progress_bar.hide()
        toast(message)
    }
}
