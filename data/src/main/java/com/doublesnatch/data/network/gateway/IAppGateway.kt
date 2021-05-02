package com.doublesnatch.data.network.gateway

import com.doublesnatch.data.entity.sample.SampleEntity
import io.reactivex.Single


interface IAppGateway {
    fun getSamples(): Single<SampleEntity>
}