package com.danteyu.studio.cathaysecassigment.data.mockData

import com.danteyu.studio.cathaysecassigment.R
import com.danteyu.studio.cathaysecassigment.data.model.nested.NestedColor
import com.danteyu.studio.cathaysecassigment.data.model.nested.NestedItem
import com.danteyu.studio.cathaysecassigment.data.model.nested.NestedItemResponse
import com.danteyu.studio.cathaysecassigment.data.model.nested.NestedTexts

/**
 * Created by George Yu on 2020/6/28.
 */
val MOCK_DATA_NESTED: NestedItemResponse by lazy {

    val nestedColorRed = NestedColor(R.color.scarletRed)
    val nestedColorBlue = NestedColor(R.color.blue)
    val nestedTexts = NestedTexts(mutableListOf<String>().also {
        for (count in 0 until 20) {
            it.add("NiceWork")
        }
    })

    val nestedColorGreen = NestedColor(R.color.brownishGrey)

    NestedItemResponse(nestedItems = mutableListOf<NestedItem>().apply {
        add(nestedColorBlue)
        add(nestedColorRed)
        add(nestedTexts)
        add(nestedColorGreen)
    })

}
