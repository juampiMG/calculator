package com.doublesnatch.data.database.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.doublesnatch.data.entity.Company
import io.reactivex.Completable
import io.reactivex.Single

@Dao
interface CompanyDao {

    @get:Query("SELECT * FROM Company")
    val all: Single<List<Company>>

    @Query("SELECT * FROM Company WHERE id IN (:companyIds)")
    fun loadAllByIds(companyIds: Array<Int>): Single<List<Company>>

    @Query("SELECT * FROM Company WHERE id = :id")
    fun findByCompanyId(id: Int): Single<Company>

    @Query("DELETE FROM Company")
    fun deleteAll()

    @Insert
    fun insertAll(companies: List<Company>):Completable

    @Insert
    fun insert(company: Company):Completable

    @Delete
    fun delete(company: Company):Completable

}