package mohan.com.mykotlinexperiments.basictypes.explicitconversion

import mohan.com.mykotlinexperiments.activity.MainActivity


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
class ExplicitConversion{

    /*Explicit Conversions
    Due to different representations, smaller types are not subtypes of bigger ones. If they were, we would have troubles of the following sort*/
    var mAppName :String  = MainActivity().mAppName;
    val mByte: Byte = 10
    val mHexa= 0xFF_EC//0xFF_EC_DE_5E
    val mInt: Int =50;
    val mShort: Short=40;
    val mLong: Long=10000000000L
    val mFloat: Float= 20.0f
    val mDouble: Double= 53000.505


    /*fun showExplicitErrorMethod1(){
        // Hypothetical code, does not actually compile:
        val a: Int? = 1 // A boxed Int (java.lang.Integer)
        val b: Long? = a // implicit conversion yields a boxed Long (java.lang.Long)
        print(b == a) // Surprise! This prints "false" as Long's equals() checks whether the other is Long as well
    }*/

    /*So equality would have been lost silently all over the place, not to mention identity.
    As a consequence, smaller types are NOT implicitly converted to bigger types.
    This means that we cannot assign a value of type Byte to an Int variable without an explicit conversion*/

    /*fun showExplicitErroeMethod2(){
        val b: Byte = 1 // OK, literals are checked statically
        val i: Int = b // ERROR
    }*/

    /*We can use explicit conversions to widen numbers*/
    fun showExplicitConversionMethod() {
        val b: Byte = 1
        val i: Int = b.toInt() // OK: explicitly widened
        //print(i)
        println("<=------------ExplicitConversions------------=>")
        println(mAppName+" ExplicitConversion of Byte value of 'b' into Int 'i' val is="+i)
        showExplictByteConversion()
        showExplictIntConversion()
    }

    fun showExplictByteConversion(){
        println("<=------------ExplicitConversions into Bytes------------=>")
        val mIntToByte =mInt.toByte()
        val mShortToByte =mShort.toByte()
        val mLongToByte =mLong.toByte()
        val mFloatToByte =mFloat.toByte()
        val mDoubleToByte =mDouble.toByte()

        println(mAppName+" ExplicitConversion of Int ($mInt) to Byte val is="+mIntToByte)
        println(mAppName+" ExplicitConversion of Short ($mShort) to Byte val is="+mShortToByte)
        println(mAppName+" ExplicitConversion of Long ($mLong) to Byte val is="+mLongToByte)
        println(mAppName+" ExplicitConversion of Float ($mFloat) to Byte val is="+mFloatToByte)
        println(mAppName+" ExplicitConversion of Double ($mDouble) to Byte val is="+mDoubleToByte)
    }

    fun showExplictIntConversion(){
        println("<=------------ExplicitConversions into Int------------=>")
        val mHexaToInt =mHexa.toInt()
        val mShortToInt =mShort.toInt()
        val mLongToInt =mLong.toInt()
        val mFloatToInt =mFloat.toInt()
        val mDoubleToInt =mDouble.toInt()

        println(mAppName+" ExplicitConversion of HexaDec ($mHexa) to Int val is="+mHexaToInt)
        println(mAppName+" ExplicitConversion of Short ($mShort) to Int val is="+mShortToInt)
        println(mAppName+" ExplicitConversion of Long ($mLong) to Int val is="+mLongToInt)
        println(mAppName+" ExplicitConversion of Float ($mFloat) to Int val is="+mFloatToInt)
        println(mAppName+" ExplicitConversion of Double ($mDouble) to Int val is="+mDoubleToInt)
    }

    fun showExplictShortConversion(){
        println("<=------------ExplicitConversions into Int------------=>")
        val mHexaToInt =mHexa.toInt()
        val mShortToInt =mShort.toInt()
        val mLongToInt =mLong.toInt()
        val mFloatToInt =mFloat.toInt()
        val mDoubleToInt =mDouble.toInt()

        println(mAppName+" ExplicitConversion of HexaDec ($mHexa) to Int val is="+mHexaToInt)
        println(mAppName+" ExplicitConversion of Short ($mShort) to Int val is="+mShortToInt)
        println(mAppName+" ExplicitConversion of Long ($mLong) to Int val is="+mLongToInt)
        println(mAppName+" ExplicitConversion of Float ($mFloat) to Int val is="+mFloatToInt)
        println(mAppName+" ExplicitConversion of Double ($mDouble) to Int val is="+mDoubleToInt)
    }

}