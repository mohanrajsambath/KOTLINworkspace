package mohan.com.dikoin.data.singleton

import android.app.Application
import mohan.com.dikoin.data.di.apiModule
import mohan.com.dikoin.data.di.repositoryModule
import mohan.com.dikoin.data.di.retrofitModule
import mohan.com.dikoin.data.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin


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
class App: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            //androidLogger(Level.DEBUG)
            androidContext(this@App)
            modules(listOf(repositoryModule, viewModelModule, retrofitModule, apiModule))
        }
    }


}