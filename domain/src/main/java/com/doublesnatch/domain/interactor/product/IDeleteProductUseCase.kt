package com.doublesnatch.domain.interactor.product

import com.doublesnatch.domain.model.CompanyDomain
import com.doublesnatch.domain.model.ProductDomain
import io.reactivex.Completable
import io.reactivex.Maybe
import io.reactivex.Single

interface IDeleteProductUseCase {
    fun execute(product: ProductDomain): Completable
}