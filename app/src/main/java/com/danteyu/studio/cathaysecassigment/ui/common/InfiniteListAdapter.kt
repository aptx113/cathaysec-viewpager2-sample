package com.danteyu.studio.cathaysecassigment.ui.common

import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by George Yu on 2020/6/18.
 */
abstract class InfiniteListAdapter<T : Any?, VH : RecyclerView.ViewHolder>(diffUtilsCallback: DiffUtil.ItemCallback<T>) :
    ListAdapter<T, VH>(diffUtilsCallback) {

    companion object {
        private const val INFINITE_LOOP_TOTAL_COUNT = 10000
    }

    abstract fun getRealCount(): Int
    abstract fun onBindViewHolderByRealPosition(holder: VH, realPosition: Int)

    override fun getItemCount(): Int {
        super.getItemCount()
        if (getRealCount() == 0) {
            return 0
        }
        return INFINITE_LOOP_TOTAL_COUNT
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val realPosition = position.rem(getRealCount())
        return onBindViewHolderByRealPosition(holder, realPosition)

    }

}
