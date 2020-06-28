package com.danteyu.studio.cathaysecassigment.ui.nested.nestedColor

import androidx.databinding.ViewDataBinding
import androidx.databinding.library.baseAdapters.BR
import com.danteyu.studio.cathaysecassigment.data.model.nested.NestedItem
import com.danteyu.studio.cathaysecassigment.ui.nested.NestedViewHolder
import com.danteyu.studio.cathaysecassigment.ui.nested.NestedViewModel

/**
 * Created by George Yu on 2020/6/28.
 */
class NestedColorViewHolder(viewDataBinding: ViewDataBinding) : NestedViewHolder(viewDataBinding) {
    override fun doBind(nestedItem: NestedItem, viewModel: NestedViewModel) {
        viewDataBinding.setVariable(BR.nestedColor, nestedItem)
    }
}
