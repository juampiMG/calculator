package com.doublesnatch.domain.interactor.typeImpression

import com.doublesnatch.domain.model.TypeImpressionDomain
import io.reactivex.Completable

interface IAddTypeImpressionListUseCase {
    fun execute(typeImpressions: List<TypeImpressionDomain>): Completable
}