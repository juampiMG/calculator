package com.doublesnatch.data.entity.mapper

import com.doublesnatch.data.entity.SerigraphyImpression
import com.doublesnatch.domain.model.SerigraphyImpressionDomain
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SerigraphyImpressionEntityMapper
@Inject
constructor() : BaseModelDataMapper<SerigraphyImpression, SerigraphyImpressionDomain>() {

    override fun transform(source: SerigraphyImpression): SerigraphyImpressionDomain {
        return SerigraphyImpressionDomain(
                source.id,
                source.oneColor,
                source.twoColors,
                source.threeColors,
                source.fourColors,
                source.fiveColors,
                source.idCompany
        )
    }

    override fun inverseTransform(source: SerigraphyImpressionDomain): SerigraphyImpression {
        return SerigraphyImpression(
                source.id,
                source.oneColor,
                source.twoColors,
                source.threeColors,
                source.fourColors,
                source.fiveColors,
                source.idCompany
        )
    }

}