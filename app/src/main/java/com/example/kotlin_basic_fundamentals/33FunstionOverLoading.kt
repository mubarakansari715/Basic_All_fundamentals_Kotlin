package com.example.kotlin_basic_fundamentals

fun main() {
    val ob = Exaple()
    println("Sum is ${ob.sum(2, 5)}")
    println("Mul is ${ob.sum(2.0, 5.0)}")
}

class Exaple {
    fun sum(a: Int, b: Int): Int {
        return (a + b)
    }

    fun sum(a: Double, b: Double): Double {
        return (a * b)
    }
}
