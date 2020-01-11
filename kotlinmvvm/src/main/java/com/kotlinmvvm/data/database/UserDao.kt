package com.kotlinmvvm.data.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.kotlinmvvm.data.database.entities.CURRENT_USER_ID
import com.kotlinmvvm.data.database.entities.User


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
@Dao
 interface UserDao{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsert(user:User):Long
    @Query("SELECT * FROM user WHERE uid = $CURRENT_USER_ID")
    fun getUser():LiveData<User>

}