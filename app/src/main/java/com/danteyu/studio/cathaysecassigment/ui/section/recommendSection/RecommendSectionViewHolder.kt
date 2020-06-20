package com.danteyu.studio.cathaysecassigment.ui.section.recommendSection

import com.danteyu.studio.cathaysecassigment.BR
import com.danteyu.studio.cathaysecassigment.data.model.section.Section
import com.danteyu.studio.cathaysecassigment.databinding.ItemSectionRecommendSectionBinding
import com.danteyu.studio.cathaysecassigment.ui.section.SectionViewHolder
import com.danteyu.studio.cathaysecassigment.ui.section.SectionViewModel

/**
 * Created by George Yu on 2020/6/20.
 */
class RecommendSectionViewHolder(viewDataBinding: ItemSectionRecommendSectionBinding) :
    SectionViewHolder(viewDataBinding) {

    init {
        viewDataBinding.recyclerRecommendSection.adapter = RecommendSectionItemAdapter()
    }

    override fun doBind(section: Section, viewModel: SectionViewModel) {
        viewDataBinding.setVariable(BR.recommendSection, section)
    }
}
