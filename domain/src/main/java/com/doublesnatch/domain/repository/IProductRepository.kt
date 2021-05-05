package com.doublesnatch.domain.repository

import com.doublesnatch.domain.model.ProductDomain
import io.reactivex.Completable
import io.reactivex.Single

interface IProductRepository {
    fun deleteAll (): Completable
    fun getProduct(id: Int): Single<ProductDomain>
    fun deleteProduct(product: ProductDomain): Completable
    fun addProduct(product: ProductDomain): Completable
    fun addProductList(products: List<ProductDomain>): Completable
    fun getAllProduct(): Single<List<ProductDomain>>
}