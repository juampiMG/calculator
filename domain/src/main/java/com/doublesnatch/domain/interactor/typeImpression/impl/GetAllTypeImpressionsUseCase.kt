package com.doublesnatch.domain.interactor.typeImpression.impl

import com.doublesnatch.domain.interactor.typeImpression.IGetAllTypeImpressionsUseCase
import com.doublesnatch.domain.model.TypeImpressionDomain
import com.doublesnatch.domain.repository.ITypeImpressionRepository
import io.reactivex.Single
import javax.inject.Inject

class GetAllTypeImpressionsUseCase
@Inject
constructor() : IGetAllTypeImpressionsUseCase {
    @Inject
    lateinit var mTypeImpressionRepository: ITypeImpressionRepository

    override fun execute(): Single<List<TypeImpressionDomain>> {
        return mTypeImpressionRepository.getAllTypeImpression()
    }
}