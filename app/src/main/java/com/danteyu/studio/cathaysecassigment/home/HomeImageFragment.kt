package com.danteyu.studio.cathaysecassigment.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.danteyu.studio.cathaysecassigment.databinding.FragmentHomeImageBinding

/**
 * Created by George Yu on 2020/4/27.
 */
class HomeImageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentHomeImageBinding.inflate(inflater, container, false)

        binding.buttonHomeSwitch.setOnClickListener {
            (parentFragment as HomeFragment).setupDestination(HOME_LIST_PAGE_INDEX)
        }

        return binding.root
    }
}