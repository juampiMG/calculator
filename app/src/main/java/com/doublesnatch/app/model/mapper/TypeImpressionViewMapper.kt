package com.doublesnatch.app.model.mapper

import com.doublesnatch.app.model.TypeImpressionView
import com.doublesnatch.data.entity.mapper.BaseModelDataMapper
import com.doublesnatch.domain.model.TypeImpressionDomain
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TypeImpressionViewMapper
@Inject
constructor() : BaseModelDataMapper<TypeImpressionDomain, TypeImpressionView>() {

    override fun transform(source: TypeImpressionDomain): TypeImpressionView {
        return TypeImpressionView(
                source.id,
               source.type
        )
    }

    override fun inverseTransform(source: TypeImpressionView): TypeImpressionDomain {
        return TypeImpressionDomain(
                source.id,
                source.type
        )
    }

}