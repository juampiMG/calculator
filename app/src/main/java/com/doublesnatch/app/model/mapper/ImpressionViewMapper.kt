package com.doublesnatch.app.model.mapper

import com.doublesnatch.app.model.ImpressionView
import com.doublesnatch.data.entity.mapper.BaseModelDataMapper
import com.doublesnatch.domain.model.ImpressionDomain
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ImpressionViewMapper
@Inject
constructor() : BaseModelDataMapper<ImpressionDomain, ImpressionView>() {

    override fun transform(source: ImpressionDomain): ImpressionView {
        return ImpressionView(
                source.id,
                source.priceTill10,
                source.priceTill25,
                source.priceTill50,
                source.priceTill75,
                source.priceTill100,
                source.priceTill150,
                source.priceTill200,
                source.priceTill250,
                source.priceTill500,
                source.moreThan500,
                source.idTypeImpression,
                source.idCompany
        )
    }

    override fun inverseTransform(source: ImpressionView): ImpressionDomain {
        return ImpressionDomain(
                source.id,
                source.priceTill10,
                source.priceTill25,
                source.priceTill50,
                source.priceTill75,
                source.priceTill100,
                source.priceTill150,
                source.priceTill200,
                source.priceTill250,
                source.priceTill500,
                source.moreThan500,
                source.idTypeImpression,
                source.idCompany
        )
    }

}