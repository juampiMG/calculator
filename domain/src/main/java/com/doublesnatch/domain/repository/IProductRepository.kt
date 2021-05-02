package com.doublesnatch.domain.repository

import com.doublesnatch.domain.model.ProductDomain
import io.reactivex.Completable
import io.reactivex.Single

interface IProductRepository {
    fun getProduct(id: Int): Single<ProductDomain>
    fun deleteProduct(productDomain: ProductDomain): Completable
    fun addProduct(Product: ProductDomain): Completable
}