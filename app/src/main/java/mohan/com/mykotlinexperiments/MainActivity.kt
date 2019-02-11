package mohan.com.mykotlinexperiments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var mRefernceLink :String = "https://www.tutorialspoint.com/kotlin/kotlin_basic_types.htm"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AccessMyExps()

    }

    fun AccessMyExps(){
        BasicDataTypes().DataTypeRunMethods()
        LiteralConstants().showLiteralConstants()
        showReferences()
        println("<=------------**********------------=>")
    }


    fun showReferences(){
        println("App Reference Link:"+mRefernceLink)
    }
}
