package com.danteyu.studio.cathaysecassigment.ui.bank.item

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.danteyu.studio.cathaysecassigment.databinding.FragmentBankImageBinding
import com.danteyu.studio.cathaysecassigment.ui.bank.BankFragment
import com.danteyu.studio.cathaysecassigment.ui.bank.VIEWPAGER2_LIST_PAGE_INDEX

/**
 * Created by George Yu on 2020/4/27.
 */
class BankImageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentBankImageBinding.inflate(inflater, container, false)

        binding.buttonHomeSwitch.setOnClickListener {
            (parentFragment as BankFragment).setupDestination(
                VIEWPAGER2_LIST_PAGE_INDEX
            )
        }

        return binding.root
    }
}