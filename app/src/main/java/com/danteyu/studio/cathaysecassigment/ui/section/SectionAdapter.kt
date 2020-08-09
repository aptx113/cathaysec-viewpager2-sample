package com.danteyu.studio.cathaysecassigment.ui.section

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.ListAdapter
import com.danteyu.studio.cathaysecassigment.CathaysecApplication
import com.danteyu.studio.cathaysecassigment.R
import com.danteyu.studio.cathaysecassigment.data.model.section.ActionSection
import com.danteyu.studio.cathaysecassigment.data.model.section.RecommendSection
import com.danteyu.studio.cathaysecassigment.data.model.section.Section
import com.danteyu.studio.cathaysecassigment.databinding.ItemSectionRecommendSectionBinding
import com.danteyu.studio.cathaysecassigment.ui.common.OnSwipeTouchListener
import com.danteyu.studio.cathaysecassigment.ui.common.SingleFieldDiffUtils
import com.danteyu.studio.cathaysecassigment.ui.section.recommendSection.RecommendSectionViewHolder
import com.danteyu.studio.cathaysecassigment.ui.section.actionSection.ActionSectionViewHolder
import com.google.android.material.internal.ContextUtils.getActivity

/**
 * Created by George Yu on 2020/6/20.
 */
class SectionAdapter(private val viewModel: SectionViewModel) :
    ListAdapter<Section, SectionViewHolder>(SingleFieldDiffUtils<Section> { it }) {

    companion object {

        const val TYPE_ACTION = R.layout.item_section_action_section
        const val TYPE_RECOMMEND = R.layout.item_section_recommend_section
    }

    override fun getItemViewType(position: Int): Int {
        return when (getItem(position)) {
            is ActionSection -> TYPE_ACTION
            is RecommendSection -> TYPE_RECOMMEND

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SectionViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        return DataBindingUtil.inflate<ViewDataBinding>(layoutInflater, viewType, parent, false)
            .run {
                when (viewType) {
                    TYPE_ACTION -> ActionSectionViewHolder(this ).apply {
                        itemView.setOnTouchListener(object :
                OnSwipeTouchListener(parent.context) {

                override fun onSwipe(direction: Direction?): Boolean {
                    return if (direction == null) {
                        false
                    } else {

                        when (direction) {

                            Direction.RIGHT -> {

                                true
                            }
                            Direction.LEFT -> {

                                true
                            }
                            Direction.UP -> {

                                true
                            }
                            Direction.DOWN -> {

                                true
                            }
                        }
                    }
                }
            })
                    }
                    TYPE_RECOMMEND -> RecommendSectionViewHolder(this as ItemSectionRecommendSectionBinding)
                    else -> throw ClassCastException("Unknown viewType $viewType")
                }
            }
    }

    override fun onBindViewHolder(holder: SectionViewHolder, position: Int) {
        holder.bind(getItem(position), viewModel)
    }
}
