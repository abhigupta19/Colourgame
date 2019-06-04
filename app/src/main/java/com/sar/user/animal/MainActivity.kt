package com.sar.user.animal

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        when(v!!.id) {
            R.id.imageView -> {
                var intent = Intent(this, Second::class.java)
                intent.putExtra("srccompat", "@android:drawable/ic_notification_overlay")
                intent.putExtra("name", "orange")
                startActivity(intent)
            }
            R.id.imageView2 -> {
                var intent2 = Intent(this, Second::class.java)
                intent2.putExtra("srccompat", "@android:drawable/presence_online")
                intent2.putExtra("name", "green")
                startActivity(intent2)
            }
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView.setOnClickListener(this)
        imageView2.setOnClickListener(this)



    }
}
