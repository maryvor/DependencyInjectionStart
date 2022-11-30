package com.example.dependencyinjectionstart.example2.di

import android.app.Application
import dagger.Module
import dagger.Provides

@Module
class ContextModule(private val context: Application) {

    @Provides
    fun provideContext(): Application {
        return context
    }
}