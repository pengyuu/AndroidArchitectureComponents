package com.pengyuu.architecture

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pengyuu.network.Constant
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sample_text.text = Constant.BASE_URL
    }

}
