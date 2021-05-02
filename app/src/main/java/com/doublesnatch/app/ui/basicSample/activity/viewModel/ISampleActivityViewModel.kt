package com.doublesnatch.app.ui.basicSample.activity.viewModel

import androidx.lifecycle.MutableLiveData
import com.doublesnatch.app.common.viewModel.IBaseActivityViewModel


interface ISampleActivityViewModel : IBaseActivityViewModel {
    fun loadServerGame()
    fun showToast(): MutableLiveData<Boolean>
}