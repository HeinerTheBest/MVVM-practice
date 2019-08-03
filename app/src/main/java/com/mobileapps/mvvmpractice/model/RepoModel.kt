package com.mobileapps.mvvmpractice.model

import com.mobileapps.mvvmpractice.model.OnDataReadyCallback
import java.util.*
import kotlin.concurrent.timerTask

class RepoModel {

    fun refreshData(onDataReadyCallBack : OnDataReadyCallback) {

        Timer().schedule(timerTask {
            onDataReadyCallBack.onDataReady("new data")
        }, 2000)
    }



}