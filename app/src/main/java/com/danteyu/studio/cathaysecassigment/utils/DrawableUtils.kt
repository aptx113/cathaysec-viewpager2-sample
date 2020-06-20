package com.danteyu.studio.cathaysecassigment.utils

import android.graphics.drawable.Drawable
import com.danteyu.studio.cathaysecassigment.CathaysecApplication

/**
 * Created by George Yu on 2020/6/21.
 */
object DrawableUtils {

    fun getDrawable(resource: Int): Drawable? {
        return CathaysecApplication.instance.getDrawable(resource)
    }
}