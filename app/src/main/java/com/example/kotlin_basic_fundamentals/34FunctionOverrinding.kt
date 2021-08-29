package com.example.kotlin_basic_fundamentals

fun main() {
    val ob = Examples()
    println("Sum is ${ob.sum(2, 5)}")
    println("Mul is ${ob.disply(2, 5)}")
}

abstract class demo() {
    abstract fun disply(c: Int, d: Int): Int
}

class Examples : demo() {
    fun sum(a: Int, b: Int): Int {
        return (a + b)
    }

    override fun disply(c: Int, d: Int): Int {
        return c * d
    }


}