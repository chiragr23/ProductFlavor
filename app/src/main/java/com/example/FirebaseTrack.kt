package com.example

import android.util.Log

class FirebaseTrack : Analytics {
    override fun trackEvent() {
        Log.e("== Track Event","Firebase")
    }
}