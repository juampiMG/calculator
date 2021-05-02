package com.doublesnatch.data.preferences

import com.doublesnatch.data.BuildConfig
import com.doublesnatch.data.utils.AdvancedPreferences


class URLPreferenceManager constructor(private val mAdvancedPreferences: AdvancedPreferences) {
    fun saveURL(url: String) {
        mAdvancedPreferences.put(PREF_URL_SELECTED, url)
        mAdvancedPreferences.commit()
    }


    fun getURL(): String {
        var savedURL = mAdvancedPreferences[PREF_URL_SELECTED, String()]
        if (savedURL == null) savedURL = BuildConfig.API_URL
        return savedURL
    }

    companion object {
        const val PREF_URL_SELECTED = "pref_URL_selected"
    }
}