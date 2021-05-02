package com.doublesnatch.app.ui.basicSample.view

import android.os.Bundle
import android.text.Editable
import com.doublesnatch.app.R
import com.doublesnatch.app.common.view.BaseFragment
import com.doublesnatch.app.common.view.IBaseFragmentCallback
import com.doublesnatch.app.ui.basicSample.viewModel.SampleFragmentViewModel
import kotlinx.android.synthetic.main.sample_fragment.*

/**
 * Basic Fragment
 */
class SampleFragment : BaseFragment<SampleFragmentViewModel, SampleFragment.FragmentCallback>() {
    override fun getLayoutId(): Int {
        return R.layout.sample_fragment
    }

    interface FragmentCallback : IBaseFragmentCallback {
        fun loadFromActivityGame ()
    }


    override fun getFragmentTitle(): String {
        return "SampleFragment"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            mViewModel.loadData("")
        }
    }

    override fun subscribeToLiveData() {
        mViewModel.loadGame().observe(viewLifecycleOwner, {
            mCallback.loadFromActivityGame()
        })
    }

    companion object {
        fun newInstance(bundle: Bundle?) = SampleFragment().apply {
            arguments = bundle ?: Bundle()
        }
    }

    override fun setUpViews() {
        version_server
        version_server.addTextChangedListener(object : CustomTextWatcher {
            override fun afterTextChanged(s: Editable?) {
                mViewModel.loadData(s.toString())
            }
        })
    }

    override fun applyRTLChanges() {
    }



}
