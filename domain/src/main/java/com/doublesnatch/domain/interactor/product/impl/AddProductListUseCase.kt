package com.doublesnatch.domain.interactor.product.impl

import com.doublesnatch.domain.interactor.product.IAddProductListUseCase
import com.doublesnatch.domain.model.ProductDomain
import com.doublesnatch.domain.repository.IProductRepository
import io.reactivex.Completable
import javax.inject.Inject

class AddProductListUseCase
@Inject
constructor() : IAddProductListUseCase {
    @Inject
    lateinit var mProductRepository: IProductRepository

    override fun execute(products: List<ProductDomain>): Completable {
        return mProductRepository.addProductList(products = products)
    }
}