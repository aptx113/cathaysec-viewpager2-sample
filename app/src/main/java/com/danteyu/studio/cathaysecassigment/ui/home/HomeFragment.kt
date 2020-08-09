package com.danteyu.studio.cathaysecassigment.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.danteyu.studio.cathaysecassigment.NavigationDirections
import com.danteyu.studio.cathaysecassigment.R
import com.danteyu.studio.cathaysecassigment.data.model.alert.AlertData
import com.danteyu.studio.cathaysecassigment.databinding.FragmentHomeBinding
import com.danteyu.studio.cathaysecassigment.ext.observeEvent
import com.danteyu.studio.cathaysecassigment.ext.setAnimationListener
import com.danteyu.studio.cathaysecassigment.ext.showToast

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

        fun showToast(message: String) = requireContext().showToast(message)

        viewModel.navigateToBankImage.observeEvent(viewLifecycleOwner) {
            findNavController().navigate(R.id.bankFragment)

        }

        viewModel.navigateToBankList.observeEvent(viewLifecycleOwner) {
            findNavController().navigate(NavigationDirections.navigateToBankFragment(positionKey = it))
        }

        viewModel.showAlert2.observeEvent(viewLifecycleOwner) {
            findNavController().navigate(
                NavigationDirections.navigateToAlert2(
                    AlertData.create(
                        content = "Test",
                        positiveAction = { showToast("Say Yes!!") },
                        negativeAction = { }
                    )
                )
            )
        }

        startAnimation(binding)

        return binding.root
    }

    private fun startAnimation(viewDataBinding: FragmentHomeBinding) {
        AnimationUtils.loadAnimation(context, R.anim.fade_out).apply {
            setAnimationListener({}, { viewDataBinding.layoutAnimation.visibility = View.GONE }, {})
        }.let { viewDataBinding.layoutAnimation.startAnimation(it) }
    }
}
