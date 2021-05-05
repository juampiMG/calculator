package com.doublesnatch.domain.interactor.company

import com.doublesnatch.domain.model.CompanyDomain
import io.reactivex.Completable

interface IAddCompanyListUseCase {
    fun execute(companies: List<CompanyDomain>): Completable
}