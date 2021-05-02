package com.doublesnatch.domain.interactor

import com.doublesnatch.domain.model.SampleDomain
import io.reactivex.Observable
import io.reactivex.Single

interface IGetSampleUseCase {

    fun execute(): Single<SampleDomain>
    fun getServerResponse (s :String): Observable<String>
}