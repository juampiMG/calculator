package com.doublesnatch.domain.interactor.typeImpression

import com.doublesnatch.domain.model.CompanyDomain
import com.doublesnatch.domain.model.TypeImpressionDomain
import io.reactivex.Maybe
import io.reactivex.Single

interface IGetAllTypeImpressionsUseCase {
    fun execute(): Single<List<TypeImpressionDomain>>
}