package mohan.com.mykotlinexperiments.basictypes

import mohan.com.mykotlinexperiments.activity.MainActivity
import mohan.com.mykotlinexperiments.basictypes.constants.LiteralConstants
import mohan.com.mykotlinexperiments.basictypes.explicitconversion.ExplicitConversion
import mohan.com.mykotlinexperiments.basictypes.representation.Representation


/*
 * Copyright (c) 2019. Created by Mohanraj.S,Innobot Systems on 11/2/19 for KOTLINworkspace
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
class BasicDataTypes{
    var mAppName :String  = MainActivity().mAppName;
    //var mAppName :String  = "\tMy-Exp-1:"
    var mRefernceLink :String = "https://www.tutorialspoint.com/kotlin/kotlin_basic_types.htm"

    /*Number DataTypes*/
    val intVal: Int = 10000
    val doubleVal: Double = 100.00
    val floatVal: Float = 100.00f
    val longVal: Long = 1000000004
    val shortVal: Short = 10
    val byteVal: Byte = 1

    /*Character DataType*/
    //val letter: Char   // defining a variable
    //letter = 'A'        // Assigning a value to it
    val charVal: Char='A'


    /*Boolean DataType*/
    //val letter: Boolean   // defining a variable
    //letter = true         // Assinging a value to it
    val boolVal: Boolean= true

    /*String DataType*/
    var rawString :String  = "I am Raw String!"
    val escapedString : String  = "I am escaped String!\t!@#$%"


    fun DataTypeFunctions(){
        showLoop1()
        println("<=------------BasicDataTypes------------=>")
        println("<=------------Numbers---------------=>")
        showNumberTypes()
        println("<=------------Character-------------=>")
        showCharTypes()
        println("<=------------Boolean-------------=>")
        showBooleanTypes()
        println("<=------------String-------------=>")
        showStringTypes()
        //Literal Constants
        LiteralConstants().showLiteralConstants()
        //Representation
        Representation().showRepresentationTripleEQUALS()
        Representation().showRepresentationDoubleEQUALS()
        //ExplicitConversion
        ExplicitConversion().showExplicitConversionMethod()
        println("<=------------**********------------=>")
    }



    fun showLoop1(){
        println("\nHello World this is Test Program\n")
    }

    fun showNumberTypes(){
        println(mAppName+" Int Value is="+intVal)
        println(mAppName+" Double  Value is="+doubleVal)
        println(mAppName+" Float Value is="+floatVal)
        println(mAppName+" Long Value is="+longVal)
        println(mAppName+" Short Value is="+shortVal)
        println(mAppName+" Byte Value is="+byteVal)
    }
    fun showCharTypes(){
        println(mAppName+" Char Value is="+charVal)
    }


    fun showBooleanTypes(){
        println(mAppName+"Boolean value is="+"$boolVal")
    }

    fun showStringTypes(){
        println(mAppName+"Raw String value is="+rawString)
        println(mAppName+"Escaped String value is="+escapedString)
    }

}