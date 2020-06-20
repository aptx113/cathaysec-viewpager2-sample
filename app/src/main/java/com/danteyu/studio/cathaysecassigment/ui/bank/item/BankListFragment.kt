package com.danteyu.studio.cathaysecassigment.ui.bank.item

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.danteyu.studio.cathaysecassigment.data.model.bank.WeekItem
import com.danteyu.studio.cathaysecassigment.databinding.FragmentBankListBinding

/**
 * Created by George Yu on 2020/4/27.
 */
class BankListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentBankListBinding.inflate(inflater, container, false)

        val adapter =
            BankListItemAdapter()

        val weekItemList = listOf(
            WeekItem(
                "Item1",
                "2020/04/06 (Monday)"
            ),
            WeekItem(
                "Item2",
                "2020/04/05 (Sunday)"
            ),
            WeekItem(
                "Item3",
                "2020/04/04 (Saturday)"
            ),
            WeekItem(
                "Item4",
                "2020/04/03 (Friday)"
            ),
            WeekItem(
                "Item5",
                "2020/04/02 (Thursday)"
            ),
            WeekItem(
                "Item6",
                "2020/04/01 (Wednesday)"
            ),
            WeekItem(
                "Item7",
                "2020/03/31 (Tuesday)"
            )
        )
        binding.recyclerHome.adapter = adapter

        adapter.submitList(weekItemList)

        return binding.root
    }
}