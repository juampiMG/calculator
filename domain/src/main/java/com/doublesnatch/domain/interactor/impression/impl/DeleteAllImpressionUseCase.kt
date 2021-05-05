package com.doublesnatch.domain.interactor.impression.impl

import com.doublesnatch.domain.interactor.impression.IDeleteAllImpressionUseCase
import com.doublesnatch.domain.interactor.impression.IDeleteImpressionUseCase
import com.doublesnatch.domain.model.ImpressionDomain
import com.doublesnatch.domain.repository.IImpressionRepository
import io.reactivex.Completable
import javax.inject.Inject

class DeleteAllImpressionUseCase
@Inject
constructor() : IDeleteAllImpressionUseCase {
    @Inject
    lateinit var mImpressionRepository: IImpressionRepository

    override fun execute(): Completable {
        return mImpressionRepository.deleteAll()
    }
}