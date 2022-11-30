package com.example.dependencyinjectionstart.example2.di

import com.example.dependencyinjectionstart.example2.data.ExampleLocalDataSource
import com.example.dependencyinjectionstart.example2.data.ExampleLocalDataSourceImpl
import com.example.dependencyinjectionstart.example2.data.ExampleRemoteDataSource
import com.example.dependencyinjectionstart.example2.data.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @Binds
    fun bindExampleDataBase(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @Binds
    fun bindExampleRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

}