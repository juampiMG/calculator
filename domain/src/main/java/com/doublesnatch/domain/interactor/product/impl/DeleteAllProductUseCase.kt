package com.doublesnatch.domain.interactor.product.impl

import com.doublesnatch.domain.interactor.product.IDeleteAllProductUseCase
import com.doublesnatch.domain.model.ProductDomain
import com.doublesnatch.domain.repository.IProductRepository
import io.reactivex.Completable
import javax.inject.Inject

class DeleteAllProductUseCase
@Inject
constructor() : IDeleteAllProductUseCase {
    @Inject
    lateinit var mProductRepository: IProductRepository

    override fun execute(): Completable {
        return mProductRepository.deleteAll()
    }
}