package com.experiments.classesandobjects.inheritancepack.overridingmethods


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
class CircleGeometry(radius:Double):Geometry() {
    var mRadius:Double = radius
    val pi:Double=3.14159

    init {
        findArea()
        findPerimeter()
        justPrint()
    }

    override fun findArea() {
        //super.findArea()
        val area:Double = pi*mRadius*mRadius
        println("Area of Circle---=>$area")
    }

    override fun findPerimeter() {
        //super.findPermimeter()
        val permieter:Double = 2*pi*mRadius
        println("Perimeter of Circle---=>$permieter")
    }

    final override fun justPrint() {
        //super.justPrint()
        //println("---=>CircleGeometry JustPrint method executed")

    }




}