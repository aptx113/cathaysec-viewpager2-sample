package com.danteyu.studio.cathaysecassigment.ui.nested

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.ListAdapter
import com.danteyu.studio.cathaysecassigment.R
import com.danteyu.studio.cathaysecassigment.data.model.nested.NestedColor
import com.danteyu.studio.cathaysecassigment.data.model.nested.NestedItem
import com.danteyu.studio.cathaysecassigment.data.model.nested.NestedTexts
import com.danteyu.studio.cathaysecassigment.databinding.ItemNestedTextsBinding
import com.danteyu.studio.cathaysecassigment.ui.common.SingleFieldDiffUtils
import com.danteyu.studio.cathaysecassigment.ui.nested.nestedColor.NestedColorViewHolder
import com.danteyu.studio.cathaysecassigment.ui.nested.nestedText.NestedTextsViewHolder

/**
 * Created by George Yu on 2020/6/28.
 */
class NestedAdapter(private val viewModel: NestedViewModel) :
    ListAdapter<NestedItem, NestedViewHolder>(SingleFieldDiffUtils<NestedItem> { it }) {

    companion object {

        const val TYPE_COLOR = R.layout.item_nested_color
        const val TYPE_TEXTS = R.layout.item_nested_texts
    }

    override fun getItemViewType(position: Int): Int {
        return when (getItem(position)) {

            is NestedColor -> TYPE_COLOR
            is NestedTexts -> TYPE_TEXTS
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NestedViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return DataBindingUtil.inflate<ViewDataBinding>(layoutInflater, viewType, parent, false)
            .run {
                when (viewType) {

                    TYPE_COLOR -> NestedColorViewHolder(this)
                    TYPE_TEXTS -> NestedTextsViewHolder(this as ItemNestedTextsBinding)
                    else -> throw ClassCastException("Unknown viewType $viewType")
                }
            }
    }

    override fun onBindViewHolder(holder: NestedViewHolder, position: Int) {
        holder.bind(getItem(position), viewModel)
    }

}
