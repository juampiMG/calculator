package com.doublesnatch.domain.interactor.product.impl

import com.doublesnatch.domain.interactor.product.IGetAllProductsUseCase
import com.doublesnatch.domain.model.ProductDomain
import com.doublesnatch.domain.repository.IProductRepository
import io.reactivex.Single
import javax.inject.Inject

class GetAllProductsUseCase
@Inject
constructor() : IGetAllProductsUseCase {
    @Inject
    lateinit var mProductRepository: IProductRepository

    override fun execute(): Single<List<ProductDomain>> {
        return mProductRepository.getAllProduct()
    }
}