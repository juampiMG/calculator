package com.doublesnatch.data.repository

import com.doublesnatch.data.database.daos.SerigraphyImpressionDao
import com.doublesnatch.data.entity.mapper.SerigraphyImpressionEntityMapper
import com.doublesnatch.domain.model.SerigraphyImpressionDomain
import com.doublesnatch.domain.repository.ISerigraphyImpressionRepository
import io.reactivex.Completable
import io.reactivex.Single
import javax.inject.Inject

class SerigraphyImpressionRepository
@Inject
constructor(private val serigraphyImpressionDao: SerigraphyImpressionDao) : ISerigraphyImpressionRepository {
    @Inject
    internal lateinit var mSerigraphyImpressionEntityMapper: SerigraphyImpressionEntityMapper

    override fun getSerigraphyImpression(id: Int): Single<SerigraphyImpressionDomain> {
        return serigraphyImpressionDao.findBySerigraphyImpressionId(id = id).flatMap { resultEntities -> Single.just(mSerigraphyImpressionEntityMapper.transform(resultEntities)) }
    }

    override fun deleteSerigraphyImpression(serigraphyImpression: SerigraphyImpressionDomain): Completable {
        return serigraphyImpressionDao.delete(serigraphyImpression = mSerigraphyImpressionEntityMapper.inverseTransform(serigraphyImpression))
    }

    override fun addSerigraphyImpression(serigraphyImpression: SerigraphyImpressionDomain): Completable {
        return serigraphyImpressionDao.insert(serigraphyImpression = mSerigraphyImpressionEntityMapper.inverseTransform(serigraphyImpression))
    }
}