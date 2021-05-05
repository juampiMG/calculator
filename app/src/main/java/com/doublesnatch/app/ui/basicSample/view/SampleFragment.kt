package com.doublesnatch.app.ui.basicSample.view

import android.os.Bundle
import com.doublesnatch.app.R
import com.doublesnatch.app.common.view.BaseFragment
import com.doublesnatch.app.common.view.IBaseFragmentCallback
import com.doublesnatch.app.ui.basicSample.viewModel.SampleFragmentViewModel
import com.doublesnatch.app.utils.CSVUtils.getCompanies
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
        add.setOnClickListener {
            mViewModel.saveCompany()
        }
        get.setOnClickListener {
            mViewModel.getAllTypes()
        }

        delete.setOnClickListener {
            mViewModel.getAllImpressions()
        }

        getall.setOnClickListener {
            mViewModel.getAllCompanies()
        }

        delete_all_companies.setOnClickListener {
            mViewModel.getAllProducts()
        }

        add_all_data.setOnClickListener {
            mViewModel.addAll(
                    getCompanies(mActivity),
                    getTypeImpressions(mActivity),
                    getProducts(mActivity),
                    getImpressions(mActivity)
            )
        }


        add_companies.setOnClickListener {
            mViewModel.addCompanies(getCompanies(mActivity))
        }

        add_impressions.setOnClickListener {
            mViewModel.addImpressions(getImpressions(mActivity))
        }

        add_products.setOnClickListener {
            mViewModel.addProducts(getProducts(mActivity))
        }

        add_types.setOnClickListener {
            mViewModel.addTypeImpressions(getTypeImpressions(mActivity))
        }
    }

    override fun applyRTLChanges() {
    }


}
