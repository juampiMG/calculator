package com.doublesnatch.domain.interactor.typeImpression.impl

import com.doublesnatch.domain.interactor.typeImpression.IAddTypeImpressionListUseCase
import com.doublesnatch.domain.model.TypeImpressionDomain
import com.doublesnatch.domain.repository.ITypeImpressionRepository
import io.reactivex.Completable
import javax.inject.Inject

class AddTypeImpressionListUseCase
@Inject
constructor() : IAddTypeImpressionListUseCase {
    @Inject
    lateinit var mTypeImpressionRepository: ITypeImpressionRepository

    override fun execute(typeImpressions: List<TypeImpressionDomain>): Completable {
        return mTypeImpressionRepository.addTypeImpressionList(typeImpressions = typeImpressions)
    }
}