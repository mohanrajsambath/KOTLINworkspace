package mohan.com.kotlinandroid

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.roundToInt


class MainActivity : AppCompatActivity(), View.OnClickListener {


    private var isSwitched = false
    private var getActivityContext: MainActivity? = null
    var imgVw_thumbnail: ImageView? = null
    var imgVw_touch: ImageView? = null
    var btn_switch: Button? = null

    val TopLevel_PI = 3.14
    var TopLevel_X = 0



    var txtVw_fun_2_var_arg_returntype: TextView?=null
    var txtVw_fun_2_arg_inferred_returntype: TextView?=null
    var txtVw_fun_returning_no_meaningful_value: TextView?=null
    var txtVw_fun_returning_no_meaningful_value_omitted_units: TextView?=null
    var txtVw_readonly_variables: TextView?=null
    var txtVw_readwrite_variables: TextView?=null
    var txtVw_readwrite_toplevel_variables: TextView?=null
    var txtVw_string_template: TextView?=null
    var txtVw_conditional_expression: TextView?=null
    var txtVw_if_also_an_conditional_expression: TextView?=null
    var txtVw_null_checks: TextView?=null
    var txtVw_returning_nullable_value: TextView?=null
    var txtVw_typecasting: TextView?=null
    var txtVw_forLoop: TextView?=null
    var txtVw_whileLoop: TextView?=null
    var txtVw_whenExpression: TextView?=null
    var txtVw_rangein_IF_Condition: TextView?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getActivityContext = this@MainActivity
        initView()
    }

    private fun initView() {
        imgVw_thumbnail = findViewById(R.id.imgVw_thumbnail)
        imgVw_touch = findViewById(R.id.imgVw_touch)
        btn_switch = findViewById(R.id.btn_switch)
        imgVw_touch!!.setOnClickListener(this)
        /*ScrollView Child Components*/
        txtVw_fun_2_var_arg_returntype = findViewById(R.id.txtVw_fun_2_var_arg_returntype)
        txtVw_fun_2_var_arg_returntype!!.setOnClickListener(this)

        txtVw_fun_2_arg_inferred_returntype = findViewById(R.id.txtVw_fun_2_arg_inferred_returntype)
        txtVw_fun_2_arg_inferred_returntype!!.setOnClickListener(this)

        txtVw_fun_returning_no_meaningful_value= findViewById(R.id.txtVw_fun_returning_no_meaningful_value)
        txtVw_fun_returning_no_meaningful_value!!.setOnClickListener(this)

        txtVw_fun_returning_no_meaningful_value_omitted_units= findViewById(R.id.txtVw_fun_returning_no_meaningful_value_omitted_units)
        txtVw_fun_returning_no_meaningful_value_omitted_units!!.setOnClickListener(this)

        txtVw_readonly_variables= findViewById(R.id.txtVw_readonly_variables)
        txtVw_readonly_variables!!.setOnClickListener(this)

        txtVw_readwrite_variables= findViewById(R.id.txtVw_readwrite_variables)
        txtVw_readwrite_variables!!.setOnClickListener(this)


        txtVw_readwrite_toplevel_variables= findViewById(R.id.txtVw_readwrite_toplevel_variables)
        txtVw_readwrite_toplevel_variables!!.setOnClickListener(this)

        txtVw_string_template= findViewById(R.id.txtVw_string_template)
        txtVw_string_template!!.setOnClickListener(this)

        txtVw_conditional_expression= findViewById(R.id.txtVw_conditional_expression)
        txtVw_conditional_expression!!.setOnClickListener(this)

        txtVw_if_also_an_conditional_expression= findViewById(R.id.txtVw_if_also_an_conditional_expression)
        txtVw_if_also_an_conditional_expression!!.setOnClickListener(this)

        txtVw_null_checks= findViewById(R.id.txtVw_null_checks)
        txtVw_null_checks!!.setOnClickListener(this)

        txtVw_returning_nullable_value= findViewById(R.id.txtVw_returning_nullable_value)
        txtVw_returning_nullable_value!!.setOnClickListener(this)

        txtVw_typecasting= findViewById(R.id.txtVw_typecasting)
        txtVw_typecasting!!.setOnClickListener(this)

        txtVw_forLoop= findViewById(R.id.txtVw_forLoop)
        txtVw_forLoop!!.setOnClickListener(this)

        txtVw_whileLoop= findViewById(R.id.txtVw_whileLoop)
        txtVw_whileLoop!!.setOnClickListener(this)

        txtVw_whenExpression= findViewById(R.id.txtVw_whenExpression)
        txtVw_whenExpression!!.setOnClickListener(this)

        txtVw_rangein_IF_Condition= findViewById(R.id.txtVw_rangein_IF_Condition)
        txtVw_rangein_IF_Condition!!.setOnClickListener(this)

        //Dynamic Textview
        /*val mDynamicTxtView= TextView(this)
        mDynamicTxtView.textSize=10.5f
        mDynamicTxtView.resources.getColor(R.color.colorCyan,theme)
        mDynamicTxtView.text="This Dynamic textView"
        ll_main_layout.addView(mDynamicTxtView)*/


    }

    fun customSnackBar(hintMsg:String,valueStr:String){
        val popupMsg:Snackbar
        if(valueStr.length>0){
            popupMsg = Snackbar.make(root_layout,hintMsg+valueStr,Snackbar.LENGTH_SHORT)
        }else{
            popupMsg = Snackbar.make(root_layout,hintMsg,Snackbar.LENGTH_SHORT)
        }
        popupMsg.show()
        /*val snack = Snackbar.make(root_layout,hintMsg+valueStr,Snackbar.LENGTH_SHORT)
        snack.show()*/
    }

    override fun onClick(v: View?) {
        if (v != null) when (v.id) {
            R.id.imgVw_touch -> {
                if (isSwitched) {
                    isSwitched = false
                    imgVw_thumbnail?.setImageResource(R.drawable.ic_whatshot)
                    DrawableCompat.setTint(
                        imgVw_touch!!.getDrawable(),
                        ContextCompat.getColor(getApplicationContext(), R.color.colorCyan)
                    );
                } else {
                    isSwitched = true
                    imgVw_thumbnail?.setImageResource(R.drawable.ic_terrain)
                    DrawableCompat.setTint(
                        imgVw_touch!!.getDrawable(),
                        ContextCompat.getColor(getApplicationContext(), R.color.colorViolet)
                    );
                }
                //Toast.makeText(getActivityContext, "Switched", Toast.LENGTH_SHORT).show()
            }

            R.id.txtVw_fun_2_var_arg_returntype->{
                val snack = Snackbar.make(root_layout,"Int 2 arg fun return Type="+sum(1,2),Snackbar.LENGTH_SHORT)
                snack.show()
            }

            R.id.txtVw_fun_2_arg_inferred_returntype->{
                val snack = Snackbar.make(root_layout,"Function Inferred Return Type Sum="+sumInferred(3,4),Snackbar.LENGTH_SHORT)
                snack.show()
            }

            R.id.txtVw_fun_returning_no_meaningful_value->{
                noMeaningMathFunctions(4,5)
                val snack = Snackbar.make(root_layout,"Function Return No Meaningful",Snackbar.LENGTH_SHORT)
                snack.show()
            }

            R.id.txtVw_fun_returning_no_meaningful_value_omitted_units->{
                noMeaningOmmittedUnitsMathFunction(6,7)
                val snack = Snackbar.make(root_layout,"Function Return No Meaningful Omitted Units",Snackbar.LENGTH_SHORT)
                snack.show()
            }

            R.id.txtVw_readonly_variables->{
                readOnlyVariables()
                val snack = Snackbar.make(root_layout,"Read Only Variables",Snackbar.LENGTH_SHORT)
                snack.show()
            }

            R.id.txtVw_readwrite_variables->{
                readandWriteVariables()
                val snack = Snackbar.make(root_layout,"Read & Write Variables",Snackbar.LENGTH_SHORT)
                snack.show()
            }

            R.id.txtVw_readwrite_toplevel_variables->{
                readandWriteTopLevelVariables()
                val snack = Snackbar.make(root_layout,"Read & Write Top Level Variables",Snackbar.LENGTH_SHORT)
                snack.show()
            }

            R.id.txtVw_string_template->{
                stringTemplates()
                val snack = Snackbar.make(root_layout,"String Templates",Snackbar.LENGTH_SHORT)
                snack.show()
            }

            R.id.txtVw_conditional_expression->{
                val maxOfValue=conditionalExpression_maxOf(10,20)
                val snack = Snackbar.make(root_layout,"Conditional Expressions ="+maxOfValue,Snackbar.LENGTH_SHORT)
                snack.show()
            }

            R.id.txtVw_if_also_an_conditional_expression->{
                val maxOfValue=ifExpressionMaxOf(10,30)
                /*val snack = Snackbar.make(root_layout,"If also an Conditional Expressions ="+maxOfValue,Snackbar.LENGTH_SHORT)
                snack.show()*/
                customSnackBar("If also an Conditional Expressions =", maxOfValue.toString())
            }

            R.id.txtVw_null_checks->{
                val aa=parseInt("")
                customSnackBar("Null Check-", aa.toString())
            }

            R.id.txtVw_returning_nullable_value->{
                returnNullable1("!@#$","*&^&")
                customSnackBar("Use a function returning nullable value =", "")
            }

            R.id.txtVw_typecasting->{
                val mStringLen1=getStringLength1("Mohan")
                val mStringLen2=getStringLength2("GaneshKumar")
                val mStringLen3=getStringLength3("Dhayalan")
                customSnackBar("Type Casting Function from String- ", "1st-String="+mStringLen1.toString()+", 2nd-String="+mStringLen2.toString()+", 3rd-String="+mStringLen3.toString())
            }

            R.id.txtVw_forLoop->{
                forLoop()
                customSnackBar("ForLoop","")
            }

            R.id.txtVw_whileLoop->{
                whileLoop()
                customSnackBar("WhileLoop","")
            }

            R.id.txtVw_whenExpression->{
                //val returnValueofWhen= describeWhenExpression(1)
                //val returnValueofWhen= describeWhenExpression("Hello")
                //val returnValueofWhen= describeWhenExpression(100000000000000)
                //val returnValueofWhen= describeWhenExpression(Int)
                val returnValueofWhen= describeWhenExpression(0.0)
                customSnackBar("When Expression =",returnValueofWhen)
            }
            R.id.txtVw_rangein_IF_Condition->{
                val returnValueofRange=rangeinConditionalStatement(10,9)
                customSnackBar("When Expression =", returnValueofRange.toString())
            }
        }
    }



    //function with 2 argument and integer return type
    fun sum(a: Int, b: Int): Int {
        return a + b
    }
    //Function with an expression body and inferred return type:
    fun sumInferred(a: Int, b: Int) = a + b

    //Function returning no meaningful value:
    fun noMeaningMathFunctions(a: Int, b: Int): Unit {
        println("Addition of $a and $b is ${a + b}")
        println("Subtraction of $a and $b is ${a - b}")
        println("Multiplication of $a and $b is ${a * b}")
        println("Division of $a and $b is ${a / b}")
        println("Modulo of $a and $b is ${a % b}")

        println("Division of $b and $a is ${b / a}")
        println("Modulo of $b and $a is ${b % a}")
    }

    //Unit return type can be omitted:
    fun noMeaningOmmittedUnitsMathFunction(a: Int, b: Int) {
        println("sum of $a and $b is ${a + b}")
        Log.i("KOTLIN","value of a is $a")
    }

    //Read-only local variables are defined using the keyword val. They can be assigned a value only once.
    fun readOnlyVariables(){
        val a: Int = 1  // immediate assignment
        val b = 2   // `Int` type is inferred
        val c: Int  // Type required when no initializer is provided
        c = 3       // deferred assignment
        println(" Value of A is $a")
        println(" Value of B is $b")
        println(" Value of C is $c")
    }

    //Variables that can be reassigned use the var keyword
    fun readandWriteVariables(){
        var x = 5 // `Int` type is inferred
        x += 1
        println(" Value of x is $x")
    }

    //Variables that can be reassigned use the var keyword,Top-level variables:
    fun readandWriteTopLevelVariables(){
        TopLevel_X= (TopLevel_PI*2).roundToInt()
        println(" Value of TopLevel_PI is $TopLevel_PI")
        println(" Value of TopLevel_X is $TopLevel_X")
    }

    //String templates
    fun stringTemplates(){
        var a = 10
        // simple name in template:
        val s1 = "a is $a"
        println(" String Template s1 values is $s1")
        a = 200
        // arbitrary expression in template:
        val s2 = "${s1.replace("is", "was")}, but now is $a"
        println(" String Template s2 values is $s2")
    }

    //Conditional expressions
    fun conditionalExpression_maxOf(a:Int, b:Int):Int{
        if (a > b) {
            return a
        }else if(a==b){
            return a
        } else {
            return b
        }
    }

    //if can also be used as an expression
    fun ifExpressionMaxOf(a: Int, b: Int) = if (a > b) a else b

    /*A reference must be explicitly marked as nullable when null value is possible.
    Return null if str does not hold an integer:*/
    fun parseInt(str: String): Int? {
        val a:Int =10
        println(" String Template s1 values is $str")
        return a
    }

    /*Use a function returning nullable value:*/
    fun returnNullable1(arg1: String, arg2: String) {
        val x = parseInt(arg1)
        val y = parseInt(arg2)

        // Using `x * y` yields error because they may hold nulls.
        if (x != null && y != null) {
            // x and y are automatically cast to non-nullable after null check
            println(x * y)
        }
        else {
            println("'$arg1' or '$arg2' is not a number")
        }
        returnNullable2(arg1,arg2)
    }

    fun returnNullable2(arg1: String, arg2: String){
        val x = parseInt(arg1)
        val y = parseInt(arg2)
        if (x == null) {
            println("Wrong number format in arg1: '$arg1'")
            return
        }
        if (y == null) {
            println("Wrong number format in arg2: '$arg2'")
            return
        }
        // x and y are automatically cast to non-nullable after null check
        println(x * y)
    }

    /*Type checks and automatic casts
    The is operator checks if an expression is an instance of a type.
    If an immutable local variable or property is checked for a specific type,
    there's no need to cast it explicitly:*/

    fun getStringLength1(obj: Any): Int? {
        if (obj is String) {
            // `obj` is automatically cast to `String` in this branch
            return obj.length
        }
        // `obj` is still of type `Any` outside of the type-checked branch
        return null
    }

    fun getStringLength2(obj: Any): Int? {
        if (obj !is String) return null
        // `obj` is automatically cast to `String` in this branch
        return obj.length
    }

    fun getStringLength3(obj: Any): Int? {
        // `obj` is automatically cast to `String` on the right-hand side of `&&`
        if (obj is String && obj.length > 0) {
            return obj.length
        }
        return null
    }

    //forLoop expression
    fun forLoop(){
        val items = listOf("apple", "banana", "kiwifruit")
        //expression-1
        for (item in items) {
            println("Looping Items in List--=>"+item)
        }
        //expression-2
        for (index in items.indices) {
            println("Looping item at $index is ${items[index]}")
        }
    }

    //WhileLoop Expression
    fun whileLoop(){
        val indianBioDivereseList = listOf("Achanakmar-Amarkantak",
            "Agasthyamalai",
            "Dibru Saikhowa",
            "Dihang Dibang",
            "Great Nicobar",
            "Gulf of Mannar",
            "Kachchh",
            "Khangchendzonga",
            "Manas","Nanda Devi",
            "The Nilgiris",
            "Nokrek",
            "Pachmarhi",
            "Simlipal",
            "Sundarbans",
            "Cold Desert",
            "Seshachalam hills",
            "Panna")

        var index = 0
        while (index < indianBioDivereseList.size) {
            println("While Looping item at $index is ${indianBioDivereseList[index]}")
            index++
        }
    }

    //When Conditional Statement
    fun describeWhenExpression(obj: Any): String =
        when (obj) {
            1          -> {"One"}
            "Hello"    -> {"Greeting"}
            is Long    -> {"Long"}
            !is String -> {"Not a string"}
            else       -> {"Unknown"}
        }

    /*Ranges
    Check if a number is within a range using in operator:*/
    fun rangeinConditionalStatement(x:Int,y:Int){
        if(x in 1..y+1){
            println("fits in range")
        }

    }
}


