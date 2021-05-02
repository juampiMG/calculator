package com.doublesnatch.domain.interactor.company

import com.doublesnatch.domain.model.CompanyDomain
import io.reactivex.Completable
import io.reactivex.Maybe
import io.reactivex.Single

interface IDeleteCompanyUseCase {
    fun execute(companyDomain: CompanyDomain): Completable
}