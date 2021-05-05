package com.doublesnatch.domain.interactor.impression.impl

import com.doublesnatch.domain.interactor.impression.IGetAllImpressionsUseCase
import com.doublesnatch.domain.model.ImpressionDomain
import com.doublesnatch.domain.repository.IImpressionRepository
import io.reactivex.Single
import javax.inject.Inject

class GetAllImpressionsUseCase
@Inject
constructor() : IGetAllImpressionsUseCase {
    @Inject
    lateinit var mImpressionRepository: IImpressionRepository

    override fun execute(): Single<List<ImpressionDomain>> {
        return mImpressionRepository.getAllImpression()
    }
}