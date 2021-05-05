package com.doublesnatch.domain.interactor.impression

import com.doublesnatch.domain.model.CompanyDomain
import com.doublesnatch.domain.model.ImpressionDomain
import io.reactivex.Completable

interface IAddImpressionUseCase {
    fun execute(impression: ImpressionDomain): Completable
}