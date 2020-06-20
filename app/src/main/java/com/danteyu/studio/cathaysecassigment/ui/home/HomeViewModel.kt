package com.danteyu.studio.cathaysecassigment.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * Created by George Yu on 2020/5/16.
 */
class HomeViewModel : ViewModel() {

    private val _navigateToHome = MutableLiveData<Boolean>()

    val navigateToHome: LiveData<Boolean>
        get() = _navigateToHome

    private val _navigateToHomeList = MutableLiveData<Int>()

    val navigateToHomeList: LiveData<Int>
        get() = _navigateToHomeList

    fun navigateToViewPager2() {
        _navigateToHome.value = true
    }

    fun onHomeNavigated() {
        _navigateToHome.value = null
    }

    fun navigateToViewPager2List(position: Int) {
        _navigateToHomeList.value = position
    }

    fun onHomeListNavigated() {
        _navigateToHomeList.value = null
    }
}