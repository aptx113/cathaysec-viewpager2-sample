package com.danteyu.studio.cathaysecassigment.ui.section.recommendSection

import androidx.recyclerview.widget.RecyclerView
import com.danteyu.studio.cathaysecassigment.data.model.section.RecommendSectionItem
import com.danteyu.studio.cathaysecassigment.databinding.ItemSectionRecommendSectionItemBinding

/**
 * Created by George Yu on 2020/6/20.
 */
class RecommendSectionItemViewHolder(private var binding: ItemSectionRecommendSectionItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: RecommendSectionItem) {
        binding.apply {
            recommendItem = item
            executePendingBindings()
        }
    }
}
