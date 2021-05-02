package com.doublesnatch.data.repository

import com.doublesnatch.data.entity.mapper.SampleEntityMapper
import com.doublesnatch.data.network.gateway.IAppGateway
import com.doublesnatch.domain.model.SampleDomain
import com.doublesnatch.domain.repository.ISampleRepository
import io.reactivex.Single
import javax.inject.Inject

class SampleRepository
@Inject
constructor(private val mGateway: IAppGateway) : ISampleRepository {
    @Inject
    internal lateinit var mSampleEntityMapper: SampleEntityMapper

    override fun getSamples(): Single<SampleDomain> {
        return mGateway.getSamples().flatMap { resultEntities -> Single.just(mSampleEntityMapper.transform(resultEntities)) }
    }
}