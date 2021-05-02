package com.doublesnatch.app.ui.basicSample.viewModel

import com.doublesnatch.app.common.viewModel.IBaseActivityViewModel

interface ISampleFragmentViewModel : IBaseActivityViewModel {
    fun saveCompany()
    fun getCompany(id: Int)
    fun deleteCompany(id: Int)
    fun getAllCompanies()
}
