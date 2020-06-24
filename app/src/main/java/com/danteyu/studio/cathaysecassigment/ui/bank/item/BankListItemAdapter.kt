package com.danteyu.studio.cathaysecassigment.ui.bank.item

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.danteyu.studio.cathaysecassigment.data.model.bank.WeekItem
import com.danteyu.studio.cathaysecassigment.databinding.ItemViewBankListBinding
import com.danteyu.studio.cathaysecassigment.ui.common.InfiniteListAdapter
import com.danteyu.studio.cathaysecassigment.ui.common.SingleFieldDiffUtils

/**
 * Created by George Yu on 2020/4/27.
 */
class BankListItemAdapter :
    InfiniteListAdapter<WeekItem, BankListItemAdapter.WeekItemViewHolder>(SingleFieldDiffUtils { it }) {

    class WeekItemViewHolder(private var binding: ItemViewBankListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(weekItem: WeekItem) {
            binding.weekItem = weekItem
            binding.executePendingBindings()

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeekItemViewHolder {
        return WeekItemViewHolder(
            ItemViewBankListBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

        override fun onBindViewHolderByRealPosition(holder: WeekItemViewHolder, realPosition: Int) {
        holder.bind(getItem(realPosition))
    }
}