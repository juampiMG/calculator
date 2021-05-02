package com.doublesnatch.app.ui.basicSample.viewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.doublesnatch.app.common.reactivex.BaseObservableObserver
import com.doublesnatch.app.common.viewModel.BaseFragmentViewModel
import com.doublesnatch.app.helper.observableSubscribe
import com.doublesnatch.domain.interactor.IGetSampleUseCase
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.Response
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class SampleFragmentViewModel
@Inject
constructor() : BaseFragmentViewModel(), ISampleFragmentViewModel {

    private var mLoadGame = MutableLiveData<Boolean>()

    @Inject
    lateinit var mGetSampleUseCase: IGetSampleUseCase

    override fun loadData(s: String) {
        addDisposable(
                Observable.just(s).debounce(500L, TimeUnit.MILLISECONDS).observableSubscribe(
                        onSuccess = {
                            getResponse(it)
                        }
                )
        )

    }

    private fun getResponse(s: String) {
        addDisposable(
                mGetSampleUseCase.getServerResponse(s)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribeWith(object : BaseObservableObserver<String>() {
                            override fun onError(response: Response<*>?, error: String?, code: Int?) {
                            }

                            override fun onNext(t: String) {
                                Log.d("GET RESULT", t)
                            }

                            override fun onComplete() {
                            }

                        })
        )
    }

    override fun loadGame(): MutableLiveData<Boolean> {
        return mLoadGame
    }

}
