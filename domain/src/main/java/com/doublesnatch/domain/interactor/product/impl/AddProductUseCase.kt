package com.doublesnatch.domain.interactor.product.impl

import com.doublesnatch.domain.interactor.product.IAddProductUseCase
import com.doublesnatch.domain.model.ProductDomain
import com.doublesnatch.domain.repository.IProductRepository
import io.reactivex.Completable
import javax.inject.Inject

class AddProductUseCase
@Inject
constructor() : IAddProductUseCase {
    @Inject
    lateinit var mProductRepository: IProductRepository

    override fun execute(product: ProductDomain): Completable {
        return mProductRepository.addProduct(product = product)
    }
}