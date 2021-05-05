package com.doublesnatch.domain.repository

import com.doublesnatch.domain.model.ImpressionDomain
import io.reactivex.Completable
import io.reactivex.Single

interface IImpressionRepository {
    fun deleteAll (): Completable
    fun getImpression(id: Int): Single<ImpressionDomain>
    fun deleteImpression(impression: ImpressionDomain): Completable
    fun addImpression(impression: ImpressionDomain): Completable
    fun addImpressionList(impressions: List<ImpressionDomain>): Completable
    fun getAllImpression(): Single<List<ImpressionDomain>>
}