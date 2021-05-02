package com.doublesnatch.app.ui.basicSample.activity.view

import android.os.Bundle
import com.doublesnatch.app.R
import com.doublesnatch.app.common.activity.BaseActivity
import com.doublesnatch.app.ui.basicSample.activity.viewModel.ISampleActivityViewModel
import com.doublesnatch.app.ui.basicSample.view.SampleFragment

/**
 * Remember to add activity to the AndroidManifest.xml and to the InjectorModule.kt
 */
class SampleActivity : BaseActivity<ISampleActivityViewModel>(),
        SampleFragment.FragmentCallback {

    override fun getLayoutId(): Int {
        return R.layout.generic_activity
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        savedInstanceState?.let {
            supportFragmentManager.findFragmentById(R.id.content)?.let { fr ->
                mCurrentFragment = fr
                loadFragment(addToBackStack = false)
            }
        }?: run {
            mCurrentFragment = SampleFragment.newInstance(mExtras)
            loadFragment(addToBackStack = false)
        }

    }

    override fun subscribeToLiveData() {
        mActivityViewModel.showToast().observe(this,  {
            showErrorMessageDialog(getString (R.string.hello_activity))
        })
    }

    override fun loadFromActivityGame() {
        mActivityViewModel.loadServerGame()
    }

}