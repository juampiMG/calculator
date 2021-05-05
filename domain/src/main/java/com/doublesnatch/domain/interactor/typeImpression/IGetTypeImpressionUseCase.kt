package com.doublesnatch.domain.interactor.typeImpression

import com.doublesnatch.domain.model.TypeImpressionDomain
import io.reactivex.Single

interface IGetTypeImpressionUseCase {
    fun execute(id: Int): Single<TypeImpressionDomain>
}