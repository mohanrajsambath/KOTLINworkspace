package com.experiments.propertiesandfields.getterandsetters


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
class MyGetterSetter {
    private val c: Int=0
    //var allByDefault: Int? // error: explicit initializer required, default getter and setter implied
    var initialized = 1 // has type Int, default getter and setter

    /*read-only property declaration*/
    //val simple: Int? // has type Int, default getter, must be initialized in constructor
    val inferredType = 1 // has type Int and a default getter

    /*We can define custom accessors for a property.
    If we define a custom getter, it will be called every time
     we access the property (this allows us to implement a computed property).
    Here's an example of a custom getter*/

    /*val isEmpty: Boolean
        get() = this.size == 0*/

    /*If we define a custom setter, it will be called every time we assign a value to the property.
     A custom setter looks like this:*/
    /*var stringRepresentation: String
        get() = this.toString()
        set(value) {
            setDataFromString(value) // parses the string and assigns values to other properties
        }*/

    var intRep:Int=10
        get() = field
        set(value) {
            field = value
        }

    init {
        println("---=>Value of C is $c")
        println("---=>Value of C is $intRep")
        val mCom=Company()
        mCom.employeename="Mohanraj"
        mCom.age=25
        mCom.department="Production"
        mCom.phone= 9655551959

        println("---=>Employee Name-${mCom.employeename}," +
                "Department-${mCom.department}, Phone-${mCom.phone}")
    }





}