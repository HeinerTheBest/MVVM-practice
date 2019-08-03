package com.mobileapps.mvvmpractice

import java.util.*
import kotlin.concurrent.timerTask

class RepoModel {

    fun refreshData(onDataReadyCallBack : OnDataReadyCallback) {

        Timer().schedule(timerTask {
            onDataReadyCallBack.onDataReady("new data")
        }, 2000)
    }



}