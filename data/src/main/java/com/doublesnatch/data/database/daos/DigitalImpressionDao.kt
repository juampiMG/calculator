package com.doublesnatch.data.database.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.doublesnatch.data.entity.DigitalImpression
import io.reactivex.Completable
import io.reactivex.Single

@Dao
interface DigitalImpressionDao {

    @get:Query("SELECT * FROM DigitalImpression")
    val all: Single<List<DigitalImpression>>

    @Query("SELECT * FROM DigitalImpression WHERE id IN (:digitalImpressionIds)")
    fun loadAllByIds(digitalImpressionIds: Array<Int>): Single<List<DigitalImpression>>

    @Query("SELECT * FROM DigitalImpression WHERE id = :id")
    fun findByDigitalImpressionId(id: Int): Single<DigitalImpression>

    @Insert
    fun insertAll(digitalImpressions: List<DigitalImpression>):Completable

    @Insert
    fun insert(digitalImpression: DigitalImpression):Completable

    @Delete
    fun delete(digitalImpression: DigitalImpression):Completable

}