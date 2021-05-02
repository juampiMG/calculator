package com.doublesnatch.domain.interactor.company.impl

import com.doublesnatch.domain.interactor.company.IAddCompanyUseCase
import com.doublesnatch.domain.model.CompanyDomain
import com.doublesnatch.domain.repository.ICompanyRepository
import io.reactivex.Completable
import javax.inject.Inject

class AddCompanyUseCase
@Inject
constructor() : IAddCompanyUseCase {
    @Inject
    lateinit var mCompanyRepository: ICompanyRepository

    override fun execute(company: CompanyDomain): Completable {
        return mCompanyRepository.addCompany(company = company)
    }
}