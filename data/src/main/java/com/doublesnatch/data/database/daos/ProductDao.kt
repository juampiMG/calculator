package com.doublesnatch.data.database.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.doublesnatch.data.entity.Product
import io.reactivex.Completable
import io.reactivex.Single

@Dao
interface ProductDao {

    @get:Query("SELECT * FROM Product")
    val all: Single<List<Product>>

    @Query("SELECT * FROM Product WHERE id IN (:productIds)")
    fun loadAllByIds(productIds: Array<Int>): Single<List<Product>>

    @Query("SELECT * FROM Product WHERE id = :id")
    fun findByProductId(id: Int): Single<Product>

    @Insert
    fun insertAll(products: List<Product>):Completable

    @Insert
    fun insert(product: Product): Completable

    @Delete
    fun delete(product: Product):Completable

}