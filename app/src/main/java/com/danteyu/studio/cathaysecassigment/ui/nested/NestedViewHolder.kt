package com.danteyu.studio.cathaysecassigment.ui.nested

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.danteyu.studio.cathaysecassigment.data.model.nested.NestedItem
import com.danteyu.studio.cathaysecassigment.ui.nested.NestedViewModel

/**
 * Created by George Yu on 2020/6/28.
 */
abstract class NestedViewHolder(protected val viewDataBinding: ViewDataBinding) :
    RecyclerView.ViewHolder(viewDataBinding.root) {

    protected abstract fun doBind(nestedItem: NestedItem, viewModel: NestedViewModel)

    fun bind(nestedItem: NestedItem, viewModel: NestedViewModel) {
        doBind(nestedItem, viewModel)
        viewDataBinding.executePendingBindings()
    }

}
