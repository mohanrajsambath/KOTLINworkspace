package mohan.com.dikoin.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import mohan.com.dikoin.data.model.GithubUser
import mohan.com.dikoin.data.model.LoadingState
import mohan.com.dikoin.data.repository.UserRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


/*
 * Copyright (c) 2019. Created by Mohanraj.S,Innobot Systems on 29/11/19 for KOTLINworkspace
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
class UserViewModel(private val repo: UserRepository):ViewModel(),Callback<List<GithubUser>> {
    private val _loadingState = MutableLiveData<LoadingState>()
    val loadingState: LiveData<LoadingState>
        get() = _loadingState

    private val _data = MutableLiveData<List<GithubUser>>()
    val data: LiveData<List<GithubUser>>
        get() = _data


    init {
        fetchData()
    }

    private fun fetchData() {
        _loadingState.postValue(LoadingState.LOADING)
        repo.getAllUsers().enqueue(this)
    }

    override fun onFailure(call: Call<List<GithubUser>>, t: Throwable) {
        _loadingState.postValue(LoadingState.error(t.message))
    }

    override fun onResponse(call: Call<List<GithubUser>>, response: Response<List<GithubUser>>) {
        if(response.isSuccessful){
            _data.postValue(response.body())
            _loadingState.postValue(LoadingState.LOADED)
        }else{
            _loadingState.postValue(LoadingState.error(response.errorBody().toString()))
        }
    }
}