package com.doublesnatch.data.network.gateway.retrofit

import com.doublesnatch.data.entity.sample.SampleEntity
import com.doublesnatch.data.network.gateway.IAppGateway
import com.doublesnatch.data.preferences.URLPreferenceManager
import com.doublesnatch.data.network.gateway.retrofit.service.IRestServices
import io.reactivex.Single

class AppGateway(private val mService: IRestServices, private val urlPreferenceManager: URLPreferenceManager) : IAppGateway {

    override fun getSamples(): Single<SampleEntity> {
        return mService.getSamples(urlPreferenceManager.getURL() + "games")
    }
}