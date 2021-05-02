package com.doublesnatch.app.ui.basicSample.viewModel

import androidx.lifecycle.MutableLiveData
import com.doublesnatch.app.common.viewModel.IBaseActivityViewModel

interface ISampleFragmentViewModel : IBaseActivityViewModel {
    fun loadData(s: String)
    fun loadGame (): MutableLiveData <Boolean>
}
