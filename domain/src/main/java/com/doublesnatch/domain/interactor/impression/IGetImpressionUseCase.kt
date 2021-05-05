package com.doublesnatch.domain.interactor.impression

import com.doublesnatch.domain.model.ImpressionDomain
import io.reactivex.Single

interface IGetImpressionUseCase {
    fun execute(id: Int): Single<ImpressionDomain>
}