package com.doublesnatch.domain.repository

import com.doublesnatch.domain.model.TypeImpressionDomain
import io.reactivex.Completable
import io.reactivex.Single

interface ITypeImpressionRepository {
    fun deleteAll (): Completable
    fun getTypeImpression(id: Int): Single<TypeImpressionDomain>
    fun deleteTypeImpression(typeImpression: TypeImpressionDomain): Completable
    fun addTypeImpression(typeImpression: TypeImpressionDomain): Completable
    fun addTypeImpressionList(typeImpressions: List<TypeImpressionDomain>): Completable
    fun getAllTypeImpression(): Single<List<TypeImpressionDomain>>
}