package com.example.dependencyinjectionstart.example2.data

import android.app.Application
import android.util.Log
import com.example.dependencyinjectionstart.R
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ExampleApiService @Inject constructor(
    private val context: Application,
    private val timeMillis: Long
) {

    fun method() {
        Log.d(
            LOG_TAG,
            "ExampleApiService ${context.resources.getString(R.string.app_name)} time: $timeMillis $this"
        )
    }

    companion object {

        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
