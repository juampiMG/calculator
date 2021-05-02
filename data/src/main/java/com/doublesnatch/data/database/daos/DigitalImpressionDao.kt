package com.doublesnatch.data.database.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.doublesnatch.data.entity.Impression
import io.reactivex.Completable
import io.reactivex.Single

@Dao
interface DigitalImpressionDao {

    @get:Query("SELECT * FROM Impression")
    val all: Single<List<Impression>>

    @Query("SELECT * FROM Impression WHERE id IN (:digitalImpressionIds)")
    fun loadAllByIds(digitalImpressionIds: Array<Int>): Single<List<Impression>>

    @Query("SELECT * FROM Impression WHERE id = :id")
    fun findByDigitalImpressionId(id: Int): Single<Impression>

    @Insert
    fun insertAll(digitalImpressions: List<Impression>):Completable

    @Insert
    fun insert(digitalImpression: Impression):Completable

    @Delete
    fun delete(digitalImpression: Impression):Completable

}