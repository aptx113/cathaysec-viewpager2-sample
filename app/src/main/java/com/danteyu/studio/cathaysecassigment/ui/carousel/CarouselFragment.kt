package com.danteyu.studio.cathaysecassigment.ui.carousel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.danteyu.studio.cathaysecassigment.databinding.FragCarouselBinding

/**
 * Created by George Yu on 2020/8/9.
 */
class CarouselFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = FragCarouselBinding.inflate(inflater, container, false).run {
        root
    }

}