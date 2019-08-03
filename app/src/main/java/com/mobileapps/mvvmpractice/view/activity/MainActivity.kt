package com.mobileapps.mvvmpractice.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.mobileapps.mvvmpractice.viewmodel.MainViewModel
import com.mobileapps.mvvmpractice.R
import com.mobileapps.mvvmpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = ViewModelProviders.of(this).get(MainViewModel:: class.java)
        binding.executePendingBindings()
    }
}
