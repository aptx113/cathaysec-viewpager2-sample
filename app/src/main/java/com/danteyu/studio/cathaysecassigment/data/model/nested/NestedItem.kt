package com.danteyu.studio.cathaysecassigment.data.model.nested

import android.graphics.Color

/**
 * Created by George Yu on 2020/6/27.
 */
sealed class NestedItem

data class NestedColor(val nestedColor: Int) : NestedItem()

data class NestedTexts(val nestedTexts: List<String>) : NestedItem()
