package com.doublesnatch.data.database.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.doublesnatch.data.entity.SerigraphyImpression
import io.reactivex.Completable
import io.reactivex.Single

@Dao
interface SerigraphyImpressionDao {

    @get:Query("SELECT * FROM SerigraphyImpression")
    val all: Single<List<SerigraphyImpression>>

    @Query("SELECT * FROM SerigraphyImpression WHERE id IN (:serigraphyImpressionIds)")
    fun loadAllByIds(serigraphyImpressionIds: Array<Int>): Single<List<SerigraphyImpression>>

    @Query("SELECT * FROM SerigraphyImpression WHERE id = :id")
    fun findBySerigraphyImpressionId(id: Int): Single<SerigraphyImpression>

    @Insert
    fun insertAll(serigraphyImpressions: List<SerigraphyImpression>):Completable

    @Insert
    fun insert(serigraphyImpression: SerigraphyImpression):Completable

    @Delete
    fun delete(serigraphyImpression: SerigraphyImpression):Completable

}