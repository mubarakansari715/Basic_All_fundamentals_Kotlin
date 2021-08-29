package com.example.kotlin_basic_fundamentals

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    val job = launch(start = CoroutineStart.LAZY) {
        println("Task Start")
        delay(500)
        println("Task End")
    }
    delay(300)

    job.start()
    //job.join()

    println("Coroutine end")

    //another way
    /* println("main Start")
     runBlocking {
         launch {
             println("Task Start")
             delay(500)
             println("Task End")
         }
     }
     println("main End")
     */

}
