package mohan.com.mykotlinexperiments.basictypes.representation

import mohan.com.mykotlinexperiments.activity.MainActivity


/*
 * Copyright (c) 2019. Created by Mohanraj.S,on 11/2/19 for KOTLINworkspace
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
class Representation{

    /*On the Java platform, numbers are physically stored as JVM primitive types,
    unless we need a nullable number reference (e.g. Int?) or generics are involved.
    In the latter cases numbers are boxed.
    Note that boxing of numbers does not necessarily preserve identity*/

    var mAppName: String = MainActivity().mAppName

    fun showRepresentationTripleEQUALS(){
        println("<=------------Representation '==='------------=>")
        val a: Int = 10000
        println(mAppName+"Value of a="+a)
        println(mAppName+"Representation-1,Expression-1 (a === a) is:"+(a === a))// Prints 'true'
        //println(a === a) // Prints 'true'
        val boxedA: Int? = a
        val anotherBoxedA: Int? = a
        println(mAppName+"Representation-1,Expression-2 (boxedA === anotherBoxedA) is:"+(boxedA === anotherBoxedA))// !!!Prints 'false'!!!
        //println(boxedA === anotherBoxedA) // !!!Prints 'false'!!!
    }

    fun showRepresentationDoubleEQUALS(){
        println("<=------------Representation '=='------------=>")
        val a: Int = 10000
        println(mAppName+"Value of a="+a)
        println(mAppName+"Representation-2,Expression-1 (a == a) is:"+(a == a))// Prints 'true'
        //println(a == a) // Prints 'true'
        val boxedA: Int? = a
        val anotherBoxedA: Int? = a
        println(mAppName+"Representation-2,Expression-2 (boxedA == anotherBoxedA) is:"+(boxedA == anotherBoxedA))// Prints 'true'
        //println(boxedA == anotherBoxedA) // Prints 'true'
    }
}