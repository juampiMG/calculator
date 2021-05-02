package com.doublesnatch.data.database.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.doublesnatch.data.entity.TypeImpression
import io.reactivex.Completable
import io.reactivex.Single

@Dao
interface SerigraphyImpressionDao {

    @get:Query("SELECT * FROM TypeImpression")
    val all: Single<List<TypeImpression>>

    @Query("SELECT * FROM TypeImpression WHERE id IN (:serigraphyImpressionIds)")
    fun loadAllByIds(serigraphyImpressionIds: Array<Int>): Single<List<TypeImpression>>

    @Query("SELECT * FROM TypeImpression WHERE id = :id")
    fun findBySerigraphyImpressionId(id: Int): Single<TypeImpression>

    @Insert
    fun insertAll(serigraphyImpressions: List<TypeImpression>):Completable

    @Insert
    fun insert(serigraphyImpression: TypeImpression):Completable

    @Delete
    fun delete(serigraphyImpression: TypeImpression):Completable

}