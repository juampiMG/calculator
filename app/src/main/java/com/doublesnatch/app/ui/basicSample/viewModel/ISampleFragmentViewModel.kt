package com.doublesnatch.app.ui.basicSample.viewModel

import com.doublesnatch.app.common.viewModel.IBaseActivityViewModel
import com.doublesnatch.app.model.TypeImpressionView

interface ISampleFragmentViewModel : IBaseActivityViewModel {
    fun saveCompany()
    fun getCompany(id: Int)
    fun deleteCompany(id: Int)
    fun getAllCompanies()
    fun loadTypeImpression(typeImpressions: List<TypeImpressionView>)
}
