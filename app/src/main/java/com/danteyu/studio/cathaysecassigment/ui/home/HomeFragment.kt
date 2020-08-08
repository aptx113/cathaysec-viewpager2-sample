package com.danteyu.studio.cathaysecassigment.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import androidx.navigation.fragment.findNavController
import com.danteyu.studio.cathaysecassigment.NavigationDirections
import com.danteyu.studio.cathaysecassigment.data.model.alert.AlertData
import com.danteyu.studio.cathaysecassigment.databinding.FragmentHomeBinding
import com.danteyu.studio.cathaysecassigment.ext.observeEvent
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

        viewModel.navigateToHome.observe(viewLifecycleOwner) {
            findNavController().navigate(NavigationDirections.navigateToBankFragment())
            viewModel.onHomeNavigated()

        }

        viewModel.navigateToHomeList.observe(viewLifecycleOwner) {
            findNavController().navigate(NavigationDirections.navigateToBankFragment(it))
            viewModel.onHomeListNavigated()
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

        return binding.root
    }
}
