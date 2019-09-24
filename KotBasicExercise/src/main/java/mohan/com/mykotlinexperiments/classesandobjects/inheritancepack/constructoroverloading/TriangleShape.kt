package mohan.com.mykotlinexperiments.classesandobjects.inheritancepack.constructoroverloading


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
class TriangleShape {
    var mSideA:Double=0.0
    var mSideB:Double=0.0
    var mSideC:Double=0.0

    var mBaseHeight:Double=0.0
    var mBaseWidth:Double=0.0


    constructor(sideA:Double,sideB:Double,sideC:Double){
        mSideA=sideA
        mSideB=sideB
        mSideC=sideC
    }

    constructor(baseHeight:Double,baseWidth:Double){
        mBaseHeight=baseHeight
        mBaseWidth=baseWidth
    }

    fun areaofTrinagle(){
        // Length of sides must be positive and sum of any two sides
        // must be smaller than third side.
        if (mSideA < 0 || mSideB < 0 || mSideC <0 || (mSideA+mSideB <= mSideC) || mSideA+mSideC <=mSideB || mSideB+mSideC <=mSideA) {
            println("Given Diemensions are not for Triangle---=>mSideA---=>$mSideA---=>mSideB---=>$mSideB---=>mSideC---=>$mSideC")
        }else{
            //lengthOfSides is lS
            val lS = (mSideA + mSideB + mSideC) / 2
            val area = Math.sqrt(lS * (lS - mSideA) * (lS - mSideB) * (lS - mSideC))
            println("Area of Triangle---=>$area")
        }
    }

    fun areaofTrianglebyBH(){
            val area = (mBaseHeight*mBaseWidth)/2
        println("Area of Triangle by Base & Height---=>$area")
    }



}