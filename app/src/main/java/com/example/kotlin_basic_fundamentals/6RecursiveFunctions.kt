package com.example.kotlin_basic_fundamentals

fun main() {
    println(fact(5))
}

fun fact(n: Int): Int {
    if (n == 1)
        return 1
    return n * fact(n - 1)
}