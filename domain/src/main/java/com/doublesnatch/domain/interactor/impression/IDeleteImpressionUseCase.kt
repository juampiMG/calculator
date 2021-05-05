package com.doublesnatch.domain.interactor.impression

import com.doublesnatch.domain.model.CompanyDomain
import com.doublesnatch.domain.model.ImpressionDomain
import io.reactivex.Completable
import io.reactivex.Maybe
import io.reactivex.Single

interface IDeleteImpressionUseCase {
    fun execute(impression: ImpressionDomain): Completable
}