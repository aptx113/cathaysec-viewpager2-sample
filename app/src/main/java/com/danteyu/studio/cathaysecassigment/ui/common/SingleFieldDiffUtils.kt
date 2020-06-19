package com.danteyu.studio.cathaysecassigment.ui.common

import android.annotation.SuppressLint
import androidx.recyclerview.widget.DiffUtil

/**
 * Created by George Yu on 2020/6/18.
 */
class SingleFieldDiffUtils<T>(val fieldExtractor: (T) -> Any?) : DiffUtil.ItemCallback<T>() {
    override fun areItemsTheSame(oldItem: T, newItem: T): Boolean =
        fieldExtractor(oldItem) == fieldExtractor(newItem)


    @SuppressLint("DiffUtilEquals")
    override fun areContentsTheSame(oldItem: T, newItem: T): Boolean =
        oldItem == newItem
}
