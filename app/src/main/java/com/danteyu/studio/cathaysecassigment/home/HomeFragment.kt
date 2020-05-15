package com.danteyu.studio.cathaysecassigment.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.danteyu.studio.cathaysecassigment.databinding.FragmentHomeBinding
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * Created by George Yu on 2020/4/27.
 */
class HomeFragment : Fragment() {

    lateinit var viewpager: ViewPager2
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentHomeBinding.inflate(inflater, container, false)

        viewpager = binding.viewPagerHome

        viewpager.adapter = HomeViewPagerAdapter(this)

        TabLayoutMediator(binding.tabLayoutHome, viewpager) { tab, position ->
            tab.text = getTabTitle(position)
        }.attach()


        return binding.root
    }

    private fun getTabTitle(position: Int): String? {
        return when (position) {
            HOME_IMAGE_PAGE_INDEX -> "TAB1"
            HOME_LIST_PAGE_INDEX -> "TAB2"
            else -> null
        }
    }

    fun switchFragment(target: Int) {
        viewpager.currentItem = target
    }
}