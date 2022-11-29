package com.example.dependencyinjectionstart.example1

import dagger.Component

@Component
interface NewComponent {

    fun getKeyboard(): Keyboard

    fun getMouse(): Mouse

    fun getMonitor(): Monitor

    fun getComputer(): Computer

    fun inject(activity: Activity)
}
