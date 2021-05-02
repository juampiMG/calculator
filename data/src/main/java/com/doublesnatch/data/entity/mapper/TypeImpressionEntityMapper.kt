package com.doublesnatch.data.entity.mapper

import com.doublesnatch.data.entity.TypeImpression
import com.doublesnatch.domain.model.TypeImpressionDomain
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TypeImpressionEntityMapper
@Inject
constructor() : BaseModelDataMapper<TypeImpression, TypeImpressionDomain>() {

    override fun transform(source: TypeImpression): TypeImpressionDomain {
        return TypeImpressionDomain(
                source.id,
                source.type
        )
    }

    override fun inverseTransform(source: TypeImpressionDomain): TypeImpression {
        return TypeImpression(
                source.id,
                source.type
        )
    }

}