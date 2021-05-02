package com.doublesnatch.domain.repository

import com.doublesnatch.domain.model.TypeImpressionDomain
import io.reactivex.Completable
import io.reactivex.Single

interface ISerigraphyImpressionRepository {
    fun getSerigraphyImpression(id: Int): Single<TypeImpressionDomain>
    fun deleteSerigraphyImpression(serigraphyImpression: TypeImpressionDomain): Completable
    fun addSerigraphyImpression(serigraphyImpression: TypeImpressionDomain): Completable
}