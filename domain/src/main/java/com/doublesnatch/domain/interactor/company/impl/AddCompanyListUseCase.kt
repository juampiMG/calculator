package com.doublesnatch.domain.interactor.company.impl

import com.doublesnatch.domain.interactor.company.IAddCompanyListUseCase
import com.doublesnatch.domain.interactor.company.IAddCompanyUseCase
import com.doublesnatch.domain.model.CompanyDomain
import com.doublesnatch.domain.repository.ICompanyRepository
import io.reactivex.Completable
import javax.inject.Inject

class AddCompanyListUseCase
@Inject
constructor() : IAddCompanyListUseCase {
    @Inject
    lateinit var mCompanyRepository: ICompanyRepository

    override fun execute(companies: List<CompanyDomain>): Completable {
        return mCompanyRepository.addCompanyList(companies = companies)
    }
}