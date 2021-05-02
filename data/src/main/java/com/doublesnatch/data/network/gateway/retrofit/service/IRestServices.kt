package com.doublesnatch.data.network.gateway.retrofit.service

import com.doublesnatch.data.entity.sample.SampleEntity
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Url

/**
 * Services without authentication at the header
 */
interface IRestServices {
    @GET
    fun getSamples(@Url url: String): Single<SampleEntity>
}