package com.example.dependencyinjectionstart.example2.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.dependencyinjectionstart.example2.presentation.ExampleViewModel
import com.example.dependencyinjectionstart.example2.presentation.ExampleViewModel2
import com.example.dependencyinjectionstart.example2.presentation.ViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
class ViewModelModule {
    @IntoMap
    @StringKey("ExampleViewModel2")
    @Provides
    fun bindViewModel2(impl: ExampleViewModel2): ViewModel {
        return impl
    }

    @IntoMap
    @StringKey("ExampleViewModel")
    @Provides
    fun bindViewModel(impl: ExampleViewModel): ViewModel {
        return impl
    }

    @Provides
    fun provideViewModelFactory(impl: ViewModelFactory): ViewModelProvider.Factory{
        return impl
    }
}