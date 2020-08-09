package com.danteyu.studio.cathaysecassigment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.danteyu.studio.cathaysecassigment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        navController = findNavController(R.id.myNavHostFragment)
        binding.apply {
            lifecycleOwner = this@MainActivity
            bottomNavView.setupWithNavController(navController)

        }

        setupStartDesForLaunch(R.id.splashFragment)
    }

    fun setupStartDesForLaunch(startDes: Int) {

        val navGraph = navController.navInflater.inflate(R.navigation.navigation).apply {
            startDestination = startDes
        }
        navController.graph = navGraph
    }

}
