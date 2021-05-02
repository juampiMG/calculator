package com.doublesnatch.app.common

import android.app.Application
import android.content.Context
import com.doublesnatch.app.CalculatorApplication
import com.doublesnatch.app.injector.module.*
import dagger.Binds
import dagger.Module
import javax.inject.Singleton


@Module(
        includes = [
            RepositoryModule::class,
            UseCaseModule::class,
            NetworkModule::class,
            RoomModule::class,
            PreferencesModule::class
        ]
)
abstract class BaseApplicationModule {
    @Binds
    @Singleton
    internal abstract fun application(application: CalculatorApplication): Application

    @Binds
    @Singleton
    internal abstract fun applicationContext(application: Application): Context

}