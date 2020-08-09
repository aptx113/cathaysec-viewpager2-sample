package com.danteyu.studio.cathaysecassigment.ui.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.danteyu.studio.cathaysecassigment.MainActivity
import com.danteyu.studio.cathaysecassigment.R
import com.danteyu.studio.cathaysecassigment.databinding.FragSplashBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * Created by George Yu on 2020/7/28.
 */
class SplashFragment : Fragment() {

    private lateinit var viewDataBinding: FragSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        viewDataBinding = FragSplashBinding.inflate(inflater, container, false).apply {
            lifecycleOwner = viewLifecycleOwner
        }

        viewLifecycleOwner.lifecycleScope.launch {
            delay(DELAY_NAV_IN_MILLIS)

            findNavController().navigate(SplashFragmentDirections.navigateToHomeFragment())
            (activity as MainActivity).setupStartDesForLaunch(
                R.id.homeFragment
            )
        }

        return viewDataBinding.root
    }

    companion object {
        private const val DELAY_NAV_IN_MILLIS = 500L
    }
}