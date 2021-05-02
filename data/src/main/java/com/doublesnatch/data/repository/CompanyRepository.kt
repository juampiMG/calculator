package com.doublesnatch.data.repository

import com.doublesnatch.data.database.daos.CompanyDao
import com.doublesnatch.data.entity.mapper.CompanyEntityMapper
import com.doublesnatch.domain.model.CompanyDomain
import com.doublesnatch.domain.repository.ICompanyRepository
import io.reactivex.Completable
import io.reactivex.Single
import javax.inject.Inject

class CompanyRepository
@Inject
constructor(private val companyDao: CompanyDao) : ICompanyRepository {
    @Inject
    internal lateinit var mCompanyEntityMapper: CompanyEntityMapper


    override fun getCompany(id: Int): Single<CompanyDomain> {
        return companyDao.findByCompanyId(id).flatMap { resultEntities -> Single.just((mCompanyEntityMapper.transform(resultEntities))) }
    }

    override fun deleteCompany(company: CompanyDomain): Completable {
        return companyDao.delete(company = mCompanyEntityMapper.inverseTransform(company))
    }

    override fun addCompany(company: CompanyDomain): Completable {
        return companyDao.insert(company = mCompanyEntityMapper.inverseTransform(company))
    }

    override fun getAllCompanies(): Single<List<CompanyDomain>> {
        return companyDao.all.flatMap { resultEntities -> Single.just((mCompanyEntityMapper.transform(resultEntities))) }
    }
}