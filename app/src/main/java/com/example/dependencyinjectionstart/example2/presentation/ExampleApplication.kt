package com.example.dependencyinjectionstart.example2.presentation

import android.app.Application
import com.example.dependencyinjectionstart.example2.di.DaggerAppComponent

class ExampleApplication: Application() {

    val component by lazy {
        //with @Component.Builder
//        DaggerAppComponent.builder()
//            .context(application)
//            .timeMillis(Calendar.getInstance().timeInMillis)
//            .build()

        DaggerAppComponent.factory().create(this, System.currentTimeMillis())
    }
}