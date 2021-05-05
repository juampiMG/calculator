package com.doublesnatch.domain.interactor.impression

import com.doublesnatch.domain.model.CompanyDomain
import com.doublesnatch.domain.model.ImpressionDomain
import io.reactivex.Maybe
import io.reactivex.Single

interface IGetAllImpressionsUseCase {
    fun execute(): Single<List<ImpressionDomain>>
}