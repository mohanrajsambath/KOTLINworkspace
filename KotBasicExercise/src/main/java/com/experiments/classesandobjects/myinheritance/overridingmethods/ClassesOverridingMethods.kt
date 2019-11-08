package com.experiments.classesandobjects.myinheritance.overridingmethods

import com.experiments.classesandobjects.myinheritance.abstractclass.ExecuteAbstraction
import com.experiments.classesandobjects.myinheritance.callingsuperclass.SubClsFilledRectangle
import com.experiments.classesandobjects.myinheritance.callingsuperclass.SubClsFilledRectangle1
import com.experiments.classesandobjects.myinheritance.dcinitializationorder.DCIODerivedclass
import com.experiments.classesandobjects.myinheritance.overridingproperties.MyOverridingProperty
import com.experiments.classesandobjects.myinheritance.overridingrules.SquareOverriddenRules


/*
 *During construction of a new instance of a derived class, the base class initialization is done as the first step (preceded only by evaluation of the arguments for the base class constructor) and thus happens before the initialization logic of the derived class is run.
 */
class ClassesOverridingMethods{
    init {
        println("<=---Overriding Methods---=>")
        geometricsOfShapes()
        println("<=---        ###       ---=>")

        println("<=---Overriding Properties---=>")
        getOverridingProperties()
        println("<=---        ###       ---=>")

        println("<=---Derived class initialization order---=>")
        getDerivedClassInitializationOrder()
        println("<=---        ###       ---=>")

        println("<=---Calling the superclass implementation---=>")
        callSuperClassImplementation()
        println("<=---        ###       ---=>")


        println("<=---Overriding rules---=>")
        overridingRules()
        println("<=---        ###       ---=>")

        println("<=---Abstract Class---=>")
        abstractClassExecution()
        println("<=---        ###       ---=>")
    }

    fun geometricsOfShapes(){
        CircleGeometry(4.0)
        RectangleGeometry(3.0,9.0)
        SquareGeometry(5.0)
        TriangleGeometry(3.0,5.0,7.0)
    }

    fun getOverridingProperties(){
        MyOverridingProperty()
    }

    fun getDerivedClassInitializationOrder(){
        DCIODerivedclass("Mohanraj","Sambath")
    }

    fun callSuperClassImplementation(){
        SubClsFilledRectangle()
        SubClsFilledRectangle1()
        SubClsFilledRectangle1().invokeInnerClass()
    }


    fun overridingRules(){
        SquareOverriddenRules().draw()
    }

    fun abstractClassExecution(){
        ExecuteAbstraction()

    }
}