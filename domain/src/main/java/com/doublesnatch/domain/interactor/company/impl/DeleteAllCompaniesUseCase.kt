package com.doublesnatch.domain.interactor.company.impl

import com.doublesnatch.domain.interactor.company.IDeleteAllCompaniesUseCase
import com.doublesnatch.domain.repository.ICompanyRepository
import io.reactivex.Completable
import javax.inject.Inject

class DeleteAllCompaniesUseCase
@Inject
constructor() : IDeleteAllCompaniesUseCase {
    @Inject
    lateinit var mCompanyRepository: ICompanyRepository

    override fun execute(): Completable {
        return mCompanyRepository.deleteAll()
    }
}