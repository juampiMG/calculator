package com.doublesnatch.domain.repository

import com.doublesnatch.domain.model.SerigraphyImpressionDomain
import io.reactivex.Completable
import io.reactivex.Single

interface ISerigraphyImpressionRepository {
    fun getSerigraphyImpression(id: Int): Single<SerigraphyImpressionDomain>
    fun deleteSerigraphyImpression(serigraphyImpression: SerigraphyImpressionDomain): Completable
    fun addSerigraphyImpression(serigraphyImpression: SerigraphyImpressionDomain): Completable
}