package com.danteyu.studio.cathaysecassigment.ui.section

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewCompat.canScrollVertically
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.danteyu.studio.cathaysecassigment.databinding.FragSectionBinding

/**
 * Created by George Yu on 2020/6/20.
 */
class SectionFragment : Fragment() {

    val viewModel by viewModels<SectionViewModel>()
    private lateinit var viewDataBinding: FragSectionBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewDataBinding = FragSectionBinding.inflate(inflater, container, false).apply {
            lifecycleOwner = this@SectionFragment.viewLifecycleOwner
            viewModel = this@SectionFragment.viewModel
            recyclerSection.adapter = SectionAdapter(this@SectionFragment.viewModel)
        }

        return viewDataBinding.root
    }
}