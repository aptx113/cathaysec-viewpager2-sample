package com.danteyu.studio.cathaysecassigment.ui.nested.nestedText

import androidx.databinding.library.baseAdapters.BR
import com.danteyu.studio.cathaysecassigment.data.model.nested.NestedItem
import com.danteyu.studio.cathaysecassigment.databinding.ItemNestedTextsBinding
import com.danteyu.studio.cathaysecassigment.ui.nested.NestedViewHolder
import com.danteyu.studio.cathaysecassigment.ui.nested.NestedViewModel

/**
 * Created by George Yu on 2020/6/28.
 */

class NestedTextsViewHolder(viewDataBinding: ItemNestedTextsBinding) :
    NestedViewHolder(viewDataBinding) {

    init {
        viewDataBinding.recyclerNestedText.adapter = NestedTextAdapter()
    }

    override fun doBind(nestedItem: NestedItem, viewModel: NestedViewModel) {
        viewDataBinding.setVariable(BR.nestedTexts, nestedItem)
    }
}
