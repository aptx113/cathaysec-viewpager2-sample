package com.danteyu.studio.cathaysecassigment.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.danteyu.studio.cathaysecassigment.NavigationDirections
import com.danteyu.studio.cathaysecassigment.R
import com.danteyu.studio.cathaysecassigment.databinding.FragmentHomeBinding
import com.danteyu.studio.cathaysecassigment.ext.setAnimationListener

/**
 * Created by George Yu on 2020/5/16.
 */
class HomeFragment : Fragment() {

    private val viewModel by viewModels<HomeViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentHomeBinding.inflate(inflater, container, false).apply {
            viewModel = viewModel
            lifecycleOwner = this@HomeFragment.viewLifecycleOwner
        }
        binding.viewModel = viewModel

        viewModel.navigateToHome.observe(viewLifecycleOwner, Observer {
            it?.let {
                findNavController().navigate(NavigationDirections.navigateToBankFragment())
                viewModel.onHomeNavigated()
            }
        })

        viewModel.navigateToHomeList.observe(viewLifecycleOwner, Observer {
            it?.let {
                findNavController().navigate(NavigationDirections.navigateToBankFragment(it))
                viewModel.onHomeListNavigated()
            }
        })
        startAnimation(binding)

        return binding.root
    }

    private fun startAnimation(viewDataBinding: FragmentHomeBinding) {
        AnimationUtils.loadAnimation(context, R.anim.fade_out).apply {
            setAnimationListener({}, { viewDataBinding.layoutAnimation.visibility = View.GONE }, {})
        }.let { viewDataBinding.layoutAnimation.startAnimation(it) }
    }
}