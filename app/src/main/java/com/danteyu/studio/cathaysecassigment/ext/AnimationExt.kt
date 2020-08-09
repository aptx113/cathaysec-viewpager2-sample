package com.danteyu.studio.cathaysecassigment.ext

import android.view.animation.Animation

/**
 * Created by George Yu on 2020/7/12.
 */

inline fun Animation.setAnimationListener(
    crossinline onAnimationStart: ((animation: Animation?) -> Unit),
    crossinline onAnimationEnd: ((animation: Animation?) -> Unit),
    crossinline onAnimationRepeat: ((animation: Animation?) -> Unit)
) {
    setAnimationListener(object : Animation.AnimationListener {
        override fun onAnimationRepeat(animation: Animation?) {
            onAnimationRepeat(animation)
        }

        override fun onAnimationEnd(animation: Animation?) {
            onAnimationEnd(animation)
        }

        override fun onAnimationStart(animation: Animation?) {
            onAnimationStart(animation)
        }
    })
}


//inline fun Animation.setAnimationStartListener(crossinline onAnimationStart: ((animation: Animation?) -> Unit)) {
//    setAnimationListener(onAnimationStart, {}, {})
//}
//
//inline fun Animation.setAnimationEndListener(crossinline onAnimationEnd: ((animation: Animation?) -> Unit)) {
//    setAnimationListener({}, onAnimationEnd, {})
//}
