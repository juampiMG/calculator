package com.doublesnatch.data.repository

import com.doublesnatch.data.database.daos.ProductDao
import com.doublesnatch.data.entity.mapper.ProductEntityMapper
import com.doublesnatch.domain.model.ProductDomain
import com.doublesnatch.domain.repository.IProductRepository
import io.reactivex.Completable
import io.reactivex.Single
import javax.inject.Inject

class ProductRepository
@Inject
constructor(private val productDao: ProductDao) : IProductRepository {
    @Inject
    internal lateinit var mProductEntityMapper: ProductEntityMapper

    override fun getProduct(id: Int): Single<ProductDomain> {
        return productDao.findByProductId(id).flatMap { resultEntities -> Single.just(mProductEntityMapper.transform(resultEntities)) }
    }

    override fun deleteProduct(productDomain: ProductDomain): Completable {
        return productDao.delete(product = mProductEntityMapper.inverseTransform(productDomain))
    }

    override fun addProduct(productDomain: ProductDomain): Completable {
        return productDao.insert(product = mProductEntityMapper.inverseTransform(productDomain))
    }
}