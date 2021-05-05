package com.doublesnatch.domain.interactor.impression.impl

import com.doublesnatch.domain.interactor.impression.IAddImpressionListUseCase
import com.doublesnatch.domain.model.ImpressionDomain
import com.doublesnatch.domain.repository.IImpressionRepository
import io.reactivex.Completable
import javax.inject.Inject

class AddImpressionListUseCase
@Inject
constructor() : IAddImpressionListUseCase {
    @Inject
    lateinit var mImpressionRepository: IImpressionRepository

    override fun execute(impressions: List<ImpressionDomain>): Completable {
        return mImpressionRepository.addImpressionList(impressions = impressions)
    }
}