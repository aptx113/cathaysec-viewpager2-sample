package com.danteyu.studio.cathaysecassigment.ext

import android.content.Context
import android.view.Gravity
import android.widget.Toast

/**
 * Created by George Yu on 2020/6/30.
 */
fun Context.showToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).apply {
        setGravity(Gravity.CENTER, 0, 0)
        show()
    }
}
