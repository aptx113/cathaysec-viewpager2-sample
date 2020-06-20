package com.danteyu.studio.cathaysecassigment.ui.section

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.danteyu.studio.cathaysecassigment.data.model.section.Section

/**
 * Created by George Yu on 2020/6/20.
 */
@BindingAdapter("sectionItems")
fun bindSectionItems(recyclerView: RecyclerView, sectionItems: List<Section>?) {
    if (sectionItems == null) return
    (recyclerView.adapter as SectionAdapter).submitList(sectionItems)
}