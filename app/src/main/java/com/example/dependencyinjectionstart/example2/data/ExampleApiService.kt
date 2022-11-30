package com.example.dependencyinjectionstart.example2.data

import android.app.Application
import android.util.Log
import com.example.dependencyinjectionstart.R
import javax.inject.Inject

class ExampleApiService @Inject constructor(private val context: Application) {

    fun method() {
        Log.d(LOG_TAG, "ExampleApiService ${context.resources.getString(R.string.app_name)}")
    }

    companion object {

        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
