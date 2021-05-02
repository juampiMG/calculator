package com.doublesnatch.data.entity.mapper

import com.doublesnatch.data.entity.Impression
import com.doublesnatch.domain.model.ImpressionDomain
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ImpressionEntityMapper
@Inject
constructor() : BaseModelDataMapper<Impression, ImpressionDomain>() {

    override fun transform(source: Impression): ImpressionDomain {
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

    override fun inverseTransform(source: ImpressionDomain): Impression {

        return Impression(
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