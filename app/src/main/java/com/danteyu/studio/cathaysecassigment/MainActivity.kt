package com.danteyu.studio.cathaysecassigment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.databinding.DataBindingUtil.setContentView
import com.danteyu.studio.cathaysecassigment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = setContentView(
            this,
            R.layout.activity_main
        )
    }
}
