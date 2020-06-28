package com.danteyu.studio.cathaysecassigment.ui.nested.nestedText

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.danteyu.studio.cathaysecassigment.databinding.ItemNestedTextBinding
import com.danteyu.studio.cathaysecassigment.ui.common.SingleFieldDiffUtils

/**
 * Created by George Yu on 2020/6/28.
 */
class NestedTextAdapter :
    ListAdapter<String, NestedTextViewHolder>(SingleFieldDiffUtils<String> { it }) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NestedTextViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ItemNestedTextBinding.inflate(layoutInflater, parent, false).run {
            NestedTextViewHolder(this)
        }
    }

    override fun onBindViewHolder(holder: NestedTextViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}
