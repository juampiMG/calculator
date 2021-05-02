package com.doublesnatch.domain.interactor.company

import com.doublesnatch.domain.model.CompanyDomain
import io.reactivex.Maybe
import io.reactivex.Single

interface IGetAllCompaniesUseCase {
    fun execute(): Single<List<CompanyDomain>>
}