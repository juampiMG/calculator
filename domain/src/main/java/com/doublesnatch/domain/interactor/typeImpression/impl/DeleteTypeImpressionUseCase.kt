package com.doublesnatch.domain.interactor.typeImpression.impl

import com.doublesnatch.domain.interactor.typeImpression.IDeleteTypeImpressionUseCase
import com.doublesnatch.domain.model.TypeImpressionDomain
import com.doublesnatch.domain.repository.ITypeImpressionRepository
import io.reactivex.Completable
import javax.inject.Inject

class DeleteTypeImpressionUseCase
@Inject
constructor() : IDeleteTypeImpressionUseCase {
    @Inject
    lateinit var mTypeImpressionRepository: ITypeImpressionRepository

    override fun execute(typeImpression: TypeImpressionDomain): Completable {
        return mTypeImpressionRepository.deleteTypeImpression(typeImpression = typeImpression)
    }
}