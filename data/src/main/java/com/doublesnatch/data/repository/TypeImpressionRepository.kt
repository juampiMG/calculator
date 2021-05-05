package com.doublesnatch.data.repository

import com.doublesnatch.data.database.daos.TypeImpressionDao
import com.doublesnatch.data.entity.mapper.TypeImpressionEntityMapper
import com.doublesnatch.domain.model.TypeImpressionDomain
import com.doublesnatch.domain.repository.ITypeImpressionRepository
import io.reactivex.Completable
import io.reactivex.Single
import javax.inject.Inject

class TypeImpressionRepository
@Inject
constructor(private val typeImpressionDao: TypeImpressionDao) : ITypeImpressionRepository {
    @Inject
    internal lateinit var mTypeImpressionEntityMapper: TypeImpressionEntityMapper

    override fun deleteAll(): Completable {
        typeImpressionDao.deleteAll()
        return Completable.complete()
    }

    override fun getTypeImpression(id: Int): Single<TypeImpressionDomain> {
        return typeImpressionDao.findByTypeImpressionId(id = id).flatMap { resultEntities -> Single.just(mTypeImpressionEntityMapper.transform(resultEntities)) }
    }

    override fun deleteTypeImpression(typeImpression: TypeImpressionDomain): Completable {
        return typeImpressionDao.delete(typeImpression = mTypeImpressionEntityMapper.inverseTransform(typeImpression))
    }

    override fun addTypeImpression(typeImpression: TypeImpressionDomain): Completable {
        return typeImpressionDao.insert(typeImpression = mTypeImpressionEntityMapper.inverseTransform(typeImpression))
    }

    override fun addTypeImpressionList(typeImpressions: List<TypeImpressionDomain>): Completable {
        return typeImpressionDao.insertAll(typeImpressions = mTypeImpressionEntityMapper.inverseTransform(typeImpressions))
    }

    override fun getAllTypeImpression(): Single<List<TypeImpressionDomain>> {
        return typeImpressionDao.all.flatMap { resultEntities -> Single.just((mTypeImpressionEntityMapper.transform(resultEntities))) }
    }
}