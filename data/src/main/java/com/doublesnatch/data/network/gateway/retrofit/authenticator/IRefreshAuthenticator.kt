package com.doublesnatch.data.network.gateway.retrofit.authenticator

import io.reactivex.Single

interface IRefreshAuthenticator {
    fun userOauthRefreshedBearerToken(): Single<String>
    fun logOut()
}