package mohan.com.mykotlinexperiments.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import mohan.com.mykotlinexperiments.R
import mohan.com.mykotlinexperiments.basictypes.BasicDataTypes
import mohan.com.mykotlinexperiments.classesandobjects.basicexclasses.Consturctors
import mohan.com.mykotlinexperiments.classesandobjects.basicexclasses.Customer
import mohan.com.mykotlinexperiments.classesandobjects.basicexclasses.PrimaryConstructorDemo
import mohan.com.mykotlinexperiments.classesandobjects.inheritancepack.multilevel.ChildClass

class MainActivity : AppCompatActivity() {
    var mAppName :String  = "\tExercise:"
    var mRefernceLink :String = "https://www.tutorialspoint.com/kotlin/kotlin_basic_types.htm"
    var mReferenceLink2:String = "https://www.journaldev.com/11780/android-data-binding"
    var mDocReferenceLink :String = "https://kotlinlang.org/docs/reference/"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AccessBasicClasses()
        goMultiLevelInheritance()

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
    }


    fun showReferences(){
        println("App Reference Link:"+mRefernceLink)
        println("Document Reference Link:"+mDocReferenceLink)
    }
}
