package com.doublesnatch.app.ui.basicSample.viewModel

import com.doublesnatch.app.common.viewModel.BaseFragmentViewModel
import com.doublesnatch.app.helper.subscribeCompletable
import com.doublesnatch.app.helper.subscribeSingle
import com.doublesnatch.app.model.CompanyView
import com.doublesnatch.app.model.mapper.CompanyViewMapper
import com.doublesnatch.domain.interactor.company.IAddCompanyUseCase
import com.doublesnatch.domain.interactor.company.IDeleteCompanyUseCase
import com.doublesnatch.domain.interactor.company.IGetAllCompaniesUseCase
import com.doublesnatch.domain.interactor.company.IGetCompanyUseCase
import com.doublesnatch.domain.model.CompanyDomain
import javax.inject.Inject

class SampleFragmentViewModel
@Inject
constructor() : BaseFragmentViewModel(), ISampleFragmentViewModel {

    @Inject
    lateinit var mAddCompanyUseCase: IAddCompanyUseCase

    @Inject
    lateinit var mGetCompanyUseCase: IGetCompanyUseCase

    @Inject
    lateinit var mDeleteCompanyUseCase: IDeleteCompanyUseCase

    @Inject
    lateinit var mGetAllCompaniesUseCase: IGetAllCompaniesUseCase

    @Inject
    lateinit var mCompanyViewMapper: CompanyViewMapper

    lateinit var company: CompanyView

    lateinit var companyList: List<CompanyView>

    override fun saveCompany() {
        addDisposable(
                mAddCompanyUseCase.execute(CompanyDomain(name = "Muchacho Studio")).subscribeCompletable(
                        onComplete = {
                            setAlertDialogError("Added Muchacho Studio")
                        }
                )
        )
    }


    override fun getCompany(id: Int) {
        addDisposable(
                mGetCompanyUseCase.execute(id).subscribeSingle(
                        onSuccess = {
                            company = mCompanyViewMapper.transform(it)
                            setAlertDialogError("Found = ${it.name}")
                        },
                        onError = { _, _, _ ->
                            setAlertDialogError("NOT FOUND")
                        })
        )
    }

    override fun deleteCompany(id: Int) {
        val co = companyList.firstOrNull { it.id == id }
        co?.let {
            addDisposable(
                    mDeleteCompanyUseCase.execute(mCompanyViewMapper.inverseTransform(co)).subscribeCompletable(
                            onComplete = {
                                setAlertDialogError("company with id = $id DELETE")
                            },
                            onError = { _, _, _ ->
                                setAlertDialogError("NOT FOUND")
                            })
            )
        }?: run {
            setAlertDialogError("NOT FOUND with id = $id")
        }

    }

    override fun getAllCompanies() {
        addDisposable(
                mGetAllCompaniesUseCase.execute().subscribeSingle(
                        onSuccess = {
                            companyList = mCompanyViewMapper.transform(it)
                            setAlertDialogError("FOUND ALL ${companyList.size}")
                        },
                        onError = { _, _, _ ->
                            setAlertDialogError("NOT FOUND")
                        })
        )
    }
}
