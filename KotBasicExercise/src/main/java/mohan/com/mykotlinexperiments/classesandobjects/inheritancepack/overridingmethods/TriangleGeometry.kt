package mohan.com.mykotlinexperiments.classesandobjects.inheritancepack.overridingmethods


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
class TriangleGeometry(sideA:Double,sideB:Double,sideC:Double):Geometry() {
    var mSideA:Double=sideA
    var mSideB:Double=sideB
    var mSideC:Double=sideC

    init {
        findArea()
        findPerimeter()
    }


    override fun findArea() {
        //super.findArea()
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

    override fun findPerimeter() {
        //super.findPerimeter()
        val perimeter = (mSideA + mSideB + mSideC)
        println("Perimeter of Triangle---=>$perimeter")
    }
}