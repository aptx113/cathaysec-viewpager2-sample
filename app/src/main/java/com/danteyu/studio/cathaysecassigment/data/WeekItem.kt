package com.danteyu.studio.cathaysecassigment.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by George Yu on 2020/4/27.
 */
@Parcelize
data class WeekItem(val name: String, val date: String) : Parcelable