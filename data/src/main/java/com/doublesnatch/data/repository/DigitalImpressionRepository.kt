package com.doublesnatch.data.repository

import com.doublesnatch.data.database.daos.DigitalImpressionDao
import com.doublesnatch.data.entity.mapper.ImpressionEntityMapper
import com.doublesnatch.domain.model.ImpressionDomain
import com.doublesnatch.domain.repository.IDigitalImpressionRepository
import io.reactivex.Completable
import io.reactivex.Single
import javax.inject.Inject

class DigitalImpressionRepository
@Inject
constructor(private val digitalImpressionDao: DigitalImpressionDao) : IDigitalImpressionRepository {
    @Inject
    internal lateinit var mDigitalImpressionEntityMapper: ImpressionEntityMapper

    override fun getDigitalImpression(id: Int): Single<ImpressionDomain> {
        return digitalImpressionDao.findByDigitalImpressionId(id = id).flatMap { resultEntities -> Single.just(mDigitalImpressionEntityMapper.transform(resultEntities)) }
    }

    override fun deleteDigitalImpression(digitalImpression: ImpressionDomain): Completable {
        return digitalImpressionDao.delete(digitalImpression = mDigitalImpressionEntityMapper.inverseTransform(digitalImpression))
    }

    override fun addDigitalImpression(digitalImpression: ImpressionDomain): Completable {
        return digitalImpressionDao.insert(digitalImpression = mDigitalImpressionEntityMapper.inverseTransform(digitalImpression))
    }
}