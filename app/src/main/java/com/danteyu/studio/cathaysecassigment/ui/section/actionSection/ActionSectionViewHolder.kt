package com.danteyu.studio.cathaysecassigment.ui.section.actionSection

import androidx.databinding.ViewDataBinding
import com.danteyu.studio.cathaysecassigment.BR
import com.danteyu.studio.cathaysecassigment.data.model.section.Section
import com.danteyu.studio.cathaysecassigment.ui.section.SectionViewHolder
import com.danteyu.studio.cathaysecassigment.ui.section.SectionViewModel

/**
 * Created by George Yu on 2020/6/20.
 */
class ActionSectionViewHolder(viewDataBinding: ViewDataBinding) :
    SectionViewHolder(viewDataBinding) {
    override fun doBind(section: Section, viewModel: SectionViewModel) {
        viewDataBinding.setVariable(BR.actionSection, section)
    }
}