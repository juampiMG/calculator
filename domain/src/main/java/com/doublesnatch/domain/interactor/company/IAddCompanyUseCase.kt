package com.doublesnatch.domain.interactor.company

import com.doublesnatch.domain.model.CompanyDomain
import io.reactivex.Completable

interface IAddCompanyUseCase {
    fun execute(company: CompanyDomain): Completable
}