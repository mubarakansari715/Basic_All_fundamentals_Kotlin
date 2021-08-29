package com.example.kotlin_basic_fundamentals

/*
A function which takes another function as an argument or returns a function is known as a higher order function.
Often lambda expressions are passed as an argument to a higher order function or returned from it.
An anonymous function can be used for the same also.
 */
fun main() {
    highOder(2, 2, ::sum)
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun highOder(a: Int, b: Int, fm: (Int, Int) -> Int) {
    var res = fm(a, b)
    println(res)
}