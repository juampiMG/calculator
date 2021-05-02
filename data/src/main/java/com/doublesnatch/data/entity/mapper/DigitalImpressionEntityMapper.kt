package com.doublesnatch.data.entity.mapper

import com.doublesnatch.data.entity.DigitalImpression
import com.doublesnatch.domain.model.DigitalImpressionDomain
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DigitalImpressionEntityMapper
@Inject
constructor() : BaseModelDataMapper<DigitalImpression, DigitalImpressionDomain>() {

    override fun transform(source: DigitalImpression): DigitalImpressionDomain {
        return DigitalImpressionDomain(
                source.id,
                source.tenXten,
                source.twentyfiveXtwentyfive,
                source.thirtyXforty,
                source.idCompany
        )
    }

    override fun inverseTransform(source: DigitalImpressionDomain): DigitalImpression {

        return DigitalImpression(
                source.id,
                source.tenXten,
                source.twentyfiveXtwentyfive,
                source.thirtyXforty,
                source.idCompany
        )
    }

}