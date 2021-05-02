package com.doublesnatch.app.common.reactivex

import com.doublesnatch.data.utils.ErrorManager
import io.reactivex.annotations.NonNull
import io.reactivex.observers.DisposableObserver
import retrofit2.Response

abstract class BaseObservableObserver<T> : DisposableObserver<T>(), ErrorManager.ErrorManagerCallback {

    var throwable: Throwable? = null

    override fun onError(@NonNull e: Throwable) {
        throwable = e
        val errorManager = ErrorManager(this)
        errorManager.handleError(e)
    }

    override fun onErrorManager(response: Response<*>?, error: String?, code: Int?) {
        error?.let {
            if (it.contains("<html>") && code != 404) {
                onError(null, null, -1)
            } else {
                onError(response, error, code)
            }
        } ?: run {
            onError(response, error, code)
        }
    }

    protected abstract fun onError(response: Response<*>?, error: String?, code: Int?)
}