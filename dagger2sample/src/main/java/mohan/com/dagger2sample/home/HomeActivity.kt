package mohan.com.dagger2sample.home

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import mohan.com.dagger2sample.R
import mohan.com.dagger2sample.component
import javax.inject.Inject

class HomeActivity : AppCompatActivity(), View.OnClickListener{


    var myFab:FloatingActionButton?=null
    @Inject lateinit var context:Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //(application as Application).component.Inject(this)
        //Invoke extension from DaggerUtils
        component.Inject(this)
        myFab = findViewById(R.id.floatingActionButton)
        myFab!!.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if (v != null) when (v.id) {
            R.id.floatingActionButton -> {
                Snackbar.make(v, "Replace with your own action $context",
                    Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
            }
        }

    }
}
