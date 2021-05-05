package com.doublesnatch.app.ui.basicSample.viewModel

import com.doublesnatch.app.common.viewModel.IBaseActivityViewModel
import com.doublesnatch.app.model.CompanyView
import com.doublesnatch.app.model.ImpressionView
import com.doublesnatch.app.model.ProductView
import com.doublesnatch.app.model.TypeImpressionView

interface ISampleFragmentViewModel : IBaseActivityViewModel {
    fun saveCompany()
    fun getCompany(id: Int)
    fun deleteCompany(id: Int)
    fun getAllCompanies()
    fun deleteAllCompanies()
    fun addAll(companies: List<CompanyView>, types: List<TypeImpressionView>, products: List<ProductView>, impressions: List<ImpressionView>)
    fun loadTypeImpression(typeImpressions: List<TypeImpressionView>)
    fun addCompanies(companies: List<CompanyView>)
    fun addProducts(products: List<ProductView>)
    fun addTypeImpressions(types: List<TypeImpressionView>)
    fun addImpressions(impressions: List<ImpressionView>)
    fun getAllImpressions()
    fun getAllTypes()
    fun getAllProducts()
}
