package com.danteyu.studio.cathaysecassigment.ui.nested

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.danteyu.studio.cathaysecassigment.databinding.FragNestedBinding

/**
 * Created by George Yu on 2020/6/27.
 */
class NestedFragment : Fragment() {

    private val viewModel by viewModels<NestedViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = FragNestedBinding.inflate(inflater, container, false).run {
        viewModel = this@NestedFragment.viewModel
        lifecycleOwner = this@NestedFragment.viewLifecycleOwner
        root
    }
}