package com.danteyu.studio.cathaysecassigment.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.danteyu.studio.cathaysecassigment.data.WeekItem
import com.danteyu.studio.cathaysecassigment.databinding.ItemHomeBinding

/**
 * Created by George Yu on 2020/4/27.
 */
class HomeListItemAdapter :
    ListAdapter<WeekItem, HomeListItemAdapter.WeekItemViewHolder>(DiffCallback) {

    class WeekItemViewHolder(private var binding: ItemHomeBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(weekItem: WeekItem) {
            binding.weekItem = weekItem
            binding.executePendingBindings()

        }
    }

    companion object DiffCallback : DiffUtil.ItemCallback<WeekItem>() {
        override fun areItemsTheSame(oldItem: WeekItem, newItem: WeekItem): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: WeekItem, newItem: WeekItem): Boolean {
            return oldItem.date == newItem.date
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeekItemViewHolder {
        return WeekItemViewHolder(
            ItemHomeBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: WeekItemViewHolder, position: Int) {
        val weekItem = getItem(position)

        holder.bind(weekItem)
    }
}