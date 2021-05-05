package com.doublesnatch.domain.interactor.product.impl

import com.doublesnatch.domain.interactor.product.IGetProductUseCase
import com.doublesnatch.domain.model.ProductDomain
import com.doublesnatch.domain.repository.IProductRepository
import io.reactivex.Single
import javax.inject.Inject

class GetProductUseCase
@Inject
constructor() : IGetProductUseCase {
    @Inject
    lateinit var mProductRepository: IProductRepository

    override fun execute(id: Int): Single<ProductDomain> {
        return mProductRepository.getProduct(id = id)
    }
}