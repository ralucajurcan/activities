package com.example.activityonelifecycle.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SharedViewModel @Inject constructor() : ViewModel() {
    private val _sharedData = MutableLiveData<String>()
    val sharedData: LiveData<String> get() = _sharedData

    fun updateData(value: String) {
        _sharedData.value = value
    }
}