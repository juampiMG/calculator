package com.doublesnatch.domain.repository

import com.doublesnatch.domain.model.CompanyDomain
import com.doublesnatch.domain.model.SampleDomain
import io.reactivex.Completable
import io.reactivex.Maybe
import io.reactivex.Single

interface ICompanyRepository {
     fun deleteAll (): Completable
     fun getCompany(id: Int): Single<CompanyDomain>
     fun deleteCompany (company: CompanyDomain): Completable
     fun addCompany (company: CompanyDomain): Completable
     fun addCompanyList (companies: List<CompanyDomain>): Completable
     fun getAllCompanies(): Single<List<CompanyDomain>>

}