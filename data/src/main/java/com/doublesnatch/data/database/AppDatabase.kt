package com.doublesnatch.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.doublesnatch.data.database.daos.CompanyDao
import com.doublesnatch.data.database.daos.DigitalImpressionDao
import com.doublesnatch.data.database.daos.ProductDao
import com.doublesnatch.data.database.daos.SerigraphyImpressionDao
import com.doublesnatch.data.entity.Company
import com.doublesnatch.data.entity.DigitalImpression
import com.doublesnatch.data.entity.Product
import com.doublesnatch.data.entity.SerigraphyImpression


@Database(entities = [
    (Company::class),
    (Product::class),
    (DigitalImpression::class),
    (SerigraphyImpression::class)],
        version = 1,
        exportSchema = true)
abstract class AppDatabase() : RoomDatabase() {

    abstract fun companyDao(): CompanyDao

    abstract fun productDao(): ProductDao

    abstract fun serigraphyImpressionDao(): SerigraphyImpressionDao

    abstract fun digitalImpressionDao(): DigitalImpressionDao

}
