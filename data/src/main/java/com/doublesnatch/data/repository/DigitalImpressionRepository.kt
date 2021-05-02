package com.doublesnatch.data.repository

import com.doublesnatch.data.database.daos.DigitalImpressionDao
import com.doublesnatch.data.entity.mapper.DigitalImpressionEntityMapper
import com.doublesnatch.domain.model.DigitalImpressionDomain
import com.doublesnatch.domain.repository.IDigitalImpressionRepository
import io.reactivex.Completable
import io.reactivex.Single
import javax.inject.Inject

class DigitalImpressionRepository
@Inject
constructor(private val digitalImpressionDao: DigitalImpressionDao) : IDigitalImpressionRepository {
    @Inject
    internal lateinit var mDigitalImpressionEntityMapper: DigitalImpressionEntityMapper

    override fun getDigitalImpression(id: Int): Single<DigitalImpressionDomain> {
        return digitalImpressionDao.findByDigitalImpressionId(id = id).flatMap { resultEntities -> Single.just(mDigitalImpressionEntityMapper.transform(resultEntities)) }
    }

    override fun deleteDigitalImpression(digitalImpression: DigitalImpressionDomain): Completable {
        return digitalImpressionDao.delete(digitalImpression = mDigitalImpressionEntityMapper.inverseTransform(digitalImpression))
    }

    override fun addDigitalImpression(digitalImpression: DigitalImpressionDomain): Completable {
        return digitalImpressionDao.insert(digitalImpression = mDigitalImpressionEntityMapper.inverseTransform(digitalImpression))
    }
}