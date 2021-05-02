package com.doublesnatch.app.ui.basicSample.view

import android.os.Bundle
import com.doublesnatch.app.R
import com.doublesnatch.app.common.view.BaseFragment
import com.doublesnatch.app.common.view.IBaseFragmentCallback
import com.doublesnatch.app.ui.basicSample.viewModel.SampleFragmentViewModel
import com.doublesnatch.app.utils.CSVUtils.getImpressions
import com.doublesnatch.app.utils.CSVUtils.getProducts
import com.doublesnatch.app.utils.CSVUtils.getTypeImpressions
import kotlinx.android.synthetic.main.sample_fragment.*

/**
 * Basic Fragment
 */
class SampleFragment : BaseFragment<SampleFragmentViewModel, SampleFragment.FragmentCallback>() {
    override fun getLayoutId(): Int {
        return R.layout.sample_fragment
    }

    interface FragmentCallback : IBaseFragmentCallback {
        fun loadFromActivityGame()
    }


    override fun getFragmentTitle(): String {
        return "SampleFragment"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            getImpressions(mActivity)
//            mViewModel.loadTypeImpression (getTypeImpressions(mActivity))
        }
    }

    override fun subscribeToLiveData() {
    }

    companion object {
        fun newInstance(bundle: Bundle?) = SampleFragment().apply {
            arguments = bundle ?: Bundle()
        }
    }

    override fun setUpViews() {
        get.setOnClickListener {
            mViewModel.getCompany(id_company.text.toString().toInt())
        }

        delete.setOnClickListener {
            mViewModel.deleteCompany(id_company.text.toString().toInt())
        }

        getall.setOnClickListener {
            mViewModel.getAllCompanies()
        }
    }

    override fun applyRTLChanges() {
    }


}
