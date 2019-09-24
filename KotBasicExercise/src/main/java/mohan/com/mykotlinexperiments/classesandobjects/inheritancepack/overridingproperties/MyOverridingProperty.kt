package mohan.com.mykotlinexperiments.classesandobjects.inheritancepack.overridingproperties

import mohan.com.mykotlinexperiments.classesandobjects.inheritancepack.overridingmethods.CircleGeometry
import mohan.com.mykotlinexperiments.classesandobjects.inheritancepack.overridingmethods.RectangleGeometry
import mohan.com.mykotlinexperiments.classesandobjects.inheritancepack.overridingmethods.SquareGeometry
import mohan.com.mykotlinexperiments.classesandobjects.inheritancepack.overridingmethods.TriangleGeometry


/*
 * Copyright (c) 2019. Created by Mohanraj.S,Innobot Systems on 24/9/19 for KOTLINworkspace
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
class MyOverridingProperty:RectProperties() {

    /*val mA:Int = 0
    val mB:Int = 0
    var mC:Int = 0*/

    /*override val prop0: Int
        get() = super.prop0

    override val prop1: Int
        get() = super.prop1

    override var prop2: Int
        get() = super.prop2
        set(value) {
            println(value)
        }*/
    override var prop0:Double = super.prop0+1.0
    override var prop1:Double = super.prop1+1.0
    override var prop2:Double = super.prop2+1.0

    init {
        PassOverridePropertyValues()
        MyRectangleClass()
        MyPolygonClass()
    }

    fun PassOverridePropertyValues(){
        CircleGeometry(prop0)
        RectangleGeometry(prop0,prop1)
        SquareGeometry(prop0)
        TriangleGeometry(prop0,prop1,prop2)
    }

}