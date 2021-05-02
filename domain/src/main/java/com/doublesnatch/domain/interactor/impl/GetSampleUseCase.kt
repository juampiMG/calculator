package com.doublesnatch.domain.interactor.impl

import com.doublesnatch.domain.interactor.IGetSampleUseCase
import com.doublesnatch.domain.model.SampleDomain
import com.doublesnatch.domain.repository.ISampleRepository
import io.reactivex.Observable
import io.reactivex.Single
import javax.inject.Inject

class GetSampleUseCase
@Inject
constructor() : IGetSampleUseCase {

    @Inject
    internal lateinit var mSampleRepository: ISampleRepository

    override fun execute(): Single<SampleDomain> {
        return mSampleRepository.getSamples()
    }

    override fun getServerResponse(s: String): Observable<String> {
        return Observable.just("SENT AND RETURN OBSERVABLE  $s")
    }
}