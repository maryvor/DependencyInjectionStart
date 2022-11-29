package com.example.dependencyinjectionstart.example1

import javax.inject.Inject

class Activity {
    //First method
//    @Inject
//    lateinit var computer: Computer
//    @Inject
//    lateinit var keyboard: Keyboard
//    @Inject
//    lateinit var mouse: Mouse
//    @Inject
//    lateinit var monitor: Monitor
//
//    init {
//        DaggerNewComponent.create().inject(this)
//    }

    //Second method

    val keyboard = DaggerNewComponent.create().getKeyboard()
    val mouse = DaggerNewComponent.create().getMouse()
    val monitor = DaggerNewComponent.create().getMonitor()
    val computer = DaggerNewComponent.create().getComputer()
}