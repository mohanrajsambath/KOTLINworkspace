package mohan.com.mykotlinexperiments.classesandobjects.inheritancepack.overridingmethods

import mohan.com.mykotlinexperiments.classesandobjects.inheritancepack.callingsuperclass.SubClsFilledRectangle
import mohan.com.mykotlinexperiments.classesandobjects.inheritancepack.callingsuperclass.SubClsFilledRectangle1
import mohan.com.mykotlinexperiments.classesandobjects.inheritancepack.dcinitializationorder.DCIODerivedclass
import mohan.com.mykotlinexperiments.classesandobjects.inheritancepack.overridingproperties.MyOverridingProperty


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
}