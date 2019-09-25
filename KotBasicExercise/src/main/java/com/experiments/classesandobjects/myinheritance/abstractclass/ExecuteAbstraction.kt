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
 class ExecuteAbstraction {
    init {
        val car = Car("Ferrari 812 Superfast", "red", 1525.0, 339.60)
        val bike= Bike("Ducati 1098s", "red", 173.0, 271.0)

        /*Display methods is written in Parent Class(SuperClass) */
        car.displayDetails()
        bike.displayDetails()

        /*start method written in ChildClass(SubClass)*/
        car.start()
        bike.start()

    }
}