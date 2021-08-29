package com.example.kotlin_basic_fundamentals
/*
==> The Lambda function is similar to an anonymous function.
==> A Lambda expression can be treated as a variable.
    It means, we can pass it as arguments to functions, return it from functions etc.
 */
fun main() {
    val lambda = { a: Int, b: Int -> a + b }
    println(lambda(5, 5))
    val lambda1: (Int, Int) -> Int = { a, b -> a + b }
    println(lambda1(2, 2))
    val lambda2: (Int) -> (Int) = { it * it }
    println(lambda2(5))
    println(lambda2(5))

}