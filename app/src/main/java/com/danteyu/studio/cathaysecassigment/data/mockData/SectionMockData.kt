package com.danteyu.studio.cathaysecassigment.data.mockData

import com.danteyu.studio.cathaysecassigment.R
import com.danteyu.studio.cathaysecassigment.data.model.section.*

/**
 * Created by George Yu on 2020/6/20.
 */
val MOCK_DATA_SECTION: SectionResponse by lazy {

    val actionSection = ActionSection(likes = 500)
    val recommendSection = RecommendSection(
        listOf(
            RecommendSectionItem(image = R.drawable.ic_banner_credituser, title = "國泰世華"),
            RecommendSectionItem(image = R.drawable.ic_banner_credituser, title = "國泰世華"),
            RecommendSectionItem(image = R.drawable.ic_banner_credituser, title = "國泰世華"),
            RecommendSectionItem(image = R.drawable.ic_banner_credituser, title = "國泰世華"),
            RecommendSectionItem(image = R.drawable.ic_banner_credituser, title = "國泰世華"),
            RecommendSectionItem(image = R.drawable.ic_banner_credituser, title = "國泰世華")
        )
    )

    SectionResponse(sections = mutableListOf<Section>().apply {
        add(actionSection)
        add(recommendSection)
    })

}
