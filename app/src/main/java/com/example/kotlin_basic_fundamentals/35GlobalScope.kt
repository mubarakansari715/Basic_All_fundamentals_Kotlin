package com.example.kotlin_basic_fundamentals

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    println("main Start")

    //launch is used fire and forget
    GlobalScope.launch {
        println("Task Start")
        delay(500)
        println("Task End")
    }
    Thread.sleep(1000)

    println("main End")
}