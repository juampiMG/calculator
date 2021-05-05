package com.doublesnatch.data.database.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.doublesnatch.data.entity.TypeImpression
import io.reactivex.Completable
import io.reactivex.Single

@Dao
interface TypeImpressionDao {

    @Query("DELETE FROM TypeImpression")
    fun deleteAll()

    @get:Query("SELECT * FROM TypeImpression")
    val all: Single<List<TypeImpression>>

    @Query("SELECT * FROM TypeImpression WHERE id IN (:typeImpressionIds)")
    fun loadAllByIds(typeImpressionIds: Array<Int>): Single<List<TypeImpression>>

    @Query("SELECT * FROM TypeImpression WHERE id = :id")
    fun findByTypeImpressionId(id: Int): Single<TypeImpression>

    @Insert
    fun insertAll(typeImpressions: List<TypeImpression>):Completable

    @Insert
    fun insert(typeImpression: TypeImpression):Completable

    @Delete
    fun delete(typeImpression: TypeImpression):Completable

}