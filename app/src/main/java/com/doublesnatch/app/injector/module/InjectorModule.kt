package com.doublesnatch.app.injector.module

import com.doublesnatch.app.injector.scope.PerActivity
import com.doublesnatch.app.ui.basicSample.SampleActivityModule
import com.doublesnatch.app.ui.basicSample.activity.view.SampleActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class InjectorModule {
    @PerActivity
    @ContributesAndroidInjector(modules = [SampleActivityModule::class])
    internal abstract fun sampleActivity(): SampleActivity

}
