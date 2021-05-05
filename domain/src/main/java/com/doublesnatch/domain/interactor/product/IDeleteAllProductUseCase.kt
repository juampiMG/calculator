package com.doublesnatch.domain.interactor.product

import io.reactivex.Completable

interface IDeleteAllProductUseCase {
    fun execute(): Completable
}