package com.danteyu.studio.cathaysecassigment.ui.bank

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.danteyu.studio.cathaysecassigment.ui.bank.item.BankImageFragment
import com.danteyu.studio.cathaysecassigment.ui.bank.item.BankListFragment
import java.lang.IndexOutOfBoundsException

const val VIEWPAGER2_IMAGE_PAGE_INDEX = 0
const val VIEWPAGER2_LIST_PAGE_INDEX = 1

/**
 * Created by George Yu on 2020/4/27.
 */
class HomeViewPagerAdapter(fragment: Fragment) :
    FragmentStateAdapter(fragment) {

    private val tabFragmentCreators: Map<Int, () -> Fragment> = mapOf(
        VIEWPAGER2_IMAGE_PAGE_INDEX to { BankImageFragment() },
        VIEWPAGER2_LIST_PAGE_INDEX to { BankListFragment() }
    )

    override fun getItemCount() = tabFragmentCreators.size

    override fun createFragment(position: Int): Fragment {
        return tabFragmentCreators[position]?.invoke() ?: throw IndexOutOfBoundsException()
    }
}