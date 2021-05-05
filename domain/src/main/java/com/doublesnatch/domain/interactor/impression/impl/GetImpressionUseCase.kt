package com.doublesnatch.domain.interactor.impression.impl

import com.doublesnatch.domain.interactor.impression.IGetImpressionUseCase
import com.doublesnatch.domain.model.ImpressionDomain
import com.doublesnatch.domain.repository.IImpressionRepository
import io.reactivex.Single
import javax.inject.Inject

class GetImpressionUseCase
@Inject
constructor() : IGetImpressionUseCase {
    @Inject
    lateinit var mImpressionRepository: IImpressionRepository

    override fun execute(id: Int): Single<ImpressionDomain> {
        return mImpressionRepository.getImpression(id = id)
    }
}