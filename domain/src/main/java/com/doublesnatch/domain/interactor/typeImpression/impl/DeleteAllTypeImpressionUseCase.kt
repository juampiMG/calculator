package com.doublesnatch.domain.interactor.typeImpression.impl

import com.doublesnatch.domain.interactor.typeImpression.IDeleteAllTypeImpressionUseCase
import com.doublesnatch.domain.repository.ITypeImpressionRepository
import io.reactivex.Completable
import javax.inject.Inject

class DeleteAllTypeImpressionUseCase
@Inject
constructor() : IDeleteAllTypeImpressionUseCase {
    @Inject
    lateinit var mTypeImpressionRepository: ITypeImpressionRepository

    override fun execute(): Completable {
        return mTypeImpressionRepository.deleteAll()
    }
}