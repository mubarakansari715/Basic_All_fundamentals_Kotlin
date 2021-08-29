package com.example.kotlin_basic_fundamentals

import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

private val scope = CoroutineScope(Dispatchers.Default + CoroutineName("Ansari"))

fun main() {
    scope.launch(Dispatchers.IO + CoroutineName("Mubarak")) {
//        println("$this")
//        println("${coroutineContext.get(CoroutineName.Key)}")
        println("Launch start")
        delay(300)
        println("Launch Complete")

        launch(CoroutineName("Happy")) {
            println("C2 -- ${coroutineContext.get(CoroutineName.Key)}")
            launch {
                println("C3 -- ${coroutineContext.get(CoroutineName.Key)}")
            }
        }
    }
    Thread.sleep(1000)
    onDistroy()
}

fun onDistroy() {
    println("Canceling Scope")
    scope.cancel()

}