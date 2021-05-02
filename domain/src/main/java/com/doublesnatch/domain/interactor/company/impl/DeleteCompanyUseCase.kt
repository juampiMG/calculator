package com.doublesnatch.domain.interactor.company.impl

import com.doublesnatch.domain.interactor.company.IDeleteCompanyUseCase
import com.doublesnatch.domain.interactor.company.IGetCompanyUseCase
import com.doublesnatch.domain.model.CompanyDomain
import com.doublesnatch.domain.repository.ICompanyRepository
import io.reactivex.Completable
import io.reactivex.Maybe
import io.reactivex.Single
import javax.inject.Inject

class DeleteCompanyUseCase
@Inject
constructor() : IDeleteCompanyUseCase {
    @Inject
    lateinit var mCompanyRepository: ICompanyRepository

    override fun execute(companyDomain: CompanyDomain): Completable {
      return mCompanyRepository.deleteCompany(companyDomain)
    }
}