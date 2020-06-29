package com.danteyu.studio.cathaysecassigment.ui.nested

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.danteyu.studio.cathaysecassigment.CathaysecApplication
import com.danteyu.studio.cathaysecassigment.databinding.FragNestedBinding
import com.danteyu.studio.cathaysecassigment.ext.showToast
import com.danteyu.studio.cathaysecassigment.ui.common.OnSwipeTouchListener

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
        recyclerNested.adapter = NestedAdapter(this@NestedFragment.viewModel)
        val snapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(recyclerNested)
        setupCallback(recyclerNested)

        root
    }

    @SuppressLint("ClickableViewAccessibility")
    private fun setupCallback(recyclerView: RecyclerView) {

        recyclerView.setOnTouchListener(
            object : OnSwipeTouchListener(context) {

                override fun onSingleTap() {
                    TODO("Not yet implemented")
                }

                override fun onSwipe(direction: Direction?): Boolean {
                    when (direction) {
                        Direction.UP -> requireActivity().showToast("Swipe Up")
                        Direction.DOWN -> requireActivity().showToast("Swipe Down")
                        Direction.LEFT -> requireActivity().showToast("Swipe Left")
                        Direction.RIGHT -> requireActivity().showToast("Swipe Right")
                    }
                    return false
                }

            })
    }
}
