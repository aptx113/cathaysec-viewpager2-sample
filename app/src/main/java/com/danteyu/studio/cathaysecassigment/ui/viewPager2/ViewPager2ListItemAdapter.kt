package com.danteyu.studio.cathaysecassigment.ui.viewPager2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.danteyu.studio.cathaysecassigment.data.model.WeekItem
import com.danteyu.studio.cathaysecassigment.databinding.ItemViewPager2ListItemBinding
import com.danteyu.studio.cathaysecassigment.ui.common.InfiniteListAdapter
import com.danteyu.studio.cathaysecassigment.ui.common.SingleFieldDiffUtils

/**
 * Created by George Yu on 2020/4/27.
 */
class ViewPager2ListItemAdapter :
    InfiniteListAdapter<WeekItem, ViewPager2ListItemAdapter.WeekItemViewHolder>(SingleFieldDiffUtils { it }) {

    override fun getRealCount() = itemCount


    class WeekItemViewHolder(private var binding: ItemViewPager2ListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(weekItem: WeekItem) {
            binding.weekItem = weekItem
            binding.executePendingBindings()

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeekItemViewHolder {
        return WeekItemViewHolder(
            ItemViewPager2ListItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

        override fun onBindViewHolderByRealPosition(holder: WeekItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}