package mohan.com.kotlinandroid

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat


class MainActivity : AppCompatActivity(), View.OnClickListener {


    private var isSwitched = false
    private var getActivityContext: MainActivity? = null
    var imgVw_thumbnail: ImageView? = null
    var imgVw_touch: ImageView? = null
    var btn_switch: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getActivityContext = this@MainActivity
        initView()
    }

    private fun initView() {
        imgVw_thumbnail = findViewById<ImageView>(R.id.imgVw_thumbnail)
        imgVw_touch = findViewById<ImageView>(R.id.imgVw_touch)
        btn_switch = findViewById<Button>(R.id.btn_switch)
        imgVw_touch!!.setOnClickListener(this)
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
        }
    }
}
