package com.example.dependencyinjectionstart.example2.di

import android.app.Application
import com.example.dependencyinjectionstart.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DataModule::class, DomainModule::class])
interface AppComponent {

    fun inject(activity: MainActivity)

//    @Component.Builder
//    interface ApplicationComponentBuilder {
//
//        @BindsInstance
//        fun context(context: Application): ApplicationComponentBuilder
//
//        @BindsInstance
//        fun timeMillis(timeMillis: Long): ApplicationComponentBuilder
//
//        fun build(): AppComponent
//    }

    @Component.Factory
    interface ApplicationFactory {
        fun create(
            @BindsInstance context: Application,
            @BindsInstance timeMillis: Long
        ): AppComponent
    }


}