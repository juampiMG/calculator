package com.doublesnatch.app.model.mapper

import com.doublesnatch.app.model.SerigraphyImpressionView
import com.doublesnatch.data.entity.mapper.BaseModelDataMapper
import com.doublesnatch.domain.model.SerigraphyImpressionDomain
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SerigraphyImpressionViewMapper
@Inject
constructor() : BaseModelDataMapper<SerigraphyImpressionDomain, SerigraphyImpressionView>() {

    override fun transform(source: SerigraphyImpressionDomain): SerigraphyImpressionView {
        return SerigraphyImpressionView(
                source.id,
                source.oneColor,
                source.twoColors,
                source.threeColors,
                source.fourColors,
                source.fiveColors,
                source.idCompany
        )
    }

    override fun inverseTransform(source: SerigraphyImpressionView): SerigraphyImpressionDomain {
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

}