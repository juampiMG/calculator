package com.doublesnatch.app.injector.module

import com.doublesnatch.data.repository.SampleRepository
import com.doublesnatch.domain.repository.ISampleRepository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class RepositoryModule {
    @Binds
    @Singleton
    internal abstract fun sampleRepository(repository: SampleRepository): ISampleRepository
}
