package com.experiments.classesandobjects.myinheritance.callingsuperclass


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
class SubClsFilledRectangle1:SprClsRectangle() {
    override fun draw() {
        super.draw()
        println("---=> SubClsFilledRectangle1 Filling the rectangle")
    }

    val borderColor1:String="blue"


    inner class Filler{
        fun fill(){
            println("---=> Inner Class Filler fill()")
        }

        fun drawAndFill(){
            super@SubClsFilledRectangle1.draw()
            println("---=> Inner Class Filler ---=>Drawn a filled rectangle with color ${super@SubClsFilledRectangle1.borderColor}, ${borderColor1}") // Uses Rectangle's implementation of borderColor's
        }
    }

    fun invokeInnerClass(){
        draw()
        Filler().fill()
        Filler().drawAndFill()
    }

}