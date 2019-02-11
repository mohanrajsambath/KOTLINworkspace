package mohan.com.mykotlinexperiments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var mAppName :String  = "\tMy-Exp-1:"
    var mRefernceLink :String = "https://www.tutorialspoint.com/kotlin/kotlin_basic_types.htm"

    /*Number DataTypes*/
    val intVal: Int = 10000
    val doubleVal: Double = 100.00
    val floatVal: Float = 100.00f
    val longVal: Long = 1000000004
    val shortVal: Short = 10
    val byteVal: Byte = 1

    /*Character DataType*/
    //val letter: Char   // defining a variable
    //letter = 'A'        // Assigning a value to it
    val charVal: Char='A'


    /*Boolean DataType*/
    //val letter: Boolean   // defining a variable
    //letter = true         // Assinging a value to it
    val boolVal: Boolean= true

    /*String DataType*/
    var rawString :String  = "I am Raw String!"
    val escapedString : String  = "I am escaped String!\t!@#$%"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        testRunMethods()
    }



    fun testRunMethods(){
        showLoop1()
        println("<=------------BasicTypes------------=>")
        println("<=------------Numbers---------------=>")
        showNumberTypes()
        println("<=------------Character-------------=>")
        showCharTypes()
        println("<=------------Boolean-------------=>")
        showBooleanTypes()
        println("<=------------String-------------=>")
        showStringTypes()
        println("<=------------**********------------=>")
        showReferences()
        println("<=------------**********------------=>")
    }



    fun showLoop1(){
        println("\nHello World this is Test Program\n")
    }

    fun showNumberTypes(){
        println(mAppName+" Int Value is="+intVal)
        println(mAppName+" Double  Value is="+doubleVal)
        println(mAppName+" Float Value is="+floatVal)
        println(mAppName+" Long Value is="+longVal)
        println(mAppName+" Short Value is="+shortVal)
        println(mAppName+" Byte Value is="+byteVal)
    }
    fun showCharTypes(){
        println(mAppName+" Char Value is="+charVal)
    }


    fun showBooleanTypes(){
        println(mAppName+"Boolean value is="+"$boolVal")
    }

    fun showStringTypes(){
        println(mAppName+"Raw String value is="+rawString)
        println(mAppName+"Escaped String value is="+escapedString)
    }

    fun showReferences(){
        println("App Reference Link:"+mRefernceLink)
    }
}
