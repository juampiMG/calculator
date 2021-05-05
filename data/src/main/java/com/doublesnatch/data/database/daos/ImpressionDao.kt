package com.doublesnatch.data.database.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.doublesnatch.data.entity.Impression
import io.reactivex.Completable
import io.reactivex.Single

@Dao
interface ImpressionDao {

    @Query("DELETE FROM Impression")
    fun deleteAll()

    @get:Query("SELECT * FROM Impression")
    val all: Single<List<Impression>>

    @Query("SELECT * FROM Impression WHERE id IN (:impressionIds)")
    fun loadAllByIds(impressionIds: Array<Int>): Single<List<Impression>>

    @Query("SELECT * FROM Impression WHERE id = :id")
    fun findByImpressionId(id: Int): Single<Impression>

    @Insert
    fun insertAll(impressions: List<Impression>):Completable

    @Insert
    fun insert(impression: Impression):Completable

    @Delete
    fun delete(impression: Impression):Completable

}