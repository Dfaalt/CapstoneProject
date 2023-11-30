package com.example.culinaryndo.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.culinaryndo.data.model.LoginResult
import com.example.culinaryndo.data.repository.CulinaryndoRepository

class MainViewModel(private val culinaryndoRepository: CulinaryndoRepository): ViewModel() {

    fun getSession(): LiveData<LoginResult> {
        return culinaryndoRepository.getSession().asLiveData()
    }
}