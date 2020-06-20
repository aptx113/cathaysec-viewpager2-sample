package com.danteyu.studio.cathaysecassigment.data.model.section

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by George Yu on 2020/6/20.
 */
@Parcelize
data class SectionResponse(val sections: List<Section> ) : Parcelable