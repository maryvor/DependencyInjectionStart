package com.example.dependencyinjectionstart.example2.data

import javax.inject.Inject

class ExampleLocalDataSourceImpl @Inject constructor(
    private val
    database: ExampleDatabase
) : ExampleLocalDataSource {

    override fun method() {
        database.method()
    }
}
