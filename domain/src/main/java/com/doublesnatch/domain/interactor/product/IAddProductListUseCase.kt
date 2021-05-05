package com.doublesnatch.domain.interactor.product

import com.doublesnatch.domain.model.ProductDomain
import io.reactivex.Completable

interface IAddProductListUseCase {
    fun execute(products: List<ProductDomain>): Completable
}