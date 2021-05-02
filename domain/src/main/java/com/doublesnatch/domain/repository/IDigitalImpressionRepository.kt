package com.doublesnatch.domain.repository

import com.doublesnatch.domain.model.DigitalImpressionDomain
import io.reactivex.Completable
import io.reactivex.Single

interface IDigitalImpressionRepository {
    fun getDigitalImpression(id: Int): Single<DigitalImpressionDomain>
    fun deleteDigitalImpression(digitalImpression: DigitalImpressionDomain): Completable
    fun addDigitalImpression(digitalImpression: DigitalImpressionDomain): Completable
}