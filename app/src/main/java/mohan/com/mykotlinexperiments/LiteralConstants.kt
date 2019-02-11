package mohan.com.mykotlinexperiments


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
class LiteralConstants{

    /*Literal Constants
    There are the following kinds of literal constants for integral values:

    Decimals: 123
    Longs are tagged by a capital L: 123L
    Hexadecimals: 0x0F
    Binaries: 0b00001011
    NOTE: Octal literals are not supported.*/

    /*Kotlin also supports a conventional notation for floating-point numbers:

    Doubles by default: 123.5, 123.5e10
    Floats are tagged by f or F: 123.5f*/

    var mAppName :String  = BasicDataTypes().mAppName;
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010


    fun showLiteralConstants(){
        println("<=------------Literal Constants------------=>")
        println(mAppName+" Decimal Value is="+oneMillion)
        println(mAppName+" Long  Value is="+creditCardNumber)
        println(mAppName+" Long Value is="+socialSecurityNumber)
        println(mAppName+" Hexa Value is="+hexBytes)
        println(mAppName+" Binary Value is="+bytes)
    }
}