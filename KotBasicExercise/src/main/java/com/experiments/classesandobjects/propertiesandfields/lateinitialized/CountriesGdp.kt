package com.experiments.classesandobjects.propertiesandfields.lateinitialized


/*
 * Copyright (c) 2019. Created by Mohanraj.S,Innobot Systems on 26/9/19 for KOTLINworkspace
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
class CountriesGdp {


    var countryName:String=""
    var gdp:String=""
    var currency:String=""


    constructor (mCountryName:String,mCurrency:String,mGDP:String){
        countryName=mCountryName
        currency=mCurrency
        gdp=mGDP
        println("<=--- *** ---=>")
        println("Country Name---=>${countryName}")
        println("Currency---=>${currency}")
        println("GDP ---=>${gdp}")
        println("<=--- ## ---=>")
    }


    /*init {
        println("Country Name---=>${countryName},Currency---=>${currency},GDP ---=>${gdp}")
    }*/
}