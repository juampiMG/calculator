package com.doublesnatch.data.network.gateway.retrofit

import com.doublesnatch.data.network.gateway.IAppAuthGateway
import com.doublesnatch.data.preferences.URLPreferenceManager
import com.doublesnatch.data.network.gateway.retrofit.service.IAuthRestServices

class AppAuthGateway(var mService: IAuthRestServices, var urlPreferenceManager: URLPreferenceManager) : IAppAuthGateway {

}