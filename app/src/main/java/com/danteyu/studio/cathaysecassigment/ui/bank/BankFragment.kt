package com.danteyu.studio.cathaysecassigment.ui.bank

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import androidx.viewpager2.widget.ViewPager2
import com.danteyu.studio.cathaysecassigment.databinding.FragmentBankBinding
import com.google.android.material.tabs.TabLayoutMediator

/**
 * Created by George Yu on 2020/4/27.
 */
class BankFragment : Fragment() {

    lateinit var viewpager: ViewPager2
    private val args by navArgs<BankFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentBankBinding.inflate(inflater, container, false)

        viewpager = binding.viewPagerHome

        viewpager.adapter = HomeViewPagerAdapter(this)

        TabLayoutMediator(binding.tabLayoutHome, viewpager) { tab, position ->
            tab.text = getTabTitle(position)
        }.attach()

        setupDestination(args.positionKey, args.smoothScrollKey)

        return binding.root
    }

    private fun getTabTitle(position: Int): String? {
        return when (position) {
            VIEWPAGER2_IMAGE_PAGE_INDEX -> "TAB1"
            VIEWPAGER2_LIST_PAGE_INDEX -> "TAB2"
            else -> null
        }
    }

    fun setupDestination(position: Int, isSmoothScroll: Boolean = true) {
        viewpager.setCurrentItem(position, isSmoothScroll)
    }
}