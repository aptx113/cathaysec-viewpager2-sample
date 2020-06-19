package com.danteyu.studio.cathaysecassigment.ui.viewPager2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.danteyu.studio.cathaysecassigment.databinding.FragmentViewPager2ImageBinding

/**
 * Created by George Yu on 2020/4/27.
 */
class ViewPager2ImageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentViewPager2ImageBinding.inflate(inflater, container, false)

        binding.buttonHomeSwitch.setOnClickListener {
            (parentFragment as ViewPager2Fragment).setupDestination(VIEWPAGER2_LIST_PAGE_INDEX)
        }

        return binding.root
    }
}