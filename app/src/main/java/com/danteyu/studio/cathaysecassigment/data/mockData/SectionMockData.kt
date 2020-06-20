package com.danteyu.studio.cathaysecassigment.data.mockData

import com.danteyu.studio.cathaysecassigment.data.model.section.ActionSection
import com.danteyu.studio.cathaysecassigment.data.model.section.Section
import com.danteyu.studio.cathaysecassigment.data.model.section.SectionResponse

/**
 * Created by George Yu on 2020/6/20.
 */
val MOCK_DATA_SECTION: SectionResponse by lazy {

    val actionSection = ActionSection(likes = 500)

    SectionResponse(sections = mutableListOf<Section>().apply {
        add(actionSection)
    })

}

val MOCK_DATA_ACTION_SECTION:ActionSection by lazy {

    ActionSection(likes = 500)
}