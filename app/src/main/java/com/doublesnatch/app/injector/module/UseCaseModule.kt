package com.doublesnatch.app.injector.module

import com.doublesnatch.domain.interactor.company.*
import com.doublesnatch.domain.interactor.company.impl.*
import com.doublesnatch.domain.interactor.impression.*
import com.doublesnatch.domain.interactor.impression.impl.*
import com.doublesnatch.domain.interactor.product.*
import com.doublesnatch.domain.interactor.product.impl.*
import com.doublesnatch.domain.interactor.sample.IGetSampleUseCase
import com.doublesnatch.domain.interactor.sample.impl.GetSampleUseCase
import com.doublesnatch.domain.interactor.typeImpression.*
import com.doublesnatch.domain.interactor.typeImpression.impl.*
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class UseCaseModule {

    @Binds
    @Singleton
    internal abstract fun getSampleUseCase(useCase: GetSampleUseCase): IGetSampleUseCase

    //=================================== DATABASE USE CASES =======================================

    //////////////////
    //// COMPANY
    /////////////////

    @Binds
    @Singleton
    internal abstract fun deleteAllCompaniesUseCase(useCase: DeleteAllCompaniesUseCase): IDeleteAllCompaniesUseCase

    @Binds
    @Singleton
    internal abstract fun getCompanyUseCase(useCase: GetCompanyUseCase): IGetCompanyUseCase

    @Binds
    @Singleton
    internal abstract fun addCompanyUseCase(useCase: AddCompanyUseCase): IAddCompanyUseCase

    @Binds
    @Singleton
    internal abstract fun deleteCompanyUseCase(useCase: DeleteCompanyUseCase): IDeleteCompanyUseCase

    @Binds
    @Singleton
    internal abstract fun getAllCompaniesUseCase(useCase: GetAllCompaniesUseCase): IGetAllCompaniesUseCase


    @Binds
    @Singleton
    internal abstract fun addCompanyListUseCase(useCase: AddCompanyListUseCase): IAddCompanyListUseCase



    //////////////////
    //// PRODUCT
    /////////////////

    @Binds
    @Singleton
    internal abstract fun deleteAllProductUseCase(useCase: IDeleteAllProductUseCase): IDeleteAllProductUseCase

    @Binds
    @Singleton
    internal abstract fun getProductUseCase(useCase: GetProductUseCase): IGetProductUseCase

    @Binds
    @Singleton
    internal abstract fun addProductUseCase(useCase: AddProductUseCase): IAddProductUseCase

    @Binds
    @Singleton
    internal abstract fun deleteProductUseCase(useCase: DeleteProductUseCase): IDeleteProductUseCase

    @Binds
    @Singleton
    internal abstract fun getAllProductsUseCase(useCase: GetAllProductsUseCase): IGetAllProductsUseCase


    @Binds
    @Singleton
    internal abstract fun addProductListUseCase(useCase: AddProductListUseCase): IAddProductListUseCase


    //////////////////
    //// IMPRESSION
    /////////////////

    @Binds
    @Singleton
    internal abstract fun deleteAllImpressionUseCase(useCase: DeleteAllImpressionUseCase): IDeleteAllImpressionUseCase

    @Binds
    @Singleton
    internal abstract fun getImpressionUseCase(useCase: GetImpressionUseCase): IGetImpressionUseCase

    @Binds
    @Singleton
    internal abstract fun addImpressionUseCase(useCase: AddImpressionUseCase): IAddImpressionUseCase

    @Binds
    @Singleton
    internal abstract fun deleteImpressionUseCase(useCase: DeleteImpressionUseCase): IDeleteImpressionUseCase

    @Binds
    @Singleton
    internal abstract fun getAllImpressionsUseCase(useCase: GetAllImpressionsUseCase): IGetAllImpressionsUseCase


    @Binds
    @Singleton
    internal abstract fun addImpressionListUseCase(useCase: AddImpressionListUseCase): IAddImpressionListUseCase


    //////////////////
    //// TYPE IMPRESSION
    /////////////////

    @Binds
    @Singleton
    internal abstract fun deleteAllTypeImpressionUseCase(useCase: DeleteAllTypeImpressionUseCase): IDeleteAllTypeImpressionUseCase

    @Binds
    @Singleton
    internal abstract fun getTypeImpressionUseCase(useCase: GetTypeImpressionUseCase): IGetTypeImpressionUseCase

    @Binds
    @Singleton
    internal abstract fun addTypeImpressionUseCase(useCase: AddTypeImpressionUseCase): IAddTypeImpressionUseCase

    @Binds
    @Singleton
    internal abstract fun deleteTypeImpressionUseCase(useCase: DeleteTypeImpressionUseCase): IDeleteTypeImpressionUseCase

    @Binds
    @Singleton
    internal abstract fun getAllTypeImpressionsUseCase(useCase: GetAllTypeImpressionsUseCase): IGetAllTypeImpressionsUseCase

    @Binds
    @Singleton
    internal abstract fun addTypeImpressionListUseCase(useCase: AddTypeImpressionListUseCase): IAddTypeImpressionListUseCase

}
