package com.global.apps.publisher.presentation

import android.app.Application
import android.util.Log

class App : Application() {
    companion object {
        const val TAG = "App"
    }

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "onCreate: $TAG")
    }
}