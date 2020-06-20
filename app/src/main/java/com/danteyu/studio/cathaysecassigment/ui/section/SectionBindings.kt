package com.danteyu.studio.cathaysecassigment.ui.section

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.danteyu.studio.cathaysecassigment.data.model.section.RecommendSectionItem
import com.danteyu.studio.cathaysecassigment.data.model.section.Section
import com.danteyu.studio.cathaysecassigment.ui.section.recommendSection.RecommendSectionItemAdapter

/**
 * Created by George Yu on 2020/6/20.
 */
@BindingAdapter("sectionItems")
fun bindSectionItems(recyclerView: RecyclerView, sectionItems: List<Section>?) {
    if (sectionItems == null) return
    (recyclerView.adapter as? SectionAdapter)?.submitList(sectionItems)
}

@BindingAdapter("recommendItems")
fun bindRecommendItems(recyclerView: RecyclerView, recommendItems: List<RecommendSectionItem>?) {
    if (recommendItems == null) return
    (recyclerView.adapter as? RecommendSectionItemAdapter)?.submitList(recommendItems)
}
