package com.doublesnatch.app.model.mapper

import com.doublesnatch.app.model.CompanyView
import com.doublesnatch.data.entity.mapper.BaseModelDataMapper
import com.doublesnatch.domain.model.CompanyDomain
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CompanyViewMapper
@Inject
constructor() : BaseModelDataMapper<CompanyDomain, CompanyView>() {

    override fun transform(source: CompanyDomain): CompanyView {
        return CompanyView(source.id, source.name)

    }

    override fun inverseTransform(source: CompanyView): CompanyDomain {
        return CompanyDomain(source.id, source.name)
    }

}