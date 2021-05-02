package com.doublesnatch.app.injector.module

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.doublesnatch.data.database.AppDatabase
import com.doublesnatch.data.database.daos.CompanyDao
import com.doublesnatch.data.database.daos.DigitalImpressionDao
import com.doublesnatch.data.database.daos.ProductDao
import com.doublesnatch.data.database.daos.SerigraphyImpressionDao
import com.doublesnatch.data.repository.CompanyRepository
import com.doublesnatch.data.repository.DigitalImpressionRepository
import com.doublesnatch.data.repository.ProductRepository
import com.doublesnatch.data.repository.SerigraphyImpressionRepository
import com.doublesnatch.domain.repository.ICompanyRepository
import com.doublesnatch.domain.repository.IDigitalImpressionRepository
import com.doublesnatch.domain.repository.IProductRepository
import com.doublesnatch.domain.repository.ISerigraphyImpressionRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class RoomModule {

    @Singleton
    @Provides
    fun providesRoomDatabase(application: Application): AppDatabase {
        return Room.databaseBuilder(application, AppDatabase::class.java, "doublesnatch-db").build()
    }

    @Singleton
    @Provides
    fun providesCompanyDao(appDatabase: AppDatabase): CompanyDao {
        return appDatabase.companyDao()
    }

    @Singleton
    @Provides
    fun providesProductDao(appDatabase: AppDatabase): ProductDao {
        return appDatabase.productDao()
    }

    @Singleton
    @Provides
    fun providesSerigraphyImpressionDao(appDatabase: AppDatabase): SerigraphyImpressionDao {
        return appDatabase.serigraphyImpressionDao()
    }

    @Singleton
    @Provides
    fun providesDigitalImpressionDao(appDatabase: AppDatabase): DigitalImpressionDao {
        return appDatabase.digitalImpressionDao()
    }
}