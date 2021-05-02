package com.doublesnatch.app.common

import android.app.Activity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import com.doublesnatch.app.helper.DialogHelper
import com.doublesnatch.app.injector.scope.PerFragment
import dagger.Module
import dagger.Provides
import javax.inject.Named

/**
 * Provides base fragment dependencies. This must be included in all fragment modules, which must
 * provide a concrete implementation of [Fragment].
 */
@Module
object BaseFragmentModule {

    const val FRAGMENT = "BaseFragmentModule.fragment"
    const val CHILD_FRAGMENT_MANAGER = "BaseFragmentModule.childSupportFragment"
    const val FRAGMENT_DIALOG_HELPER = "BaseFragmentModule.dialogHelper"


    @JvmStatic
    @Provides
    @PerFragment
    internal fun activity(activity: FragmentActivity): Activity {
        return activity
    }

    @JvmStatic
    @Provides
    @Named(CHILD_FRAGMENT_MANAGER)
    @PerFragment
    internal fun childSupportFragment(@Named(FRAGMENT) fragment: Fragment): FragmentManager {
        return fragment.childFragmentManager
    }

    @JvmStatic
    @Provides
    @Named(FRAGMENT_DIALOG_HELPER)
    @PerFragment
    internal fun dialogHelper(activity: FragmentActivity, @Named(CHILD_FRAGMENT_MANAGER) fragmentManager: FragmentManager): DialogHelper {
        return DialogHelper(activity, fragmentManager)
    }

}
