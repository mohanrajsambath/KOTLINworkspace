package mohan.com.lottieanimation

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView


class MainActivity : AppCompatActivity() {
    var thumb_up: LottieAnimationView? = null
    var thumb_down: LottieAnimationView? = null
    var toggle: LottieAnimationView? = null
    var check: LottieAnimationView? = null
    var flag = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        thumb_up = findViewById(R.id.lav_thumbUp)
        thumb_down = findViewById(R.id.lav_thumbDown)
        toggle = findViewById(R.id.lav_toggle)
        check = findViewById(R.id.lav_check)

        check?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                //check?.setProgress(0f)
                check?.playAnimation()
                Toast.makeText(this@MainActivity, "Cheers!!", Toast.LENGTH_SHORT).show()
                //---- Your code here------
            }
        })


        thumb_up?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                thumb_down?.setProgress(0f)
                thumb_down?.pauseAnimation()
                thumb_up?.playAnimation()
                Toast.makeText(this@MainActivity, "Cheers!!", Toast.LENGTH_SHORT).show()
                //---- Your code here------
            }
        })


        thumb_down?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                thumb_up?.setProgress(0f)
                thumb_up?.pauseAnimation()
                thumb_down?.playAnimation()
                Toast.makeText(this@MainActivity, "Boo!!", Toast.LENGTH_SHORT).show()
                //---- Your code here------
            }
        })


        toggle?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                changeState()
            }
        })
    }

    private fun changeState() {
        if (flag == 0) {
            toggle?.setMinAndMaxProgress(
                0f,
                0.43f
            ) //Here, calculation is done on the basis of start and stop frame divided by the total number of frames
            toggle?.playAnimation()
            flag = 1
            //---- Your code here------
        } else {
            toggle?.setMinAndMaxProgress(0.5f, 1f)
            toggle?.playAnimation()
            flag = 0
            //---- Your code here------
        }
    }

}
