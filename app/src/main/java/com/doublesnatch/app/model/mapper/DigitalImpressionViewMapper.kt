package com.doublesnatch.app.model.mapper

import com.doublesnatch.app.model.DigitalImpressionView
import com.doublesnatch.data.entity.mapper.BaseModelDataMapper
import com.doublesnatch.domain.model.DigitalImpressionDomain
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DigitalImpressionViewMapper
@Inject
constructor() : BaseModelDataMapper<DigitalImpressionDomain, DigitalImpressionView>() {

    override fun transform(source: DigitalImpressionDomain): DigitalImpressionView {
        return DigitalImpressionView(
                source.id,
                source.tenXten,
                source.twentyfiveXtwentyfive,
                source.thirtyXforty,
                source.idCompany
        )
    }

    override fun inverseTransform(source: DigitalImpressionView): DigitalImpressionDomain {
        return DigitalImpressionDomain(
                source.id,
                source.tenXten,
                source.twentyfiveXtwentyfive,
                source.thirtyXforty,
                source.idCompany
        )
    }

}