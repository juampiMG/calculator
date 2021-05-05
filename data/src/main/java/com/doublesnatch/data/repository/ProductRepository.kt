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


    override fun deleteAll(): Completable {
        productDao.deleteAll()
        return Completable.complete()
    }

    override fun getProduct(id: Int): Single<ProductDomain> {
        return productDao.findByProductId(id).flatMap { resultEntities -> Single.just(mProductEntityMapper.transform(resultEntities)) }
    }

    override fun deleteProduct(product: ProductDomain): Completable {
        return productDao.delete(product = mProductEntityMapper.inverseTransform(product))
    }

    override fun addProduct(product: ProductDomain): Completable {
        return productDao.insert(product = mProductEntityMapper.inverseTransform(product))
    }

    override fun addProductList(products: List<ProductDomain>): Completable {
        return productDao.insertAll(products = mProductEntityMapper.inverseTransform(products))
    }

    override fun getAllProduct(): Single<List<ProductDomain>> {
        return productDao.all.flatMap { resultEntities -> Single.just((mProductEntityMapper.transform(resultEntities))) }
    }
}