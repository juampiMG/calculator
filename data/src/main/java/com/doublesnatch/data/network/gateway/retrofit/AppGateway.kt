package com.doublesnatch.data.network.gateway.retrofit

import com.doublesnatch.data.network.gateway.IAppGateway
import com.doublesnatch.data.network.gateway.retrofit.service.IRestServices
import com.doublesnatch.data.preferences.URLPreferenceManager

class AppGateway(private val mService: IRestServices, private val urlPreferenceManager: URLPreferenceManager) : IAppGateway {

//    override fun getSamples(): Single<SampleEntity> {
//        return mService.getSamples(urlPreferenceManager.getURL() + "games")
//    }
}