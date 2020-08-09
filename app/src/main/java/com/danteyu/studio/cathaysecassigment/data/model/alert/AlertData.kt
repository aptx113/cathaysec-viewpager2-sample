package com.danteyu.studio.cathaysecassigment.data.model.alert

import android.os.Parcelable
import kotlinx.android.parcel.IgnoredOnParcel
import kotlinx.android.parcel.Parcelize
import java.io.Serializable

/**
 * Created by George Yu on 2020/8/8.
 */
@Parcelize
data class AlertData(
    val content: String,
    val positiveAction: Serializable?,
    val negativeAction: Parcelable?
) : Parcelable {

    @IgnoredOnParcel
    @Suppress("UNCHECKED_CAST")
    val performPositiveAction = positiveAction as? () -> Unit

    @Suppress("UNCHECKED_CAST")
    fun performNegativeAction() = negativeAction as? () -> Unit

    companion object {

        fun create(
            content: String,
            positiveAction: () -> Unit,
            negativeAction: () -> Unit
        ): AlertData =
            AlertData(content, positiveAction as? Serializable, negativeAction as? Parcelable)
    }
}
