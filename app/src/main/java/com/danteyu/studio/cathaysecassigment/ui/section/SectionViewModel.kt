package com.danteyu.studio.cathaysecassigment.ui.section

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.danteyu.studio.cathaysecassigment.data.mockData.MOCK_DATA_ACTION_SECTION
import com.danteyu.studio.cathaysecassigment.data.mockData.MOCK_DATA_SECTION
import com.danteyu.studio.cathaysecassigment.data.model.section.ActionSection
import com.danteyu.studio.cathaysecassigment.data.model.section.Section
import kotlinx.coroutines.launch

/**
 * Created by George Yu on 2020/6/20.
 */
class SectionViewModel : ViewModel() {

    private val _sections = MutableLiveData<List<Section>>()
    val sections: LiveData<List<Section>> = _sections

    private val _actionSection = MutableLiveData<ActionSection>()
    val actionSection: LiveData<ActionSection> = _actionSection

    init {
        getSectionResult()
    }

    private fun getSectionResult() {

        viewModelScope.launch {

            val result = mutableListOf<Section>().apply {
                add(ActionSection(MOCK_DATA_ACTION_SECTION.likes))
            }


            _sections.value = MOCK_DATA_SECTION.sections
            _sections.value = result
            _actionSection.value = MOCK_DATA_SECTION.sections[0] as ActionSection
        }
    }

}