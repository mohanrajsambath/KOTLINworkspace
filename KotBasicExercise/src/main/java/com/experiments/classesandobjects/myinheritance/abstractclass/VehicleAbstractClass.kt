package com.experiments.classesandobjects.myinheritance.abstractclass


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
abstract class VehicleAbstractClass(val name: String, val color:String, val weight:Double) {

    //Abstract Property(Must be overriden by subclasses)
    abstract var maxSpeed:Double


    //Abstract Methods(Must be implemented by Subclasses)
    abstract fun start()
    abstract fun stop()

    //Concrete(Non Abstract) Method
    fun displayDetails(){
        println("---=>Name: $name, Color: $color, Weight: $weight, Max Speed: $maxSpeed")
    }

}