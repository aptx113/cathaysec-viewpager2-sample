package com.danteyu.studio.cathaysecassigment.ui.section

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.danteyu.studio.cathaysecassigment.data.model.section.Section

/**
 * Created by George Yu on 2020/6/20.
 */
abstract class SectionViewHolder(protected val viewDataBinding: ViewDataBinding) :
    RecyclerView.ViewHolder(viewDataBinding.root) {

    protected abstract fun doBind(section: Section, viewModel: SectionViewModel)

    fun bind(section: Section, viewModel: SectionViewModel) {
        doBind(section, viewModel)
        viewDataBinding.executePendingBindings()
    }
}
