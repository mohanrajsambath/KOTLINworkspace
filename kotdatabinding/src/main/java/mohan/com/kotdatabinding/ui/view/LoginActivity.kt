package mohan.com.kotdatabinding.ui.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import mohan.com.kotdatabinding.R
import mohan.com.kotdatabinding.databinding.ActivityLoginBinding
import mohan.com.kotdatabinding.ui.viewinterface.AuthListener
import mohan.com.kotdatabinding.ui.viewmodel.AuthenticationViewModel
import mohan.com.kotdatabinding.utils.toast

class LoginActivity : AppCompatActivity(),AuthListener {
    override fun onGetSuccess() {
       toast("Login Success")
    }

    override fun onGetFail(message: String) {
       toast(message)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_login)
        val bindLoginLayout:ActivityLoginBinding=DataBindingUtil.setContentView(this,R.layout.activity_login)
        val mLoginViewModel=ViewModelProviders.of(this).get(AuthenticationViewModel::class.java)
        bindLoginLayout.loginViewModel=mLoginViewModel
        mLoginViewModel.mAuthListener=this
    }
}
