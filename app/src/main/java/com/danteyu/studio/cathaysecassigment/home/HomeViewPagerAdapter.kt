package com.danteyu.studio.cathaysecassigment.home

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import java.lang.IndexOutOfBoundsException

const val HOME_IMAGE_PAGE_INDEX = 0
const val HOME_LIST_PAGE_INDEX = 1

/**
 * Created by George Yu on 2020/4/27.
 */
class HomeViewPagerAdapter(fragment: Fragment) :
    FragmentStateAdapter(fragment) {

    private val tabFragmentCreators: Map<Int, () -> Fragment> = mapOf(
        HOME_IMAGE_PAGE_INDEX to { HomeImageFragment() },
        HOME_LIST_PAGE_INDEX to { HomeListFragment() }
    )

    override fun getItemCount() = tabFragmentCreators.size

    override fun createFragment(position: Int): Fragment {
        return tabFragmentCreators[position]?.invoke() ?: throw IndexOutOfBoundsException()
    }
}