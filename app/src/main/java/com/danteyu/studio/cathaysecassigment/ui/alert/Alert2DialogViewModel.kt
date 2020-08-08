package com.danteyu.studio.cathaysecassigment.ui.alert

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.danteyu.studio.cathaysecassigment.Event

/**
 * Created by George Yu on 2020/8/8.
 */
class Alert2DialogViewModel : ViewModel() {

    private val _isPositiveBtnClicked = MutableLiveData<Event<Boolean>>()
    val isPositiveBtnClicked: LiveData<Event<Boolean>> = _isPositiveBtnClicked

    private val _isNegativeBtnClicked = MutableLiveData<Event<Boolean>>()
    val isNegativeBtnClicked: LiveData<Event<Boolean>> = _isNegativeBtnClicked

    fun onPositiveBtnClicked() {
        _isPositiveBtnClicked.value = Event(true)
    }

    fun inNegativeBtnClicked() {
        _isNegativeBtnClicked.value = Event(true)
    }

}
