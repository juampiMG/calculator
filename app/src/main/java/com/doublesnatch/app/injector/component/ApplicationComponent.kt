package com.doublesnatch.app.injector.component

import com.doublesnatch.app.SampleApplication
import com.doublesnatch.app.common.BaseApplicationModule
import com.doublesnatch.app.injector.module.InjectorModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class, BaseApplicationModule::class, InjectorModule::class])
interface ApplicationComponent : AndroidInjector<SampleApplication> {

    override fun inject(application: SampleApplication)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: SampleApplication): Builder

        fun build(): ApplicationComponent
    }
}

