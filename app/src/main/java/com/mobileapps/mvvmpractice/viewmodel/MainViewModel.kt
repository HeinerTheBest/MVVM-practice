package com.mobileapps.mvvmpractice.viewmodel

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.mobileapps.mvvmpractice.model.OnDataReadyCallback
import com.mobileapps.mvvmpractice.model.RepoModel


class MainViewModel : ViewModel() {

    var repoModel : RepoModel = RepoModel()

    val text = ObservableField("old data")
    val isLoading = ObservableField(false)


    fun refresh(){
        isLoading.set(true)
        repoModel.refreshData(object : OnDataReadyCallback {
            override fun onDataReady(data: String) {
                isLoading.set(false)
                text.set(data)
            }
        })
    }

}