package com.danteyu.studio.cathaysecassigment.ui.section

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewCompat.canScrollVertically
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.danteyu.studio.cathaysecassigment.databinding.FragSectionBinding
import com.danteyu.studio.cathaysecassigment.ext.showToast
import com.danteyu.studio.cathaysecassigment.ui.common.OnSwipeTouchListener
import com.danteyu.studio.cathaysecassigment.ui.section.recommendSection.RecommendSectionViewHolder

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


//            recyclerSection.findViewHolderForAdapterPosition(0)?.itemView?.setOnTouchListener(object :
//                OnSwipeTouchListener(context) {
//
//                override fun onSingleTap() {
//                    requireActivity().showToast("Tap")
//                }
//
//                override fun onSwipe(direction: Direction?): Boolean {
//                    return if (direction == null) {
//                        false
//                    } else {
//                        recyclerSection.requestDisallowInterceptTouchEvent(true)
//                        when (direction) {
//
//                            Direction.RIGHT -> {
//                                requireActivity().showToast("Swipe right")
//                                true
//                            }
//                            Direction.LEFT -> {
//                                requireActivity().showToast("Swipe left")
//                                true
//                            }
//                            Direction.UP -> {
//                                requireActivity().showToast("Swipe up")
//                                true
//                            }
//                            Direction.DOWN -> {
//                                requireActivity().showToast("Swipe down")
//                                true
//                            }
//                        }
//                    }
//                }
//            })
        }

        return viewDataBinding.root
    }
}