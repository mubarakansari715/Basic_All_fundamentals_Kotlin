package com.example.kotlin_basic_fundamentals

/* inline used to save memory at runtime and increase the performance of our application.*/

fun main() {
    time { loop(50000) }
}

inline fun time(fm: () -> Unit) {
    val start = System.currentTimeMillis()
    fm()
    val end = System.currentTimeMillis()
    println(end - start)
}

fun loop(n: Long) {
    for (n in 1..n) {

    }
}