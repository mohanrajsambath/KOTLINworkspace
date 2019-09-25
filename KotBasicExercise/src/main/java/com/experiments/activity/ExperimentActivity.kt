package com.experiments.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.experiments.R
import com.experiments.basictypes.BasicDataTypes
import com.experiments.classesandobjects.basicexclasses.Consturctors
import com.experiments.classesandobjects.basicexclasses.Customer
import com.experiments.classesandobjects.basicexclasses.PrimaryConstructorDemo
import com.experiments.classesandobjects.inheritancepack.constructoroverloading.ClassesConstructorOverLoading
import com.experiments.classesandobjects.inheritancepack.derivednoprimaryconstructor.MyCustomView
import com.experiments.classesandobjects.inheritancepack.multilevel.ChildClass
import com.experiments.classesandobjects.inheritancepack.overridingmethods.ClassesOverridingMethods

class ExperimentActivity : AppCompatActivity() {
    var mAppName :String  = "\tExercise:"
    var mRefernceLink :String = "https://www.tutorialspoint.com/kotlin/kotlin_basic_types.htm"
    var mReferenceLink2:String = "https://www.journaldev.com/11780/android-data-binding"
    var mDocReferenceLink :String = "https://kotlinlang.org/docs/reference/"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //AccessBasicClasses()
        //goMultiLevelInheritance()
        //goConstructorOverLoading()
        goOverridingMethods()

    }

    fun AccessBasicClasses(){
        BasicDataTypes().DataTypeFunctions()
        PrimaryConstructorDemo("Mohan").firstProperty
        PrimaryConstructorDemo("Raj").secondProperty
        Customer("Hi Mohan")
        Customer("Welcome Mohanraj").doPrint()
        Consturctors(10000)
        //showReferences()
        println("<=------------**********------------=>")
    }

    fun goMultiLevelInheritance(){
       //GranParentClass(50)
       //ParentClass(100)
        ChildClass(150)
        MyCustomView(applicationContext)


    }

    fun goConstructorOverLoading(){
        /*https://kotlinlang.org/docs/reference/classes.html*/
        /*ConstructorOverLoading*/
        /*Primary and Secondary Constructors are Used*/
        ClassesConstructorOverLoading()
    }

    fun goOverridingMethods(){
        /*Overriding Methods*/
        ClassesOverridingMethods()
    }


    fun showReferences(){
        println("App Reference Link:"+mRefernceLink)
        println("Document Reference Link:"+mDocReferenceLink)
    }
}
