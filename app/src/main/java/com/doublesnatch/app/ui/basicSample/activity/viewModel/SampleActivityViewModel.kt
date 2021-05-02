package com.doublesnatch.app.ui.basicSample.activity.viewModel

import androidx.lifecycle.MutableLiveData
import com.doublesnatch.app.common.viewModel.BaseActivityViewModel
import com.doublesnatch.domain.interactor.sample.IGetSampleUseCase
import javax.inject.Inject


class SampleActivityViewModel
@Inject
constructor() : BaseActivityViewModel(), ISampleActivityViewModel {

    @Inject
    lateinit var mGetSampleUseCase: IGetSampleUseCase

    private var showToast = MutableLiveData<Boolean>()

    override fun loadServerGame() {

    }

    override fun showToast(): MutableLiveData<Boolean> {
        return showToast
    }

}