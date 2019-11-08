package com.kotlinmvvm.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey


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

/*"id": 1,
"name": "Belal Khan",
"email": "probelalkhan@gmail.com",
"email_verified_at": null,
"created_at": "2019-06-05 05:13:11",
"updated_at": "2019-06-05 05:13:11"*/

const val CURRENT_USER_ID=0
@Entity
data class User (var id:Int?=null,
                         var name:String?=null,
                         var email:String?=null,
                         var email_verified_at:String?=null,
                         var created_at:String?=null,
                         var updated_at:String?=null){
    @PrimaryKey(autoGenerate = false)
    var uid:Int=CURRENT_USER_ID
}