package com.danteyu.studio.cathaysecassigment.ui.section

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.danteyu.studio.cathaysecassigment.R
import com.danteyu.studio.cathaysecassigment.data.model.section.ActionSection
import com.danteyu.studio.cathaysecassigment.data.model.section.Section
import com.danteyu.studio.cathaysecassigment.databinding.ItemSectionActionSectionBinding
import com.danteyu.studio.cathaysecassigment.ui.common.SingleFieldDiffUtils
import com.danteyu.studio.cathaysecassigment.ui.section.actionSection.ActionSectionViewHolder
import java.lang.ClassCastException

/**
 * Created by George Yu on 2020/6/20.
 */
class SectionAdapter(private val viewModel: SectionViewModel) :
    ListAdapter<Section, SectionViewHolder>(SectionDifUtlCallback()) {

    companion object {

        const val TYPE_ACTION = R.layout.item_section_action_section
        const val TYPE_RECOMMEND = R.layout.item_section_recommend_section
    }

    override fun getItemViewType(position: Int): Int {
        return when (getItem(position)) {
            is ActionSection -> TYPE_ACTION

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SectionViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            TYPE_ACTION -> ItemSectionActionSectionBinding.inflate(layoutInflater, parent, false)
                .run {
                    ActionSectionViewHolder(this)
                }
            else -> throw ClassCastException("Unknown viewType $viewType")
        }
    }

    override fun onBindViewHolder(holder: SectionViewHolder, position: Int) {
        holder.bind(getItem(position), viewModel)
    }

    class SectionDifUtlCallback : DiffUtil.ItemCallback<Section>() {
        override fun areItemsTheSame(oldItem: Section, newItem: Section): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: Section, newItem: Section): Boolean {
            return oldItem == newItem
        }

    }
}
