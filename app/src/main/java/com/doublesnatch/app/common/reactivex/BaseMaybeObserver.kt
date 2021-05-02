package com.doublesnatch.app.common.reactivex

import com.doublesnatch.data.utils.ErrorManager
import io.reactivex.annotations.NonNull
import io.reactivex.observers.DisposableMaybeObserver
import retrofit2.Response
import java.util.*

abstract class BaseMaybeObserver<T> : DisposableMaybeObserver<T>(), ErrorManager.ErrorManagerCallback {

    override fun onError(@NonNull e: Throwable) {
        val errorManager = ErrorManager(this)
        errorManager.handleError(e)
    }

    override fun onErrorManager(response: Response<*>?, error: String?, code: Int?) {
        error?.let {
            if (it.toLowerCase(Locale.ROOT).contains("HTTP") && code == 404) {
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