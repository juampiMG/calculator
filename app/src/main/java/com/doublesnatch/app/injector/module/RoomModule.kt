package com.doublesnatch.app.injector.module

import android.app.Application
import androidx.room.Room
import com.doublesnatch.data.database.AppDatabase
import com.doublesnatch.data.database.daos.CompanyDao
import com.doublesnatch.data.database.daos.ImpressionDao
import com.doublesnatch.data.database.daos.ProductDao
import com.doublesnatch.data.database.daos.TypeImpressionDao
import com.doublesnatch.data.utils.Constants
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class RoomModule {

    @Singleton
    @Provides
    fun providesRoomDatabase(application: Application): AppDatabase {
        return Room.databaseBuilder(application, AppDatabase::class.java, Constants.DATABASE_NAME).build()
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
    fun providesSerigraphyImpressionDao(appDatabase: AppDatabase): TypeImpressionDao {
        return appDatabase.serigraphyImpressionDao()
    }

    @Singleton
    @Provides
    fun providesDigitalImpressionDao(appDatabase: AppDatabase): ImpressionDao {
        return appDatabase.digitalImpressionDao()
    }
}