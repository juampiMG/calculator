package com.doublesnatch.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.doublesnatch.data.database.daos.CompanyDao
import com.doublesnatch.data.database.daos.ImpressionDao
import com.doublesnatch.data.database.daos.ProductDao
import com.doublesnatch.data.database.daos.TypeImpressionDao
import com.doublesnatch.data.entity.Company
import com.doublesnatch.data.entity.Impression
import com.doublesnatch.data.entity.Product
import com.doublesnatch.data.entity.TypeImpression


@Database(entities = [
    (Company::class),
    (Product::class),
    (Impression::class),
    (TypeImpression::class)],
        version = 2,
        exportSchema = true)
abstract class AppDatabase() : RoomDatabase() {

    abstract fun companyDao(): CompanyDao

    abstract fun productDao(): ProductDao

    abstract fun serigraphyImpressionDao(): TypeImpressionDao

    abstract fun digitalImpressionDao(): ImpressionDao

}
