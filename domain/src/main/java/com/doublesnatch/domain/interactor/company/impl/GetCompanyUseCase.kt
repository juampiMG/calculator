package com.doublesnatch.domain.interactor.company.impl

import com.doublesnatch.domain.interactor.company.IGetCompanyUseCase
import com.doublesnatch.domain.model.CompanyDomain
import com.doublesnatch.domain.repository.ICompanyRepository
import io.reactivex.Maybe
import io.reactivex.Single
import javax.inject.Inject

class GetCompanyUseCase
@Inject
constructor() : IGetCompanyUseCase {
    @Inject
    lateinit var mCompanyRepository: ICompanyRepository

    override fun execute(id: Int): Single<CompanyDomain> {
        return mCompanyRepository.getCompany(id)
    }
}