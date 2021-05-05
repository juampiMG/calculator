package com.doublesnatch.data.repository

import com.doublesnatch.data.database.daos.ImpressionDao
import com.doublesnatch.data.entity.mapper.ImpressionEntityMapper
import com.doublesnatch.domain.model.ImpressionDomain
import com.doublesnatch.domain.repository.IImpressionRepository
import io.reactivex.Completable
import io.reactivex.Single
import javax.inject.Inject

class ImpressionRepository
@Inject
constructor(private val impressionDao: ImpressionDao) : IImpressionRepository {
    @Inject
    internal lateinit var mImpressionEntityMapper: ImpressionEntityMapper

    override fun deleteAll(): Completable {
        impressionDao.deleteAll()
        return Completable.complete()
    }

    override fun getImpression(id: Int): Single<ImpressionDomain> {
        return impressionDao.findByImpressionId(id = id).flatMap { resultEntities -> Single.just(mImpressionEntityMapper.transform(resultEntities)) }
    }

    override fun deleteImpression(impression: ImpressionDomain): Completable {
        return impressionDao.delete(impression = mImpressionEntityMapper.inverseTransform(impression))
    }

    override fun addImpression(impression: ImpressionDomain): Completable {
        return impressionDao.insert(impression = mImpressionEntityMapper.inverseTransform(impression))
    }

    override fun addImpressionList(impressions: List<ImpressionDomain>): Completable {
        return  impressionDao.insertAll(impressions = mImpressionEntityMapper.inverseTransform(impressions))
    }

    override fun getAllImpression(): Single<List<ImpressionDomain>> {
        return impressionDao.all.flatMap { resultEntities -> Single.just((mImpressionEntityMapper.transform(resultEntities))) }
    }
}