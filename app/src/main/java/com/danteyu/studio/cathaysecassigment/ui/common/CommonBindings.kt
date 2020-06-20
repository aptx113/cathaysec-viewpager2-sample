package com.danteyu.studio.cathaysecassigment.ui.common

import android.widget.ImageView
import androidx.databinding.BindingAdapter

/**
 * Created by George Yu on 2020/6/21.
 */
@BindingAdapter("imageResource")
fun bindImageResource(imageView: ImageView, image: Int?) {
    if (image == null) return
    imageView.setImageResource(image)
}