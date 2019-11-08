package com.kotlinmvvm.data.repositories

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.kotlinmvvm.data.network.MyApi
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


/*
 * Copyright (c) 2019. Created by Mohanraj.S,Innobot Systems on 8/11/19 for KOTLINworkspace
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
class UserRepository {
    fun userLogin(email:String,password:String):LiveData<String>{
        val mLoginResponseLiveData = MutableLiveData<String>()

        /*We should not create other class instance object, It resulting tight coupling*/
        /*Here UserRepository class is dependent to MyApi class, To avoid this will goto dependency injection*/
        /*As of now i will leave this for intial step of MVVM implementation, later it will move to dependency injection basis*/
        MyApi().userLogin(email,password).enqueue(object: Callback<ResponseBody>{
            override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                mLoginResponseLiveData.value=t.message
            }

            override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
                if(response.isSuccessful){
                    mLoginResponseLiveData.value=response.body()?.string()
                }else{
                    mLoginResponseLiveData.value=response.errorBody()?.string()
                }
            }
        })
        return mLoginResponseLiveData
       }
    }
