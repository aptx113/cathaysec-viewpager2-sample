package com.danteyu.studio.cathaysecassigment.offline

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.danteyu.studio.cathaysecassigment.NavigationDirections
import com.danteyu.studio.cathaysecassigment.databinding.FragmentOfflineDisplayBinding

/**
 * Created by George Yu on 2020/5/16.
 */
class OfflineDisplayFragment : Fragment() {

    private val viewModel by viewModels<OfflineDisplayViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentOfflineDisplayBinding.inflate(inflater, container, false).apply {
            viewModel = viewModel
            lifecycleOwner = this@OfflineDisplayFragment.viewLifecycleOwner
        }
        binding.viewModel = viewModel
//        binding.buttonOffline1.setOnClickListener {
//            findNavController().navigate(
//                NavigationDirections.navigateToHomeFragment()
//            )
//        }
        viewModel.navigateToHome.observe(viewLifecycleOwner, Observer {
            it?.let {
                findNavController().navigate(NavigationDirections.navigateToHomeFragment())
                viewModel.onHomeNavigated()
            }
        })

        return binding.root
    }
}