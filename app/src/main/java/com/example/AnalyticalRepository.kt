package com.example

import com.example.productflavorexample.BuildConfig

class AnalyticalRepository {

    fun getRepository() : Analytics {
        return if(BuildConfig.FLAVOR == "ChargeAnyWhere")
            FirebaseTrack()
        else
            MixPanel()
    }
}