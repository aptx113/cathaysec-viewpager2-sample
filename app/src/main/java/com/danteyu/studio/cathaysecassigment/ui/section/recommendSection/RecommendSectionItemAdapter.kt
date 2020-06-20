package com.danteyu.studio.cathaysecassigment.ui.section.recommendSection

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.danteyu.studio.cathaysecassigment.data.model.section.RecommendSectionItem
import com.danteyu.studio.cathaysecassigment.databinding.ItemSectionRecommendSectionItemBinding

/**
 * Created by George Yu on 2020/6/20.
 */
class RecommendSectionItemAdapter :
    ListAdapter<RecommendSectionItem, RecommendSectionItemViewHolder>(
        RecommendSectionItemDiffUtilCallback()
    ) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecommendSectionItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ItemSectionRecommendSectionItemBinding.inflate(layoutInflater, parent, false).run {
            RecommendSectionItemViewHolder(this)
        }
    }

    override fun onBindViewHolder(holder: RecommendSectionItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class RecommendSectionItemDiffUtilCallback : DiffUtil.ItemCallback<RecommendSectionItem>() {

        override fun areItemsTheSame(
            oldItem: RecommendSectionItem,
            newItem: RecommendSectionItem
        ): Boolean {
            return oldItem.title == newItem.title
        }

        override fun areContentsTheSame(
            oldItem: RecommendSectionItem,
            newItem: RecommendSectionItem
        ): Boolean {
            return oldItem == newItem
        }
    }
}
