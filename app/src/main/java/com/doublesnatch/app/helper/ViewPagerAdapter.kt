package com.doublesnatch.app.helper

import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter

abstract class ViewPagerAdapter : PagerAdapter() {
    /**
     * Get a View that displays the data at the specified position in the data set.
     *
     * @param position The position of the item within the adapter's data set of the item whose
     * view we want.
     * @param container The ViewPager that this view will eventually be attached to.
     * @return A View corresponding to the data at the specified position.
     */
    protected abstract fun getView(position: Int, container: ViewGroup): View?

    /**
     * Determines whether a page View is associated with a specific key object as
     * returned by instantiateItem(ViewGroup, int).
     *
     * @param view Page View to check for association with object
     * @param object Object to check for association with view
     * @return true if view is associated with the key object object.
     */
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    /**
     * Create the page for the given position.
     *
     * @param container The containing View in which the page will be shown.
     * @param position The page position to be instantiated.
     * @return Returns an Object representing the new page. This does not need
     * to be a View, but can be some other container of the page.
     */
    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = getView(position, container)
        if (view != null) {
            container.addView(view)
        }
        return view as Any
    }

    /**
     * Remove a page for the given position.
     *
     * @param container The containing View from which the page will be removed.
     * @param position The page position to be removed.
     * @param view The same object that was returned by instantiateItem(View, int).
     */
    override fun destroyItem(container: ViewGroup, position: Int, view: Any) {
        container.removeView(view as View)
    }

}