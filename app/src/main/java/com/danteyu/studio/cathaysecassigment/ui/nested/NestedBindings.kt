package com.danteyu.studio.cathaysecassigment.ui.nested

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.danteyu.studio.cathaysecassigment.data.model.nested.NestedItem
import com.danteyu.studio.cathaysecassigment.ui.nested.nestedText.NestedTextAdapter

/**
 * Created by George Yu on 2020/6/28.
 */
@BindingAdapter("nestedItems")
fun bindNestedItems(recyclerView: RecyclerView, items: List<NestedItem>?) {
    if (items == null) return
    (recyclerView.adapter as? NestedAdapter)?.submitList(items)
}

@BindingAdapter("nestedTexts")
fun bindNestedTexts(recyclerView: RecyclerView, items: List<String>?) {
    if (items == null) return
    (recyclerView.adapter as? NestedTextAdapter)?.submitList(items)
}
