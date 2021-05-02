package com.doublesnatch.data.entity.mapper

import com.doublesnatch.data.entity.Product
import com.doublesnatch.domain.model.ProductDomain
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ProductEntityMapper
@Inject
constructor() : BaseModelDataMapper<Product, ProductDomain>() {

    override fun transform(source: Product): ProductDomain {
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

    override fun inverseTransform(source: ProductDomain): Product {
        return Product(
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