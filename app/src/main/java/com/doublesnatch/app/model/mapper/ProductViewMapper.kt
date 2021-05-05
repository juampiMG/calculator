package com.doublesnatch.app.model.mapper

import com.doublesnatch.app.model.ProductView
import com.doublesnatch.data.entity.mapper.BaseModelDataMapper
import com.doublesnatch.domain.model.ProductDomain
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ProductViewMapper
@Inject
constructor() : BaseModelDataMapper<ProductDomain, ProductView>() {

    override fun transform(source: ProductDomain): ProductView {
        return ProductView(
                source.id,
                source.name,
                source.reference,
                source.gender,
                source.type,
                source.detail,
                source.url,
                source.priceTill10,
                source.priceTill25,
                source.priceTill50,
                source.priceTill75,
                source.priceTill100,
                source.priceTill150,
                source.priceTill200,
                source.priceTill250,
                source.priceTill500,
                source.moreThan500)
    }

    override fun inverseTransform(source: ProductView): ProductDomain {
        return ProductDomain(
                source.id,
                source.name,
                source.reference,
                source.gender,
                source.type,
                source.detail,
                source.url,
                source.priceTill10,
                source.priceTill25,
                source.priceTill50,
                source.priceTill75,
                source.priceTill100,
                source.priceTill150,
                source.priceTill200,
                source.priceTill250,
                source.priceTill500,
                source.moreThan500)
    }

}