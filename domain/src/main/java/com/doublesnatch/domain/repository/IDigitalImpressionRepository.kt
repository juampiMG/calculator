package com.doublesnatch.domain.repository

import com.doublesnatch.domain.model.ImpressionDomain
import io.reactivex.Completable
import io.reactivex.Single

interface IDigitalImpressionRepository {
    fun getDigitalImpression(id: Int): Single<ImpressionDomain>
    fun deleteDigitalImpression(digitalImpression: ImpressionDomain): Completable
    fun addDigitalImpression(digitalImpression: ImpressionDomain): Completable
}