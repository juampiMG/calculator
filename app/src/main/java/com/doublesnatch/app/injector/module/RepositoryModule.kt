package com.doublesnatch.app.injector.module

import com.doublesnatch.data.repository.CompanyRepository
import com.doublesnatch.data.repository.DigitalImpressionRepository
import com.doublesnatch.data.repository.ProductRepository
import com.doublesnatch.data.repository.SerigraphyImpressionRepository
import com.doublesnatch.domain.repository.ICompanyRepository
import com.doublesnatch.domain.repository.IDigitalImpressionRepository
import com.doublesnatch.domain.repository.IProductRepository
import com.doublesnatch.domain.repository.ISerigraphyImpressionRepository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class RepositoryModule {
//    @Binds
//    @Singleton
//    internal abstract fun sampleRepository(repository: SampleRepository): ISampleRepository

    @Binds
    @Singleton
    internal abstract fun companyRepository(repository: CompanyRepository): ICompanyRepository

    @Binds
    @Singleton
    internal abstract fun productRepository(repository: ProductRepository): IProductRepository

    @Binds
    @Singleton
    internal abstract fun serigraphyImpressionRepository(repository: SerigraphyImpressionRepository): ISerigraphyImpressionRepository

    @Binds
    @Singleton
    internal abstract fun digitalImpressionRepository(repository: DigitalImpressionRepository): IDigitalImpressionRepository
}
