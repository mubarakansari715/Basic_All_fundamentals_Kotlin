package com.example.kotlin_basic_fundamentals

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    val res = mutableListOf<String>()

    val job1 = async {
        return@async networkRequest(1)
    }
    val job2 = async {
        return@async networkRequest(2)
    }

    res.add(job1.await())
    res.add(job2.await())

    println("Result : $res")
    println("runBlock Completed")

}

suspend fun networkRequest(number: Int): String {
    println("network $number Start")
    delay(500)
    return ("network $number End")
}