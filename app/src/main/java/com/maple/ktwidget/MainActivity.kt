package com.maple.ktwidget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.maple.library.view.DotView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button1.setOnClickListener{
            dotView3.setColor(MainActivity@this.resources.getColor(R.color.colorPrimary))
        }

        button2.setOnClickListener{
            dotView3.setColor(MainActivity@this.resources.getColor(R.color.colorAccent))
        }
    }
}
