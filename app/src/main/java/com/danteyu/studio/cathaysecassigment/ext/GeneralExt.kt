package com.danteyu.studio.cathaysecassigment.ext

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import com.danteyu.studio.cathaysecassigment.Event
import com.danteyu.studio.cathaysecassigment.EventObserver

/**
 * Created by George Yu on 2020/8/8.
 */
inline fun <reified T> LiveData<Event<T>>.observeEvent(
    owner: LifecycleOwner, crossinline observer: (T) -> Unit
) = observe(owner, EventObserver { observer(it) })
