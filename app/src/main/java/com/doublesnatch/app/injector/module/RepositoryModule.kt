package com.doublesnatch.app.injector.module

import com.doublesnatch.data.repository.CompanyRepository
import com.doublesnatch.data.repository.ImpressionRepository
import com.doublesnatch.data.repository.ProductRepository
import com.doublesnatch.data.repository.TypeImpressionRepository
import com.doublesnatch.domain.repository.ICompanyRepository
import com.doublesnatch.domain.repository.IImpressionRepository
import com.doublesnatch.domain.repository.IProductRepository
import com.doublesnatch.domain.repository.ITypeImpressionRepository
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
    internal abstract fun serigraphyImpressionRepository(repository: TypeImpressionRepository): ITypeImpressionRepository

    @Binds
    @Singleton
    internal abstract fun digitalImpressionRepository(repository: ImpressionRepository): IImpressionRepository
}
