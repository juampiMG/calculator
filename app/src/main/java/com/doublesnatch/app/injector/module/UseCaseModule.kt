package com.doublesnatch.app.injector.module

import com.doublesnatch.domain.interactor.company.IAddCompanyUseCase
import com.doublesnatch.domain.interactor.company.IDeleteCompanyUseCase
import com.doublesnatch.domain.interactor.company.IGetAllCompaniesUseCase
import com.doublesnatch.domain.interactor.company.IGetCompanyUseCase
import com.doublesnatch.domain.interactor.company.impl.AddCompanyUseCase
import com.doublesnatch.domain.interactor.company.impl.DeleteCompanyUseCase
import com.doublesnatch.domain.interactor.company.impl.GetAllCompaniesUseCase
import com.doublesnatch.domain.interactor.company.impl.GetCompanyUseCase
import com.doublesnatch.domain.interactor.sample.IGetSampleUseCase
import com.doublesnatch.domain.interactor.sample.impl.GetSampleUseCase
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

}
