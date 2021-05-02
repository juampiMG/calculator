package com.doublesnatch.domain.interactor.company.impl

import com.doublesnatch.domain.interactor.company.IGetAllCompaniesUseCase
import com.doublesnatch.domain.interactor.company.IGetCompanyUseCase
import com.doublesnatch.domain.model.CompanyDomain
import com.doublesnatch.domain.repository.ICompanyRepository
import io.reactivex.Maybe
import io.reactivex.Single
import javax.inject.Inject

class GetAllCompaniesUseCase
@Inject
constructor() : IGetAllCompaniesUseCase {
    @Inject
    lateinit var mCompanyRepository: ICompanyRepository

    override fun execute(): Single<List<CompanyDomain>> {
        return mCompanyRepository.getAllCompanies()
    }
}