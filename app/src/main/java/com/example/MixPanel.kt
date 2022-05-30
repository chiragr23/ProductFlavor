package com.example

import android.util.Log

class MixPanel : Analytics {
    override fun trackEvent() {
        Log.e("== Track Event","Mix Panel")
    }
}