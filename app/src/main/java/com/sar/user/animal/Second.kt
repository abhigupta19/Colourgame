package com.sar.user.animal

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class Second : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var abc=intent.getStringExtra("name")
        var photo=intent.getStringExtra("srccompat")
        textView.setText(abc.toString())
        if (abc=="orange")
        imageView3.setImageDrawable(application.getDrawable(R.drawable.abc_list_longpressed_holo))
        else
            imageView3.setImageDrawable(application.getDrawable(R.drawable.abc_btn_check_to_on_mtrl_000))
    }
}
