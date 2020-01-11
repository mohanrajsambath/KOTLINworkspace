package com.kotlinmvvm.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
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
@Database(
    entities = [User::class],
    version = 1
)
abstract class AppDatabase:RoomDatabase() {

    abstract fun getUserDao():UserDao

    companion object{
        @Volatile // In Kotlin @volatile helps to show this instance variable immediate visible to all thread
        private var dbInstance:AppDatabase?=null
        //Purpose of LOCk, dont allow to create two instance for Database
        private val LOCK = Any()

        //Build  the  Database using synchronized thread with LOCK
        operator fun invoke(context: Context)= dbInstance?: synchronized(LOCK){
            dbInstance?:buildDatabase(context).also {
                dbInstance=it
            }
        }

        private fun buildDatabase(context: Context)=
            Room.databaseBuilder(context.applicationContext,
                AppDatabase::class.java,
                "KotlinMVVM.db").build()
    }
}