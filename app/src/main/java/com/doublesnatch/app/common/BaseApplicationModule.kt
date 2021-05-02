package com.doublesnatch.app.common

import android.app.Application
import android.content.Context
import com.doublesnatch.app.SampleApplication
import com.doublesnatch.app.injector.module.NetworkModule
import com.doublesnatch.app.injector.module.PreferencesModule
import com.doublesnatch.app.injector.module.RepositoryModule
import com.doublesnatch.app.injector.module.UseCaseModule
import dagger.Binds
import dagger.Module
import javax.inject.Singleton


@Module(
        includes = [
            RepositoryModule::class,
            UseCaseModule::class,
            NetworkModule::class,
            PreferencesModule::class
        ]
)
abstract class BaseApplicationModule {
    @Binds
    @Singleton
    internal abstract fun application(application: SampleApplication): Application

    @Binds
    @Singleton
    internal abstract fun applicationContext(application: Application): Context

}