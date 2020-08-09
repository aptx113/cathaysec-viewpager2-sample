package com.danteyu.studio.cathaysecassigment.ui.nested.nestedText

import androidx.recyclerview.widget.RecyclerView
import com.danteyu.studio.cathaysecassigment.databinding.ItemNestedTextBinding

/**
 * Created by George Yu on 2020/6/28.
 */
class NestedTextViewHolder(private var viewDataBinding: ItemNestedTextBinding) :
    RecyclerView.ViewHolder(viewDataBinding.root) {

    fun bind(text: String) {
        viewDataBinding.text = text
        viewDataBinding.executePendingBindings()
    }
}
