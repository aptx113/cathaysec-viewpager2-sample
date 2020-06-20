package com.danteyu.studio.cathaysecassigment

import android.app.Application
import kotlin.properties.Delegates

/**
 * Created by George Yu on 2020/6/20.
 */
class CathaysecApplication : Application() {

    companion object {
        var instance: Application by Delegates.notNull()
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}