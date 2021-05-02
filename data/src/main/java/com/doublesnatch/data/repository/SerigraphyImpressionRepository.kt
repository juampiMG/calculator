package com.doublesnatch.data.repository

import com.doublesnatch.data.database.daos.SerigraphyImpressionDao
import com.doublesnatch.data.entity.mapper.TypeImpressionEntityMapper
import com.doublesnatch.domain.model.TypeImpressionDomain
import com.doublesnatch.domain.repository.ISerigraphyImpressionRepository
import io.reactivex.Completable
import io.reactivex.Single
import javax.inject.Inject

class SerigraphyImpressionRepository
@Inject
constructor(private val serigraphyImpressionDao: SerigraphyImpressionDao) : ISerigraphyImpressionRepository {
    @Inject
    internal lateinit var mSerigraphyImpressionEntityMapper: TypeImpressionEntityMapper

    override fun getSerigraphyImpression(id: Int): Single<TypeImpressionDomain> {
        return serigraphyImpressionDao.findBySerigraphyImpressionId(id = id).flatMap { resultEntities -> Single.just(mSerigraphyImpressionEntityMapper.transform(resultEntities)) }
    }

    override fun deleteSerigraphyImpression(serigraphyImpression: TypeImpressionDomain): Completable {
        return serigraphyImpressionDao.delete(serigraphyImpression = mSerigraphyImpressionEntityMapper.inverseTransform(serigraphyImpression))
    }

    override fun addSerigraphyImpression(serigraphyImpression: TypeImpressionDomain): Completable {
        return serigraphyImpressionDao.insert(serigraphyImpression = mSerigraphyImpressionEntityMapper.inverseTransform(serigraphyImpression))
    }
}