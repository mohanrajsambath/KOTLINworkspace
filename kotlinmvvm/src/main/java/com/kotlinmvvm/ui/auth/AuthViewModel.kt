package com.kotlinmvvm.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel
import com.kotlinmvvm.data.repositories.UserRepository
import com.kotlinmvvm.utils.Coroutines


/*
 * Copyright (c) 2019. Created by Mohanraj.S,Innobot Systems on 27/9/19 for KOTLINworkspace
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
class AuthViewModel :ViewModel(){
    var email:String?=null
    var password:String?=null
    var name:String?=null
    var passwordconfirm:String?=null
    var authListener:AuthListener?=null

    fun onLoginButtonClick(view: View){
        authListener?.onStarted()
        if(email.isNullOrEmpty() || password.isNullOrEmpty()){
            authListener?.onFailure("Invalid email or password")
            return
        }
        //success
        //authListener?.onSuccess()
        //Invoke Api
        /*We should not create other class instance object, It resulting tight coupling*/
        /*Here UserRepository class is dependent to MyApi class, To avoid this will goto dependency injection*/
        /*As of now i will leave this for intial step of MVVM implementation, later it will move to dependency injection basis*/
        /*val mLoginResponse=UserRepository().userLogin(email!!,password!!)
       authListener?.onSuccess(mLoginResponse)*/

        Coroutines.main{

            val mLoginResponse = UserRepository().userLogin(email!!,password!!)
            if(mLoginResponse.isSuccessful){
                authListener?.onSuccess(mLoginResponse.body()?.user!!)
            }else{
                authListener?.onFailure("Error Code: ${mLoginResponse.code()}")
            }
        }
    }

    fun onSignupButtonClick(view:View){

    }

    fun onLogin(view:View){

    }

    fun onSignup(view:View){

    }
}