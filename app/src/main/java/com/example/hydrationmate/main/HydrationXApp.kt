package com.example.hydrationmate.main

import android.app.Application
import com.example.hydrationmate.Models.HydrationStore
import timber.log.Timber

class HydrationXApp : Application()  {


    lateinit var hydration_store: HydrationStore

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())

      // hydration_store = HydrateManager

        Timber.i("HydrationXApp Created")


    }


}