package com.doublesnatch.domain.interactor.typeImpression.impl

import com.doublesnatch.domain.interactor.typeImpression.IGetTypeImpressionUseCase
import com.doublesnatch.domain.model.TypeImpressionDomain
import com.doublesnatch.domain.repository.ITypeImpressionRepository
import io.reactivex.Single
import javax.inject.Inject

class GetTypeImpressionUseCase
@Inject
constructor() : IGetTypeImpressionUseCase {
    @Inject
    lateinit var mTypeImpressionRepository: ITypeImpressionRepository

    override fun execute(id: Int): Single<TypeImpressionDomain> {
        return mTypeImpressionRepository.getTypeImpression(id = id)
    }
}