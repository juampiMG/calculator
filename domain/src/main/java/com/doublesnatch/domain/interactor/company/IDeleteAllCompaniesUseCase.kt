package com.doublesnatch.domain.interactor.company

import io.reactivex.Completable

interface IDeleteAllCompaniesUseCase {
    fun execute(): Completable
}