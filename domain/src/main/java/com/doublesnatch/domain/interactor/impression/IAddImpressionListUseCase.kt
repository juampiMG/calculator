package com.doublesnatch.domain.interactor.impression

import com.doublesnatch.domain.model.ImpressionDomain
import io.reactivex.Completable

interface IAddImpressionListUseCase {
    fun execute(impressions: List<ImpressionDomain>): Completable
}