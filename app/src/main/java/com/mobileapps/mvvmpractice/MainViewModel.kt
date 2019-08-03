package com.mobileapps.mvvmpractice

import androidx.databinding.ObservableField


class MainViewModel{

    var repoModel : RepoModel = RepoModel()

    val text = ObservableField("old data")
    val isLoading = ObservableField(false)


    fun refresh(){
        isLoading.set(true)
        repoModel.refreshData(object : OnDataReadyCallback{
            override fun onDataReady(data: String) {
                isLoading.set(false)
                text.set(data)
            }
        })
    }

}