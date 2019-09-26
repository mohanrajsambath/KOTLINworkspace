package com.experiments.propertiesandfields

import com.experiments.propertiesandfields.declaringproperties.Address
import com.experiments.propertiesandfields.getterandsetters.MyGetterSetter
import com.experiments.propertiesandfields.lateinitialized.CountriesGdp


/*
 * Copyright (c) 2019. Created by Mohanraj.S,Innobot Systems on 25/9/19 for KOTLINworkspace
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
class FieldsAndProperties {
    //for LateInit
    lateinit var mCountriesGdp: CountriesGdp
    init {
        println("<=---Declaring Properties---=>")
        Address().doPrint()
        println("<=---        ###       ---=>")

        println("<=---Use a property, Simply Refer to it by Name---=>")
        val mCopyAddress=copyAddress(Address())

        println("Copy Name---=>${mCopyAddress.name}")
        println("Copy Street---=>${mCopyAddress.street}")
        println("Copy City---=>${mCopyAddress.city}")
        println("Copy State---=>${mCopyAddress.state}")
        println("Copy Zip---=>${mCopyAddress.zip}")
        println("Copy CountryCode---=>${mCopyAddress.countryCode}")
        println("Copy Currency in INR---=>${mCopyAddress.eurotoInr}")
        println("Copy GDP---=>${mCopyAddress.gdpvalue}")
        println("<=---        ###       ---=>")


        println("<=---Getter and Setter---=>")
        MyGetterSetter()
        println("<=---        ###       ---=>")

        println("<=---Late Init---=>")
        lateInitzCountry()
        println("<=---        ###       ---=>")

    }


    /*To use a property, simply refer to it by name:*/
    fun copyAddress(address: Address):Address{
        val result=Address()// there's no new keyword in Kotlin
        result.name=address.name
        result.street=address.street
        result.city=address.city
        result.state=address.state
        result.zip=address.zip
        result.countryCode=address.countryCode
        result.eurotoInr=address.eurotoInr
        return result
    }


    fun lateInitzCountry(){
        //mCountriesGdp = CountriesGdp()
        mCountriesGdp = CountriesGdp("United Stated","Dollar","$21,410,230")
        mCountriesGdp = CountriesGdp("China","Yuan","$15,543,710")
        mCountriesGdp = CountriesGdp("Japan","Yen","$5,362,220")
        mCountriesGdp = CountriesGdp("Germany","Euro","$4,416,800")
        mCountriesGdp = CountriesGdp("India","Rupee","$3,155,230")
        mCountriesGdp = CountriesGdp("France","Franc","$3,060,070")
        mCountriesGdp = CountriesGdp("United Kingdom","Pound sterling","$3,022,580")
        mCountriesGdp = CountriesGdp("Italy","Euro","$2,261,460")
        mCountriesGdp = CountriesGdp("Brazil","Brazilian real","$2,256,850")
        mCountriesGdp = CountriesGdp("Canada","Canadian dollar","$1,908,530")
    }




}