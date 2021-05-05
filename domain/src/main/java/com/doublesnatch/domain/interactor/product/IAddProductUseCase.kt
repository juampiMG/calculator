package com.doublesnatch.domain.interactor.product

import com.doublesnatch.domain.model.CompanyDomain
import com.doublesnatch.domain.model.ProductDomain
import io.reactivex.Completable

interface IAddProductUseCase {
    fun execute(product: ProductDomain): Completable
}