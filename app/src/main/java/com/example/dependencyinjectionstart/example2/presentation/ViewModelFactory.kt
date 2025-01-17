package com.example.dependencyinjectionstart.example2.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.dependencyinjectionstart.example2.di.ApplicationScope
import com.example.dependencyinjectionstart.example2.domain.ExampleRepository
import com.example.dependencyinjectionstart.example2.domain.ExampleUseCase
import javax.inject.Inject
import javax.inject.Provider


@ApplicationScope
class ViewModelFactory @Inject constructor(
    private val repository: ExampleRepository,
    private val useCase: ExampleUseCase,
    //
    private val viewModelsProviders: @JvmSuppressWildcards Map<String, Provider<ViewModel>>
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        //return viewModelsProviders[modelClass.simpleName]?.get() as T
        if (modelClass == ExampleViewModel2::class.java) return ExampleViewModel2(repository) as T
        if (modelClass == ExampleViewModel::class.java) return ExampleViewModel(useCase) as T
        throw RuntimeException()
    }
}