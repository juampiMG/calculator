package com.doublesnatch.app.ui.basicSample.viewModel

import android.util.Log
import com.doublesnatch.app.common.viewModel.BaseFragmentViewModel
import com.doublesnatch.app.helper.subscribeCompletable
import com.doublesnatch.app.helper.subscribeSingle
import com.doublesnatch.app.model.CompanyView
import com.doublesnatch.app.model.ImpressionView
import com.doublesnatch.app.model.ProductView
import com.doublesnatch.app.model.TypeImpressionView
import com.doublesnatch.app.model.mapper.CompanyViewMapper
import com.doublesnatch.app.model.mapper.ImpressionViewMapper
import com.doublesnatch.app.model.mapper.ProductViewMapper
import com.doublesnatch.app.model.mapper.TypeImpressionViewMapper
import com.doublesnatch.domain.interactor.company.*
import com.doublesnatch.domain.interactor.impression.IAddImpressionListUseCase
import com.doublesnatch.domain.interactor.impression.IGetAllImpressionsUseCase
import com.doublesnatch.domain.interactor.product.IAddProductListUseCase
import com.doublesnatch.domain.interactor.product.IGetAllProductsUseCase
import com.doublesnatch.domain.interactor.typeImpression.IAddTypeImpressionListUseCase
import com.doublesnatch.domain.interactor.typeImpression.IGetAllTypeImpressionsUseCase
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
    lateinit var mGetAllTypeImpressionsUseCase: IGetAllTypeImpressionsUseCase

    @Inject
    lateinit var mGetAllImpressionsUseCase: IGetAllImpressionsUseCase

    @Inject
    lateinit var mIGetAllProductsUseCase: IGetAllProductsUseCase

    @Inject
    lateinit var mAddCompanyListUseCase: IAddCompanyListUseCase

    @Inject
    lateinit var mAddProductListUseCase: IAddProductListUseCase

    @Inject
    lateinit var mAddTypeImpressionListUseCase: IAddTypeImpressionListUseCase

    @Inject
    lateinit var mAddImpressionListUseCase: IAddImpressionListUseCase

    @Inject
    lateinit var mDeleteAllCompaniesUseCase: IDeleteAllCompaniesUseCase

    @Inject
    lateinit var mCompanyViewMapper: CompanyViewMapper

    @Inject
    lateinit var mProductViewMapper: ProductViewMapper

    @Inject
    lateinit var mTypeImpressionViewMapper: TypeImpressionViewMapper

    @Inject
    lateinit var mImpressionViewMapper: ImpressionViewMapper

    lateinit var company: CompanyView

    lateinit var companyList: List<CompanyView>
    lateinit var productsList: List<ProductView>
    lateinit var typeList: List<TypeImpressionView>
    lateinit var impressionsList: List<ImpressionView>

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
        } ?: run {
            setAlertDialogError("NOT FOUND with id = $id")
        }

    }

    override fun loadTypeImpression(typeImpressions: List<TypeImpressionView>) {

    }

    override fun addCompanies(companies: List<CompanyView>) {
        addDisposable(
                mAddCompanyListUseCase.execute(companies = mCompanyViewMapper.inverseTransform(companies)).subscribeCompletable(
                        onComplete = {
                            setAlertDialogError("Companies Added ${companies.size}")
                        },
                        onError = {_,_,_ ->
                            setAlertDialogError("Companies NOT ADDED")
                        }
                )
        )
    }

    override fun addAll(companies: List<CompanyView>, types: List<TypeImpressionView>, products: List<ProductView>, impressions: List<ImpressionView>) {
        addDisposable(
                mAddCompanyListUseCase.execute(companies = mCompanyViewMapper.inverseTransform(companies)).doOnComplete {
                    Log.d("ADDING_DATA", "Companies ADDED = ${companies.size}")
                    mAddProductListUseCase.execute(products = mProductViewMapper.inverseTransform(products))
                }.doOnComplete {
                    Log.d("ADDING_DATA", "Products ADDED = ${products.size}")
                    mAddTypeImpressionListUseCase.execute(typeImpressions = mTypeImpressionViewMapper.inverseTransform(types))
                }.doOnComplete {
                    Log.d("ADDING_DATA", "Types ADDED = ${types.size}")
                    mAddImpressionListUseCase.execute(impressions = mImpressionViewMapper.inverseTransform(impressions))
                }.subscribeCompletable(
                        onComplete = {
                            Log.d("ADDING_DATA", "Impressions ADDED = ${impressions.size}")
                            setAlertDialogError("ALL DATA  Added ")
                        },
                        onError = {_,_,_ ->
                            setAlertDialogError("DATA NOT ADDED")
                        }
                )
        )
    }

    override fun addTypeImpressions(types: List<TypeImpressionView>) {
        addDisposable(
                mAddTypeImpressionListUseCase.execute(typeImpressions = mTypeImpressionViewMapper.inverseTransform(types)).subscribeCompletable(
                        onComplete = {
                            setAlertDialogError("Types Added ${types.size}")
                        },
                        onError = {_,_,_ ->
                            setAlertDialogError("Types NOT ADDED")
                        }
                )
        )
    }


    override fun addProducts(products: List<ProductView>) {
        addDisposable(
                mAddProductListUseCase.execute(products = mProductViewMapper.inverseTransform(products)).subscribeCompletable(
                        onComplete = {
                            setAlertDialogError("Products Added ${products.size}")
                        },
                        onError = {_,_,_ ->
                            setAlertDialogError("Products NOT ADDED")
                        }
                )
        )
    }


    override fun addImpressions(impressions: List<ImpressionView>) {
        addDisposable(
                mAddImpressionListUseCase.execute(impressions = mImpressionViewMapper.inverseTransform(impressions)).subscribeCompletable(
                        onComplete = {
                            setAlertDialogError("Impressions Added ${impressions.size}")
                        },
                        onError = {_,_,_ ->
                            setAlertDialogError("Impressions NOT ADDED")
                        }
                )
        )
    }

    override fun getAllCompanies() {
        addDisposable(
                mGetAllCompaniesUseCase.execute().subscribeSingle(
                        onSuccess = {
                            companyList = mCompanyViewMapper.transform(it)
                            setAlertDialogError("FOUND ALL Companies ${companyList.size}")
                        },
                        onError = { _, _, _ ->
                            setAlertDialogError("NOT FOUND")
                        })
        )
    }

    override fun getAllProducts() {
        addDisposable(
                mIGetAllProductsUseCase.execute().subscribeSingle(
                        onSuccess = {
                            productsList = mProductViewMapper.transform(it)
                            setAlertDialogError("FOUND ALL Products ${productsList.size}")
                        },
                        onError = { _, _, _ ->
                            setAlertDialogError("NOT FOUND")
                        })
        )
    }

    override fun getAllImpressions() {
        addDisposable(
                mGetAllImpressionsUseCase.execute().subscribeSingle(
                        onSuccess = {
                            impressionsList = mImpressionViewMapper.transform(it)
                            setAlertDialogError("FOUND ALL Impressions ${impressionsList.size}")
                        },
                        onError = { _, _, _ ->
                            setAlertDialogError("NOT FOUND")
                        })
        )
    }


    override fun getAllTypes() {
        addDisposable(
                mGetAllTypeImpressionsUseCase.execute().subscribeSingle(
                        onSuccess = {
                            typeList = mTypeImpressionViewMapper.transform(it)
                            setAlertDialogError("FOUND ALL Types ${typeList.size}")
                        },
                        onError = { _, _, _ ->
                            setAlertDialogError("NOT FOUND")
                        })
        )
    }

    override fun deleteAllCompanies() {
        addDisposable(
                mDeleteAllCompaniesUseCase.execute().subscribeCompletable(
                        onComplete = {
                            setAlertDialogError("All Companies Deleted")
                        },
                        onError = { _, _, _ ->
                            setAlertDialogError("NOT FOUND")
                        })
        )
    }
}
