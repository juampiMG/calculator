package com.doublesnatch.domain.interactor.product

import com.doublesnatch.domain.model.CompanyDomain
import com.doublesnatch.domain.model.ProductDomain
import io.reactivex.Maybe
import io.reactivex.Single

interface IGetAllProductsUseCase {
    fun execute(): Single<List<ProductDomain>>
}