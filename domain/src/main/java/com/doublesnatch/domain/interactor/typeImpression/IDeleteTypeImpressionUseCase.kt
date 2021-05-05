package com.doublesnatch.domain.interactor.typeImpression

import com.doublesnatch.domain.model.TypeImpressionDomain
import io.reactivex.Completable

interface IDeleteTypeImpressionUseCase {
    fun execute(typeImpression: TypeImpressionDomain): Completable
}