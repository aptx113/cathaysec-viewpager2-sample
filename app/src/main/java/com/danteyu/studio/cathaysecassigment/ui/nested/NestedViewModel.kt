package com.danteyu.studio.cathaysecassigment.ui.nested

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.danteyu.studio.cathaysecassigment.data.mockData.MOCK_DATA_NESTED
import com.danteyu.studio.cathaysecassigment.data.model.nested.NestedItem
import kotlinx.coroutines.launch

/**
 * Created by George Yu on 2020/6/27.
 */
class NestedViewModel : ViewModel() {

    private val _nestedItems = MutableLiveData<List<NestedItem>>()

    val nestedItems: LiveData<List<NestedItem>> = _nestedItems

    init {
        getNestedResult()
    }

    private fun getNestedResult() {

        viewModelScope.launch {

            _nestedItems.value = MOCK_DATA_NESTED.nestedItems
        }
    }

}
