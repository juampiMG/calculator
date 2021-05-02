package com.doublesnatch.data.entity.mapper

import com.doublesnatch.data.entity.Company
import com.doublesnatch.domain.model.CompanyDomain
import com.doublesnatch.domain.model.SampleDomain
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CompanyEntityMapper
@Inject
constructor() : BaseModelDataMapper<Company, CompanyDomain>() {

    override fun transform(source: Company): CompanyDomain {
       return CompanyDomain(source.id, source.name)

    }

    override fun inverseTransform(source: CompanyDomain): Company {
        return Company (source.id, source.name)
    }

}