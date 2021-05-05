package com.doublesnatch.domain.interactor.typeImpression

import io.reactivex.Completable

interface IDeleteAllTypeImpressionUseCase {
    fun execute(): Completable
}