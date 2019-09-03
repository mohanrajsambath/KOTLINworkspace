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

        //Dynamic Textview
        /*val mDynamicTxtView= TextView(this)
        mDynamicTxtView.textSize=10.5f
        mDynamicTxtView.resources.getColor(R.color.colorCyan,theme)
        mDynamicTxtView.text="This Dynamic textView"
        ll_main_layout.addView(mDynamicTxtView)*/


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



        }
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

}
