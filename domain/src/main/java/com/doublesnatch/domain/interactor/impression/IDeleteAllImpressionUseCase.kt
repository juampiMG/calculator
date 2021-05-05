package com.doublesnatch.domain.interactor.impression

import com.doublesnatch.domain.model.ImpressionDomain
import io.reactivex.Completable

interface IDeleteAllImpressionUseCase {
    fun execute(): Completable
}