package com.danteyu.studio.cathaysecassigment.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.danteyu.studio.cathaysecassigment.Event

/**
 * Created by George Yu on 2020/5/16.
 */
class HomeViewModel : ViewModel() {

    private val _navigateToBankImage = MutableLiveData<Event<Boolean>>()
    val navigateToBankImage: LiveData<Event<Boolean>> = _navigateToBankImage

    private val _navigateToBankList = MutableLiveData<Event<Int>>()
    val navigateToBankList: LiveData<Event<Int>> = _navigateToBankList

    private val _showAlert2 = MutableLiveData<Event<Boolean>>()
    val showAlert2: LiveData<Event<Boolean>> = _showAlert2

    fun onBankImageNavigated() {
        _navigateToBankImage.value = Event(true)
    }

    fun navigateToViewPager2List(position: Int) {
        _navigateToBankList.value = Event(position)
    }

    fun onAlert2Showed() {
        _showAlert2.value = Event(true)
    }
}