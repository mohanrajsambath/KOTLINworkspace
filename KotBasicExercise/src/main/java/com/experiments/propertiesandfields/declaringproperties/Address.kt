package com.experiments.propertiesandfields.declaringproperties


/*
 Properties in Kotlin classes can be declared either as mutable using the VAR keyword, or as read-only using the VAL keyword.
 */
class Address {
    var name:String="Holmes,Sherlock"
    var street:String="Baker"
    var city:String="London"
    var state:String?=null
    var zip:String="123456"
    var countryCode:Int?=null
    var eurotoInr:Float?=78.10f
    val gdpvalue:String?="$765 Billion"


    fun doPrint(){
        println("---=>Name:$name")
        println("---=>Street:$street")
        println("---=>City:$city")
        println("---=>State:$state")
        println("---=>Zip:$zip")
    }




}