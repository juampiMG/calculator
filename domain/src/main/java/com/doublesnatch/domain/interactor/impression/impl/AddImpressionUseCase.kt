package com.doublesnatch.domain.interactor.impression.impl

import com.doublesnatch.domain.interactor.impression.IAddImpressionUseCase
import com.doublesnatch.domain.model.ImpressionDomain
import com.doublesnatch.domain.repository.IImpressionRepository
import io.reactivex.Completable
import javax.inject.Inject

class AddImpressionUseCase
@Inject
constructor() : IAddImpressionUseCase {
    @Inject
    lateinit var mImpressionRepository: IImpressionRepository

    override fun execute(impression: ImpressionDomain): Completable {
        return mImpressionRepository.addImpression(impression = impression)
    }
}