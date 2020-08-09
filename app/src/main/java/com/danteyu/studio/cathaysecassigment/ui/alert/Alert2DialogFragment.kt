package com.danteyu.studio.cathaysecassigment.ui.alert

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatDialogFragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.danteyu.studio.cathaysecassigment.databinding.DialogAlertBinding
import com.danteyu.studio.cathaysecassigment.ext.observeEvent

/**
 * Created by George Yu on 2020/8/8.
 */
class Alert2DialogFragment : AppCompatDialogFragment() {

    private val viewModel by viewModels<Alert2DialogViewModel>()
    private val args by navArgs<Alert2DialogFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val viewDataBinding = DialogAlertBinding.inflate(inflater, container, false).apply {
            viewModel = this@Alert2DialogFragment.viewModel
        }

        viewModel.isPositiveBtnClicked.observeEvent(viewLifecycleOwner) {
            if (args.alertArgs.performPositiveAction == null) findNavController().navigateUp()
            args.alertArgs.performPositiveAction?.invoke()
        }

        viewModel.isNegativeBtnClicked.observeEvent(viewLifecycleOwner) {
            if (args.alertArgs.performNegativeAction() == null) dismiss()
        }

        return viewDataBinding.root
    }
}
