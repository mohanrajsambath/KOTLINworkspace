package com.kotlinmvvm.utils

import android.content.Context
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast


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
fun Context.toast(message:String){
    Toast.makeText(this,message,Toast.LENGTH_LONG).show()
}

fun ProgressBar.show(){
    visibility=View.VISIBLE
}

fun ProgressBar.hide(){
    visibility=View.GONE
}