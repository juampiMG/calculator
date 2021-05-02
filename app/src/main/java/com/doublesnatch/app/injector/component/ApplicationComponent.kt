package com.doublesnatch.app.injector.component

import com.doublesnatch.app.CalculatorApplication
import com.doublesnatch.app.common.BaseApplicationModule
import com.doublesnatch.app.injector.module.InjectorModule
import com.doublesnatch.app.injector.module.RoomModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidInjectionModule::class,
    BaseApplicationModule::class,
    InjectorModule::class])
interface ApplicationComponent : AndroidInjector<CalculatorApplication> {

    override fun inject(application: CalculatorApplication)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: CalculatorApplication): Builder

        fun build(): ApplicationComponent
    }
}

